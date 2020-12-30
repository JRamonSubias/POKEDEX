package com.esime.pokedex.UI;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.esime.pokedex.Models.Pokemon;
import com.esime.pokedex.R;


import com.esime.pokedex.common.Constantes;

import java.util.ArrayList;
import java.util.Collection;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder>  {
    private ArrayList<Pokemon> dataset;
    private ArrayList<Pokemon> pokemonFilter;
    private Pokemon p;
    private Context context;
    private View.OnLongClickListener longClickListener;
    FragmentManager fragmentManager;



    public PokemonAdapter(Context context, FragmentManager fragmentManager){
        dataset = new ArrayList<>();
        this.pokemonFilter = new ArrayList<>(dataset);
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @NonNull
    @Override
    public PokemonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_pokemon,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PokemonAdapter.ViewHolder holder, final int position) {
        p = dataset.get(position);
        //ANIMATION
            //CARDVIEW
            holder.cvPokemon.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_scale));
                //IMAGEVIEW
        holder.ivPokemon.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_transition_animation));

        holder.tvNamePokemon.setText(p.getName());
        Glide.with(context)
                .load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/"+Constantes.getStringNumber(p.getNumber())+".png")
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.ivPokemon);


        holder.cvPokemon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {


                int number = dataset.get(position).getNumber();
                String name = dataset.get(position).getName();

                SharedPreferences.Editor editor =  context.getSharedPreferences(Constantes.APP_SETTING_FILE,Context.MODE_PRIVATE).edit();
                editor.putInt(Constantes.NUMBER_POKEMON,number);
                editor.putString(Constantes.NAME_POKEMON,name);
                editor.commit();

                PokemonDescription pokemonDescription = new PokemonDescription();
                pokemonDescription.show(fragmentManager, "pokemonDescription");

                return true;


            }
        });
    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamePokemon;
        ImageView ivPokemon;
        CardView cvPokemon;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamePokemon = itemView.findViewById(R.id.textViewNamePokemon);
            ivPokemon = itemView.findViewById(R.id.imageViewPokemon);
            cvPokemon = itemView.findViewById(R.id.cardViewPokemon);


        }
    }

    public void adicionarListaPokemon(ArrayList<Pokemon> listaPokemon){
            dataset.addAll(listaPokemon);
            notifyDataSetChanged();
    }


    public void setFilter(ArrayList<Pokemon> listaPokemon){
        this.dataset = new ArrayList<>();
        dataset.addAll(listaPokemon);
        notifyDataSetChanged();
    }


}
