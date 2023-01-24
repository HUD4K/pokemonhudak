package com.hudak.pokemonhdk4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.hudak.pokemonhdk4.net.PokemonService;
import com.hudak.pokemonhdk4.net.obj.Pokemon;
import android.content.Context;
import java.util.Locale;
import java.util.Map;

import android.content.SharedPreferences;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link page1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class page1 extends Fragment {

    private TextView meno;
    private ImageView fotka;
    private EditText input;
    private Button odoslat;
    private TextView typ;
    private SharedPreferences sharedPreferences;
    private int pocet;
    private String menostring;
    private String storageKey;


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public page1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment page1.
     */

    public static page1 newInstance(String param1, String param2) {
        page1 fragment = new page1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        sharedPreferences = getActivity().getSharedPreferences("preferencespokemon", Context.MODE_PRIVATE);
        View view = inflater.inflate(R.layout.fragment_page1, container, false);

        meno = view.findViewById(R.id.pokemonName);
        fotka = view.findViewById(R.id.pokemonImage);
        input = view.findViewById(R.id.inputName);
        odoslat = view.findViewById(R.id.chooseBtn);
        typ = view.findViewById(R.id.pokemonType);

        odoslat.setOnClickListener(v ->{
            String menoPokemona = input.getText().toString().toLowerCase();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://pokeapi.co")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            PokemonService service = retrofit.create(PokemonService.class);

            service.getPokemonDetail(menoPokemona).enqueue(new Callback<Pokemon>() {
                @Override
                public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                    if(response.isSuccessful()){
                        Log.e("Moja appka: ", "priponie uspesne");
                        Pokemon pokemon = response.body();

                        menostring = pokemon.getName().toUpperCase();

                        meno.setText(menostring);
                        typ.setText(pokemon.getAbilities().get(0).getAbility().getName());
                        Glide.with(page1.this)
                                .load(pokemon.getSprites().getOther().getOfficialArtwork().getFrontDefault())
                                .into(fotka);

                        //< STORAGE>
                        Map<String, ?> allEntries = sharedPreferences.getAll();
                        pocet = allEntries.entrySet().size();
                        storageKey = String.valueOf(pocet+1);

                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString(storageKey, menostring);
                        editor.apply();
                        //</STORAGE>

                    } else{
                        Log.e("APP Error - ", ""+response.code());
                    }
                }

                @Override
                public void onFailure(Call<Pokemon> call, Throwable t) {
                    Log.e("APP Error - ", "zlyhalo pripojenie na server");
                }
            });
        });

        return view;
    }
}