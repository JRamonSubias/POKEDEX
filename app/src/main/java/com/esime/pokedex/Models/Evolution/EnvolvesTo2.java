
package com.esime.pokedex.Models.Evolution;

import java.util.List;

import com.esime.pokedex.Models.Species.Species;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EnvolvesTo2 {

    @SerializedName("evolution_details")
    @Expose
    private List<Object> evolutionDetails = null;
    @SerializedName("evolves_to")
    @Expose
    private List<Object> evolvesTo = null;
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
    public EnvolvesTo2() {
    }

    /**
     * 
     * @param isBaby
     * @param species
     * @param evolutionDetails
     * @param evolvesTo
     */
    public EnvolvesTo2(List<Object> evolutionDetails, List<Object> evolvesTo, Boolean isBaby, SpeciesEvolution species) {
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

    public List<Object> getEvolvesTo() {
        return evolvesTo;
    }

    public void setEvolvesTo(List<Object> evolvesTo) {
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
