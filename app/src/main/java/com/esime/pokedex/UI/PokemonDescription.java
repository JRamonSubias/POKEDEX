package com.esime.pokedex.UI;

import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.esime.pokedex.Models.Evolution.Chain;
import com.esime.pokedex.Models.Evolution.EnvolvesTo;
import com.esime.pokedex.Models.Evolution.PokemonEvolution;
import com.esime.pokedex.Models.Evolution.SpeciesEvolution;
import com.esime.pokedex.Models.Response.PokemonDescriptionResponse;
import com.esime.pokedex.Models.Response.SpeciesResponse;
import com.esime.pokedex.Models.Species.EvolutionChain;
import com.esime.pokedex.Models.Species.Species;
import com.esime.pokedex.Models.Type.PokemonListType;
import com.esime.pokedex.Models.abilities.PokemonListHabiliy;
import com.esime.pokedex.PokeApi.PokemonClient;
import com.esime.pokedex.PokeApi.PokemonService;
import com.esime.pokedex.R;
import com.esime.pokedex.common.Constantes;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.app.DialogFragment.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class PokemonDescription extends androidx.fragment.app.DialogFragment {
    private View view;
    private TextView tvNamePokemon, tvIdPokemon, tvEvoluciones;
    private ImageView ivPokemon, ivEvolutionMenor, ivEvolutionMedia, ivEvolutionMayor;


    private PokemonService pokemonService;
    private PokemonClient pokemonClient;

    PokemonDescriptionResponse pokemonDescriptionResponse;
    Chain chain;
    EnvolvesTo envolves;
    EnvolvesTo envolvesMayor;

    SpeciesEvolution evolutionMenor;
    SpeciesEvolution evolutionMedia;
    SpeciesEvolution evolutionMayor;

    ArrayList<PokemonListHabiliy> listHabilidadesPokemon;
    ArrayList<PokemonListType> listaTypesPokemon;

    RecyclerView recyclerViewHabilidades, recyclerViewTypes;
    HabilidadesAdapter habilidadesAdapter;
    TypesAdapter typesAdapter;

    private int number ;
    public int numberEvolution;
    private int numberEvolutionMenor;
    private int numberEvolutionMayor;
    private int numberEvolutionMedia;

    String name;

    public PokemonDescription() {


    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(androidx.fragment.app.DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_pokemon_description, container, false);
        retroIniti();

        recyclerViewHabilidades = view.findViewById(R.id.RecyclerViewHabilidades);
        habilidadesAdapter = new HabilidadesAdapter(getContext());
        recyclerViewHabilidades.setAdapter(habilidadesAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerViewHabilidades.setLayoutManager(layoutManager);

        recyclerViewTypes = view.findViewById(R.id.recyclerViewTypes);
        typesAdapter = new TypesAdapter(getContext());
        recyclerViewTypes.setAdapter(typesAdapter);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getContext());
        recyclerViewTypes.setLayoutManager(layoutManager2);

        tvNamePokemon = view.findViewById(R.id.textViewNameDescription);
        tvIdPokemon = view.findViewById(R.id.textViewIdPokemon);
        tvEvoluciones = view.findViewById(R.id.textViewEvoluciones);

        ivPokemon = view.findViewById(R.id.imageViewPokemonDescription);
        ivEvolutionMenor = view.findViewById(R.id.imageViewEvolucionMenor);
        ivEvolutionMedia = view.findViewById(R.id.imageViewEvolutionMedia);
        ivEvolutionMayor = view.findViewById(R.id.imageViewEvolutionMayor);

        number = getActivity().getSharedPreferences(Constantes.APP_SETTING_FILE,Context.MODE_PRIVATE).getInt(Constantes.NUMBER_POKEMON,1);
        tvIdPokemon.setText("N.°"+Constantes.getStringNumber(number));

        name = getActivity().getSharedPreferences(Constantes.APP_SETTING_FILE,Context.MODE_PRIVATE).getString(Constantes.NAME_POKEMON,"Sin nombre");


        getData();
        getSpeciesData();



        return view;
    }

    private void whithoutEvolution() {
        tvEvoluciones.setText("Sin Evoluciones");
        ivEvolutionMenor.setVisibility(View.INVISIBLE);
        Glide.with(getContext())
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vi/omegaruby-alphasapphire/" + numberEvolutionMenor + ".png")
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(ivEvolutionMedia);
    }

    private void getEvolutionData() {
        Call<PokemonEvolution> evolutionCall = pokemonService.getEvolutionPokemon(numberEvolution);
        evolutionCall.enqueue(new Callback<PokemonEvolution>() {
            @Override
            public void onResponse(Call<PokemonEvolution> call, Response<PokemonEvolution> response) {
                if (response.isSuccessful()){
                    PokemonEvolution  pokemonEvolution = response.body();
                    chain = pokemonEvolution.getChain();
                    evolutionMenor = chain.getSpecies();
                     numberEvolutionMenor = Constantes.getNumberUrl(evolutionMenor.getUrl());

                    Glide.with(getContext())
                            .load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/"+Constantes.getStringNumber(numberEvolutionMenor)+".png")
                            .centerCrop()
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .into(ivEvolutionMenor);

                    if(chain.getEvolvesTo().size()==0) {
                        whithoutEvolution();
                    }else {
                        envolves = chain.getEvolvesTo().get(0);
                        evolutionMedia = envolves.getSpecies();
                        numberEvolutionMedia = Constantes.getNumberUrl(evolutionMedia.getUrl());

                        Glide.with(getContext())
                                .load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/"+Constantes.getStringNumber(numberEvolutionMedia) + ".png")
                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                                .into(ivEvolutionMedia);


                        if (envolves.getEvolvesTo().size() == 0) {
                            whithoutEvolutionMayor();
                        } else {
                            envolvesMayor = envolves.getEvolvesTo().get(0);
                            evolutionMayor = envolvesMayor.getSpecies();
                             numberEvolutionMayor = Constantes.getNumberUrl(evolutionMayor.getUrl());

                            Glide.with(getContext())
                                    .load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/"+Constantes.getStringNumber(numberEvolutionMayor) + ".png")
                                    .centerCrop()
                                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                                    .into(ivEvolutionMayor);
                        }
                    }

                }else{
                    Toast.makeText(getContext(), "Algo salio mal: EVOLUTION", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<PokemonEvolution> call, Throwable t) {
                Toast.makeText(getContext(), "Error Conexion: EVOLUTION", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void whithoutEvolutionMayor() {
    }

    private void getSpeciesData() {
        Call<SpeciesResponse> speciesResponseCall= pokemonService.getSpeciesPokemon(number);
        speciesResponseCall.enqueue(new Callback<SpeciesResponse>() {
            @Override
            public void onResponse(Call<SpeciesResponse> call, Response<SpeciesResponse> response) {
                if(response.isSuccessful()){
                    SpeciesResponse speciesResponse = response.body();
                    EvolutionChain evolutionChain = speciesResponse.getChain();
                    numberEvolution = Constantes.getNumberUrl(evolutionChain.getUrl());
                    if (numberEvolution == 0){
                        whithoutEvolution();
                    }else{
                        getEvolutionData();
                    }
                }else{
                    Toast.makeText(getContext(), "Algo Salio Mal :SPECIES", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SpeciesResponse> call, Throwable t) {
                Toast.makeText(getContext(), "ErrorConexion: SPECIES", Toast.LENGTH_SHORT).show();

            }
        });

    }


    private void getData() {
        final Call<PokemonDescriptionResponse> responseCall = pokemonService.getListAbilitiesPokemon(number);
        responseCall.enqueue(new Callback<PokemonDescriptionResponse>() {
            @Override
            public void onResponse(Call<PokemonDescriptionResponse> call, Response<PokemonDescriptionResponse> response) {
                if(response.isSuccessful()){
                    pokemonDescriptionResponse = response.body();

                    listHabilidadesPokemon = pokemonDescriptionResponse.getAbilities();
                    habilidadesAdapter.adicionarListaHabilidades(listHabilidadesPokemon);


                     listaTypesPokemon = pokemonDescriptionResponse.getTypes();
                     typesAdapter.adicionarListaTipes(listaTypesPokemon);

                    tvNamePokemon.setText(name);

                    Glide.with(getContext())
                            .load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/"+Constantes.getStringNumber(number)+".png")
                            .centerCrop()
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .into(ivPokemon);
                }
                else
                {
                    Toast.makeText(getContext(), "Algo salio mal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<PokemonDescriptionResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Error de Conexion", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void retroIniti() {
        pokemonClient = PokemonClient.getInstance();
        pokemonService = pokemonClient.getPokemonService();
    }


}
