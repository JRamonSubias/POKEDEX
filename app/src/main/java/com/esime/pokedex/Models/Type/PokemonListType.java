
package com.esime.pokedex.Models.Type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PokemonListType{

    @SerializedName("slot")
    @Expose
    private Integer slot;
    @SerializedName("type")
    @Expose
    private TypePokemon type;

    /**
     * No args constructor for use in serialization
     *
     */
    public PokemonListType() {
    }

    /**
     *
     * @param slot
     * @param type
     */
    public PokemonListType(Integer slot, TypePokemon type) {
        super();
        this.slot = slot;
        this.type = type;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public TypePokemon getType() {
        return type;
    }

    public void setType(TypePokemon type) {
        this.type = type;
    }

}