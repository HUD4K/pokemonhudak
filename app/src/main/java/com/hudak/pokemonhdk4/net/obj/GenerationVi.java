
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GenerationVi {

    @SerializedName("omegaruby-alphasapphire")
    @Expose
    private OmegarubyAlphasapphire omegarubyAlphasapphire;
    @SerializedName("x-y")
    @Expose
    private XY xY;

    public OmegarubyAlphasapphire getOmegarubyAlphasapphire() {
        return omegarubyAlphasapphire;
    }

    public void setOmegarubyAlphasapphire(OmegarubyAlphasapphire omegarubyAlphasapphire) {
        this.omegarubyAlphasapphire = omegarubyAlphasapphire;
    }

    public XY getxY() {
        return xY;
    }

    public void setxY(XY xY) {
        this.xY = xY;
    }

}
