
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VersionDetail {

    @SerializedName("rarity")
    @Expose
    private Integer rarity;
    @SerializedName("version")
    @Expose
    private Version__1 version;

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Version__1 getVersion() {
        return version;
    }

    public void setVersion(Version__1 version) {
        this.version = version;
    }

}
