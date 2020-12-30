
package com.esime.pokedex.Models.Species;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EvolutionChain {

    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EvolutionChain() {
    }

    /**
     * 
     * @param url
     */
    public EvolutionChain(String url) {
        super();
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
