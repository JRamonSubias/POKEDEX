
package com.esime.pokedex.Models.Response;

import java.util.ArrayList;
import java.util.List;

import com.esime.pokedex.Models.Pokemon;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PokemonResponse {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private ArrayList<Pokemon> results = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PokemonResponse() {
    }

    /**
     * 
     * @param next
     * @param previous
     * @param count
     * @param results
     */
    public PokemonResponse(Integer count, String next, Object previous, ArrayList<Pokemon> results) {
        super();
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public ArrayList<Pokemon> getPokemon() {
        return results;
    }

    public void setPokemon(ArrayList<Pokemon> results) {
        this.results = results;
    }

}
