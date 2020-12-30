package com.esime.pokedex.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.esime.pokedex.Models.abilities.Ability;
import com.esime.pokedex.Models.abilities.PokemonListHabiliy;
import com.esime.pokedex.R;

import java.util.ArrayList;

public class HabilidadesAdapter extends RecyclerView.Adapter<HabilidadesAdapter.ViewHolderAbilities> {

    ArrayList<PokemonListHabiliy> dataset;
    Context context;
    PokemonListHabiliy ability;

    public HabilidadesAdapter(Context context){
        dataset = new ArrayList<>();
        this.context = context;
    }

    @NonNull
    @Override
    public HabilidadesAdapter.ViewHolderAbilities onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_habilidad,parent,false);

        return  new ViewHolderAbilities(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HabilidadesAdapter.ViewHolderAbilities holder, int position) {
        ability = dataset.get(position);
        holder.tvHabilidad.setText(ability.getAbility().getName());


    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarListaHabilidades(ArrayList<PokemonListHabiliy> listHabilidadesPokemon) {
        dataset.addAll(listHabilidadesPokemon);
        notifyDataSetChanged();
    }

    public class ViewHolderAbilities extends RecyclerView.ViewHolder {
        private TextView tvHabilidad;


        public ViewHolderAbilities(@NonNull View itemView) {
            super(itemView);

            tvHabilidad = itemView.findViewById(R.id.textViewHabilidad);

        }
    }
}
