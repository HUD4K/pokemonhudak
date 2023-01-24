package com.hudak.pokemonhdk4.net;

import com.hudak.pokemonhdk4.net.obj.Pokemon;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonService {

    @GET("api/v2/pokemon/{pokemon}")
    Call<Pokemon> getPokemonDetail(@Path("pokemon") String pokemonName);
}
