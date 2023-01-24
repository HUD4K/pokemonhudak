
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GenerationV {

    @SerializedName("black-white")
    @Expose
    private BlackWhite blackWhite;

    public BlackWhite getBlackWhite() {
        return blackWhite;
    }

    public void setBlackWhite(BlackWhite blackWhite) {
        this.blackWhite = blackWhite;
    }

}
