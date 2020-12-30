
package com.esime.pokedex.Models.Evolution;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PokemonEvolution {

    @SerializedName("baby_trigger_item")
    @Expose
    private Object babyTriggerItem;
    @SerializedName("chain")
    @Expose
    private Chain chain;
    @SerializedName("id")
    @Expose
    private Integer id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PokemonEvolution() {
    }

    /**
     * 
     * @param chain
     * @param babyTriggerItem
     * @param id
     */
    public PokemonEvolution(Object babyTriggerItem, Chain chain, Integer id) {
        super();
        this.babyTriggerItem = babyTriggerItem;
        this.chain = chain;
        this.id = id;
    }

    public Object getBabyTriggerItem() {
        return babyTriggerItem;
    }

    public void setBabyTriggerItem(Object babyTriggerItem) {
        this.babyTriggerItem = babyTriggerItem;
    }

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}


