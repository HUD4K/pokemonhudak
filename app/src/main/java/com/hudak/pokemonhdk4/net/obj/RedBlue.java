
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class RedBlue {

    @SerializedName("back_default")
    @Expose
    private String backDefault;
    @SerializedName("back_gray")
    @Expose
    private String backGray;
    @SerializedName("back_transparent")
    @Expose
    private String backTransparent;
    @SerializedName("front_default")
    @Expose
    private String frontDefault;
    @SerializedName("front_gray")
    @Expose
    private String frontGray;
    @SerializedName("front_transparent")
    @Expose
    private String frontTransparent;

    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public String getBackGray() {
        return backGray;
    }

    public void setBackGray(String backGray) {
        this.backGray = backGray;
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

    public String getFrontGray() {
        return frontGray;
    }

    public void setFrontGray(String frontGray) {
        this.frontGray = frontGray;
    }

    public String getFrontTransparent() {
        return frontTransparent;
    }

    public void setFrontTransparent(String frontTransparent) {
        this.frontTransparent = frontTransparent;
    }

}
