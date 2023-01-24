
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Stat {

    @SerializedName("base_stat")
    @Expose
    private Integer baseStat;
    @SerializedName("effort")
    @Expose
    private Integer effort;
    @SerializedName("stat")
    @Expose
    private Stat__1 stat;

    public Integer getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public Stat__1 getStat() {
        return stat;
    }

    public void setStat(Stat__1 stat) {
        this.stat = stat;
    }

}
