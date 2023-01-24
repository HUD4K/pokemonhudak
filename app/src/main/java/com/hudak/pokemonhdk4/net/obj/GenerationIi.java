
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GenerationIi {

    @SerializedName("crystal")
    @Expose
    private Crystal crystal;
    @SerializedName("gold")
    @Expose
    private Gold gold;
    @SerializedName("silver")
    @Expose
    private Silver silver;

    public Crystal getCrystal() {
        return crystal;
    }

    public void setCrystal(Crystal crystal) {
        this.crystal = crystal;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public Silver getSilver() {
        return silver;
    }

    public void setSilver(Silver silver) {
        this.silver = silver;
    }

}
