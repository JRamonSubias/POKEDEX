
package com.esime.pokedex.Models.Response;

import java.util.ArrayList;
import java.util.List;

import com.esime.pokedex.Models.Type.PokemonListType;
import com.esime.pokedex.Models.abilities.PokemonListHabiliy;
import com.esime.pokedex.Models.Species.Species;
import com.esime.pokedex.Models.Sprites;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PokemonDescriptionResponse {

    @SerializedName("abilities")
    @Expose
    private ArrayList<PokemonListHabiliy> abilities = null;
    @SerializedName("base_experience")
    @Expose
    private Integer baseExperience;
    @SerializedName("forms")
    @Expose
    private List<Object> forms = null;
    @SerializedName("game_indices")
    @Expose
    private List<Object> gameIndices = null;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("held_items")
    @Expose
    private List<Object> heldItems = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_default")
    @Expose
    private Boolean isDefault;
    @SerializedName("location_area_encounters")
    @Expose
    private String locationAreaEncounters;
    @SerializedName("moves")
    @Expose
    private List<Object> moves = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("species")
    @Expose
    private Species species;
    @SerializedName("sprites")
    @Expose
    private Sprites sprites;
    @SerializedName("stats")
    @Expose
    private List<Object> stats = null;
    @SerializedName("types")
    @Expose
    private ArrayList<PokemonListType> types = null;
    @SerializedName("weight")
    @Expose
    private Integer weight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PokemonDescriptionResponse() {
    }

    /**
     * 
     * @param types
     * @param weight
     * @param sprites
     * @param heldItems
     * @param abilities
     * @param isDefault
     * @param gameIndices
     * @param species
     * @param stats
     * @param moves
     * @param baseExperience
     * @param name
     * @param id
     * @param forms
     * @param height
     * @param locationAreaEncounters
     * @param order
     */
    public PokemonDescriptionResponse(ArrayList<PokemonListHabiliy> abilities, Integer baseExperience, List<Object> forms, List<Object> gameIndices, Integer height, List<Object> heldItems, Integer id, Boolean isDefault, String locationAreaEncounters, List<Object> moves, String name, Integer order, Species species, Sprites sprites, List<Object> stats, ArrayList<PokemonListType> types, Integer weight) {
        super();
        this.abilities = abilities;
        this.baseExperience = baseExperience;
        this.forms = forms;
        this.gameIndices = gameIndices;
        this.height = height;
        this.heldItems = heldItems;
        this.id = id;
        this.isDefault = isDefault;
        this.locationAreaEncounters = locationAreaEncounters;
        this.moves = moves;
        this.name = name;
        this.order = order;
        this.species = species;
        this.sprites = sprites;
        this.stats = stats;
        this.types = types;
        this.weight = weight;
    }

    public ArrayList<PokemonListHabiliy> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<PokemonListHabiliy> abilities) {
        this.abilities = abilities;
    }

    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public List<Object> getForms() {
        return forms;
    }

    public void setForms(List<Object> forms) {
        this.forms = forms;
    }

    public List<Object> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<Object> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<Object> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(List<Object> heldItems) {
        this.heldItems = heldItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public List<Object> getMoves() {
        return moves;
    }

    public void setMoves(List<Object> moves) {
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<Object> getStats() {
        return stats;
    }

    public void setStats(List<Object> stats) {
        this.stats = stats;
    }

    public ArrayList<PokemonListType> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<PokemonListType> types) {
        this.types = types;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}
