
package com.esime.pokedex.Models.abilities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PokemonListHabiliy {

    @SerializedName("ability")
    @Expose
    private Ability ability;
    @SerializedName("is_hidden")
    @Expose
    private Boolean isHidden;
    @SerializedName("slot")
    @Expose
    private Integer slot;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PokemonListHabiliy() {
    }

    /**
     * 
     * @param ability
     * @param slot
     * @param isHidden
     */
    public PokemonListHabiliy(Ability ability, Boolean isHidden, Integer slot) {
        super();
        this.ability = ability;
        this.isHidden = isHidden;
        this.slot = slot;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

}
