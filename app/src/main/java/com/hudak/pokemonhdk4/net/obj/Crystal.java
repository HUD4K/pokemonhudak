
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Crystal {

    @SerializedName("back_default")
    @Expose
    private String backDefault;
    @SerializedName("back_shiny")
    @Expose
    private String backShiny;
    @SerializedName("back_shiny_transparent")
    @Expose
    private String backShinyTransparent;
    @SerializedName("back_transparent")
    @Expose
    private String backTransparent;
    @SerializedName("front_default")
    @Expose
    private String frontDefault;
    @SerializedName("front_shiny")
    @Expose
    private String frontShiny;
    @SerializedName("front_shiny_transparent")
    @Expose
    private String frontShinyTransparent;
    @SerializedName("front_transparent")
    @Expose
    private String frontTransparent;

    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public String getBackShiny() {
        return backShiny;
    }

    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    public String getBackShinyTransparent() {
        return backShinyTransparent;
    }

    public void setBackShinyTransparent(String backShinyTransparent) {
        this.backShinyTransparent = backShinyTransparent;
    }

    public String getBackTransparent() {
        return backTransparent;
    }

    public void setBackTransparent(String backTransparent) {
        this.backTransparent = backTransparent;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    public String getFrontShinyTransparent() {
        return frontShinyTransparent;
    }

    public void setFrontShinyTransparent(String frontShinyTransparent) {
        this.frontShinyTransparent = frontShinyTransparent;
    }

    public String getFrontTransparent() {
        return frontTransparent;
    }

    public void setFrontTransparent(String frontTransparent) {
        this.frontTransparent = frontTransparent;
    }

}
