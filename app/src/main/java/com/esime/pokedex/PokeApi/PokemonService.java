package com.esime.pokedex.PokeApi;

import com.esime.pokedex.Models.Evolution.PokemonEvolution;
import com.esime.pokedex.Models.Response.PokemonDescriptionResponse;
import com.esime.pokedex.Models.Response.PokemonResponse;
import com.esime.pokedex.Models.Response.SpeciesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonService {

@GET("pokemon")
    Call<PokemonResponse> getListPokemon(@Query("offset")int offset, @Query("limit")int limit);


@GET("pokemon/{id}")
    Call<PokemonDescriptionResponse> getListAbilitiesPokemon(@Path("id") int idPokemon);

@GET("evolution-chain/{idEvolution}")
    Call<PokemonEvolution> getEvolutionPokemon(@Path("idEvolution") int idEvolution);

@GET("pokemon-species/{idSpecies}")
    Call<SpeciesResponse> getSpeciesPokemon (@Path("idSpecies") int idSpecies);


}
