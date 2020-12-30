package com.esime.pokedex.PokeApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokemonClient {
    private static PokemonClient instance = null;
    private PokemonService pokemonService;
    private Retrofit retrofit;

    public PokemonClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        pokemonService = retrofit.create(PokemonService.class);
    }

    //Patrong Singleton
    public static PokemonClient getInstance(){
        if(instance == null){
            instance = new PokemonClient();
        }
        return instance;
    }

    public PokemonService getPokemonService(){
        return pokemonService;
    }
}
