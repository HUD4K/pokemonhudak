package com.hudak.pokemonhdk4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link page2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class page2 extends Fragment {
    private TextView zoznamMien;
    private SharedPreferences sharedPreferences;
    private int pocet;
    private String storageKey;
    private String value;
    private String mennyZoznam = "";
    private Button odoslat;


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public page2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment page2.
     */

    public static page2 newInstance(String param1, String param2) {
        page2 fragment = new page2();
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
        View view = inflater.inflate(R.layout.fragment_page2, container, false);

        View prvyFr = inflater.inflate(R.layout.fragment_page1, container, false);
        odoslat = prvyFr.findViewById(R.id.chooseBtn);

        zoznamMien = view.findViewById(R.id.zoznam);

        Map<String, ?> allEntries = sharedPreferences.getAll();
        pocet = allEntries.entrySet().size();

        if(pocet != 0){
            for(int i = 1; i <= pocet; i++){
                storageKey = String.valueOf(i);
                value = sharedPreferences.getString(storageKey, "defaultValue");
                mennyZoznam = value + "\n" + mennyZoznam;
            }
            zoznamMien.setText(mennyZoznam);
        }
        return view;
    }
}