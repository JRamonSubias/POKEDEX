package com.esime.pokedex.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.esime.pokedex.Models.Type.PokemonListType;
import com.esime.pokedex.Models.Type.TypePokemon;
import com.esime.pokedex.R;
import com.esime.pokedex.common.Constantes;

import java.util.ArrayList;

public class TypesAdapter extends RecyclerView.Adapter<TypesAdapter.ViewHolderTypes> {

    ArrayList<PokemonListType> dataset;
    Context context;
    PokemonListType type;


    public TypesAdapter(Context context){
        dataset = new ArrayList<PokemonListType>();
        this.context = context;
    }

    @NonNull
    @Override
    public TypesAdapter.ViewHolderTypes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_types,parent,false);
        return new ViewHolderTypes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypesAdapter.ViewHolderTypes holder, int position) {
        type = dataset.get(position);
        String tipo1 = type.getType().getName();
        String url = Constantes.getTypePokemon(tipo1);



        Glide.with(context)
                .load(url)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.ivType);






    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarListaTipes(ArrayList<PokemonListType> listTypes) {
        dataset.addAll(listTypes);
        notifyDataSetChanged();

    }

    public class ViewHolderTypes extends RecyclerView.ViewHolder {

        private ImageView ivType;

        public ViewHolderTypes(@NonNull View itemView) {
            super(itemView);


            ivType = itemView.findViewById(R.id.imageViewType);


        }
    }



}
