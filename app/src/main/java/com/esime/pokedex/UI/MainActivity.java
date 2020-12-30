package com.esime.pokedex.UI;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SearchEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.Toast;

import com.esime.pokedex.Models.Pokemon;
import com.esime.pokedex.Models.Response.PokemonResponse;
import com.esime.pokedex.PokeApi.PokemonClient;
import com.esime.pokedex.PokeApi.PokemonService;
import com.esime.pokedex.R;
import com.esime.pokedex.common.Constantes;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private PokemonClient pokemonClient;
    private PokemonService pokemonService;

    private RecyclerView recyclerView;
    private EditText etBuscador;
    private PokemonAdapter pokemonAdapter;

    private int offset;
    private boolean aptoParaCargar;
    ArrayList<Pokemon> listPokemon;

    SwipeRefreshLayout refreshLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();
        getSupportActionBar().getHeight();

        recyclerView = findViewById(R.id.RecyclerViewPokemon);
        refreshLayout = findViewById(R.id.swipeRefreshLayout);
        refreshLayout.setColorSchemeColors(getResources().getColor(R.color.colorPrimaryDark,null));
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout.setRefreshing(true);
                getData(offset);

            }
        });


        pokemonAdapter = new PokemonAdapter(this,getSupportFragmentManager());
        recyclerView.setAdapter(pokemonAdapter);
        recyclerView.setHasFixedSize(true);

        final GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);


        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if(dy > 0){
                    int visibleItemCount = layoutManager.getChildCount();
                    int totalItemCount = layoutManager.getItemCount();
                    int pastVisibleItems = layoutManager.findFirstCompletelyVisibleItemPosition();

                    if(aptoParaCargar){
                        if ((visibleItemCount + pastVisibleItems)>= totalItemCount){
                            Log.i(Constantes.TAG, "Llegamos al final");
                            aptoParaCargar = false;
                            offset+=150;
                            getData(offset);
                        }
                    }
                }
            }
        });

        retrofitInit();
        aptoParaCargar=true;
        offset=0;
        getData(offset);



    }

    private void getData(int offset) {
        Call<PokemonResponse> pokemonResponseCall = pokemonService.getListPokemon(offset,150);
        pokemonResponseCall.enqueue(new Callback<PokemonResponse>() {
            @Override
            public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response) {
                aptoParaCargar=true;
                if(response.isSuccessful()){
                    PokemonResponse pokemonResponse = response.body();
                     listPokemon = pokemonResponse.getPokemon();
                    pokemonAdapter.adicionarListaPokemon(listPokemon);

                    for (int i=0; i<listPokemon.size(); i++){
                        Log.i(Constantes.TAG, listPokemon.get(i).getName());
                    }
                }else{
                    Log.e(Constantes.TAG,"on response "+ response.errorBody());
                    Toast.makeText(MainActivity.this, "Algo salio mal", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Call<PokemonResponse> call, Throwable t) {
                aptoParaCargar=true;
                Log.e(Constantes.TAG,"on failure "+ t.getMessage());
                Toast.makeText(MainActivity.this, "ERROR COnexion", Toast.LENGTH_SHORT).show();
            }
        });
        refreshLayout.setRefreshing(false);
    }

    private void retrofitInit() {
        pokemonClient = PokemonClient.getInstance();
        pokemonService = pokemonClient.getPokemonService();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) searchItem.getActionView();
        //permite modificar el hint que el EditText muestra por defecto
        searchView.setQueryHint(getText(R.string.buscador));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(MainActivity.this, "Buscando...", Toast.LENGTH_SHORT).show();
                //Se oculta el EditText
                searchView.setQuery("",false);
                searchView.setIconified(true);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<Pokemon> listaFiltrada = filter(listPokemon,newText);
                pokemonAdapter.setFilter(listaFiltrada);
                return false;
            }
        });

        searchItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {

                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                pokemonAdapter.setFilter(listPokemon);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    private ArrayList<Pokemon> filter (ArrayList<Pokemon> pokemons,String texto){
               ArrayList<Pokemon> listaFiltrada = new ArrayList<>();
                    try {
                        texto = texto.toLowerCase();
                        for(Pokemon pokemon: pokemons){
                            String pokemon2 = pokemon.getName().toLowerCase();
                            if(pokemon2.contains(texto)){
                                listaFiltrada.add(pokemon);
                            }
                        }

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                return listaFiltrada;
            }


}
