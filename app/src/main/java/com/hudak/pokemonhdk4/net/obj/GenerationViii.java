
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GenerationViii {

    @SerializedName("icons")
    @Expose
    private Icons__1 icons;

    public Icons__1 getIcons() {
        return icons;
    }

    public void setIcons(Icons__1 icons) {
        this.icons = icons;
    }

}
