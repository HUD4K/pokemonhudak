
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GenerationI {

    @SerializedName("red-blue")
    @Expose
    private RedBlue redBlue;
    @SerializedName("yellow")
    @Expose
    private Yellow yellow;

    public RedBlue getRedBlue() {
        return redBlue;
    }

    public void setRedBlue(RedBlue redBlue) {
        this.redBlue = redBlue;
    }

    public Yellow getYellow() {
        return yellow;
    }

    public void setYellow(Yellow yellow) {
        this.yellow = yellow;
    }

}
