
package com.esime.pokedex.Models.Evolution;

import java.util.ArrayList;
import java.util.List;

import com.esime.pokedex.Models.Species.Species;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chain {

    @SerializedName("evolution_details")
    @Expose
    private List<Object> evolutionDetails = null;
    @SerializedName("evolves_to")
    @Expose
    private ArrayList<EnvolvesTo> evolvesTo = null;
    @SerializedName("is_baby")
    @Expose
    private Boolean isBaby;
    @SerializedName("species")
    @Expose
    private SpeciesEvolution species;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Chain() {
    }

    /**
     * 
     * @param isBaby
     * @param species
     * @param evolutionDetails
     * @param evolvesTo
     */
    public Chain(List<Object> evolutionDetails, ArrayList<EnvolvesTo> evolvesTo, Boolean isBaby, SpeciesEvolution species) {
        super();
        this.evolutionDetails = evolutionDetails;
        this.evolvesTo = evolvesTo;
        this.isBaby = isBaby;
        this.species = species;
    }

    public List<Object> getEvolutionDetails() {
        return evolutionDetails;
    }

    public void setEvolutionDetails(List<Object> evolutionDetails) {
        this.evolutionDetails = evolutionDetails;
    }

    public ArrayList<EnvolvesTo> getEvolvesTo() {
        return evolvesTo;
    }

    public void setEvolvesTo(ArrayList<EnvolvesTo> evolvesTo) {
        this.evolvesTo = evolvesTo;
    }

    public Boolean getIsBaby() {
        return isBaby;
    }

    public void setIsBaby(Boolean isBaby) {
        this.isBaby = isBaby;
    }

    public SpeciesEvolution getSpecies() {
        return species;
    }

    public void setSpecies(SpeciesEvolution species) {
        this.species = species;
    }

}
