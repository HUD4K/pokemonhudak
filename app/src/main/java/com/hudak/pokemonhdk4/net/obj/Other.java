
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Other {

    @SerializedName("dream_world")
    @Expose
    private DreamWorld dreamWorld;
    @SerializedName("home")
    @Expose
    private Home home;
    @SerializedName("official-artwork")
    @Expose
    private OfficialArtwork officialArtwork;

    public DreamWorld getDreamWorld() {
        return dreamWorld;
    }

    public void setDreamWorld(DreamWorld dreamWorld) {
        this.dreamWorld = dreamWorld;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public OfficialArtwork getOfficialArtwork() {
        return officialArtwork;
    }

    public void setOfficialArtwork(OfficialArtwork officialArtwork) {
        this.officialArtwork = officialArtwork;
    }

}
