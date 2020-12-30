
package com.esime.pokedex.Models.Response;

import java.util.List;

import com.esime.pokedex.Models.Evolution.Chain;
import com.esime.pokedex.Models.Species.EvolutionChain;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpeciesResponse {

    @SerializedName("base_happiness")
    @Expose
    private Integer baseHappiness;
    @SerializedName("capture_rate")
    @Expose
    private Integer captureRate;
    @SerializedName("color")
    @Expose
    private Color color;
    @SerializedName("egg_groups")
    @Expose
    private List<Object> eggGroups = null;
    @SerializedName("evolution_chain")
    @Expose
    private EvolutionChain chain;
    @SerializedName("evolves_from_species")
    @Expose
    private EvolvesFromSpecies evolvesFromSpecies;
    @SerializedName("flavor_text_entries")
    @Expose
    private List<Object> flavorTextEntries = null;
    @SerializedName("form_descriptions")
    @Expose
    private List<Object> formDescriptions = null;
    @SerializedName("forms_switchable")
    @Expose
    private Boolean formsSwitchable;
    @SerializedName("gender_rate")
    @Expose
    private Integer genderRate;
    @SerializedName("genera")
    @Expose
    private List<Object> genera = null;
    @SerializedName("generation")
    @Expose
    private Generation generation;
    @SerializedName("growth_rate")
    @Expose
    private GrowthRate growthRate;
    @SerializedName("habitat")
    @Expose
    private Habitat habitat;
    @SerializedName("has_gender_differences")
    @Expose
    private Boolean hasGenderDifferences;
    @SerializedName("hatch_counter")
    @Expose
    private Integer hatchCounter;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_baby")
    @Expose
    private Boolean isBaby;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("names")
    @Expose
    private List<Object> names = null;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("pal_park_encounters")
    @Expose
    private List<Object> palParkEncounters = null;
    @SerializedName("pokedex_numbers")
    @Expose
    private List<Object> pokedexNumbers = null;
    @SerializedName("shape")
    @Expose
    private Shape shape;
    @SerializedName("varieties")
    @Expose
    private List<Object> varieties = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SpeciesResponse() {
    }

    /**
     * 
     * @param isBaby
     * @param genera
     * @param genderRate
     * @param habitat
     * @param color
     * @param baseHappiness
     * @param pokedexNumbers
     * @param growthRate
     * @param hatchCounter
     * @param formDescriptions
     * @param evolvesFromSpecies
     * @param flavorTextEntries
     * @param id
     * @param order
     * @param generation
     * @param eggGroups
     * @param shape
     * @param hasGenderDifferences
     * @param formsSwitchable
     * @param palParkEncounters
     * @param captureRate
     * @param names
     * @param varieties
     * @param name
     * @param chain
     */
    public SpeciesResponse(Integer baseHappiness, Integer captureRate, Color color, List<Object> eggGroups, EvolutionChain chain, EvolvesFromSpecies evolvesFromSpecies, List<Object> flavorTextEntries, List<Object> formDescriptions, Boolean formsSwitchable, Integer genderRate, List<Object> genera, Generation generation, GrowthRate growthRate, Habitat habitat, Boolean hasGenderDifferences, Integer hatchCounter, Integer id, Boolean isBaby, String name, List<Object> names, Integer order, List<Object> palParkEncounters, List<Object> pokedexNumbers, Shape shape, List<Object> varieties) {
        super();
        this.baseHappiness = baseHappiness;
        this.captureRate = captureRate;
        this.color = color;
        this.eggGroups = eggGroups;
        this.chain = chain;
        this.evolvesFromSpecies = evolvesFromSpecies;
        this.flavorTextEntries = flavorTextEntries;
        this.formDescriptions = formDescriptions;
        this.formsSwitchable = formsSwitchable;
        this.genderRate = genderRate;
        this.genera = genera;
        this.generation = generation;
        this.growthRate = growthRate;
        this.habitat = habitat;
        this.hasGenderDifferences = hasGenderDifferences;
        this.hatchCounter = hatchCounter;
        this.id = id;
        this.isBaby = isBaby;
        this.name = name;
        this.names = names;
        this.order = order;
        this.palParkEncounters = palParkEncounters;
        this.pokedexNumbers = pokedexNumbers;
        this.shape = shape;
        this.varieties = varieties;
    }

    public Integer getBaseHappiness() {
        return baseHappiness;
    }

    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }

    public Integer getCaptureRate() {
        return captureRate;
    }

    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<Object> getEggGroups() {
        return eggGroups;
    }

    public void setEggGroups(List<Object> eggGroups) {
        this.eggGroups = eggGroups;
    }

    public EvolutionChain getChain() {
        return chain;
    }

    public void setChain(EvolutionChain chain) {
        this.chain = chain;
    }

    public EvolvesFromSpecies getEvolvesFromSpecies() {
        return evolvesFromSpecies;
    }

    public void setEvolvesFromSpecies(EvolvesFromSpecies evolvesFromSpecies) {
        this.evolvesFromSpecies = evolvesFromSpecies;
    }

    public List<Object> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<Object> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    public List<Object> getFormDescriptions() {
        return formDescriptions;
    }

    public void setFormDescriptions(List<Object> formDescriptions) {
        this.formDescriptions = formDescriptions;
    }

    public Boolean getFormsSwitchable() {
        return formsSwitchable;
    }

    public void setFormsSwitchable(Boolean formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
    }

    public Integer getGenderRate() {
        return genderRate;
    }

    public void setGenderRate(Integer genderRate) {
        this.genderRate = genderRate;
    }

    public List<Object> getGenera() {
        return genera;
    }

    public void setGenera(List<Object> genera) {
        this.genera = genera;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public GrowthRate getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(GrowthRate growthRate) {
        this.growthRate = growthRate;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Boolean getHasGenderDifferences() {
        return hasGenderDifferences;
    }

    public void setHasGenderDifferences(Boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    public Integer getHatchCounter() {
        return hatchCounter;
    }

    public void setHatchCounter(Integer hatchCounter) {
        this.hatchCounter = hatchCounter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsBaby() {
        return isBaby;
    }

    public void setIsBaby(Boolean isBaby) {
        this.isBaby = isBaby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getNames() {
        return names;
    }

    public void setNames(List<Object> names) {
        this.names = names;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<Object> getPalParkEncounters() {
        return palParkEncounters;
    }

    public void setPalParkEncounters(List<Object> palParkEncounters) {
        this.palParkEncounters = palParkEncounters;
    }

    public List<Object> getPokedexNumbers() {
        return pokedexNumbers;
    }

    public void setPokedexNumbers(List<Object> pokedexNumbers) {
        this.pokedexNumbers = pokedexNumbers;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public List<Object> getVarieties() {
        return varieties;
    }

    public void setVarieties(List<Object> varieties) {
        this.varieties = varieties;
    }

}

class Color {


}
class EvolvesFromSpecies {


}
class Generation {


}
class GrowthRate {


}
class Habitat {


}
class Shape {


}
