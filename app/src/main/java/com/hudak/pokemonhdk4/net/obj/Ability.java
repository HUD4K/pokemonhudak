
package com.hudak.pokemonhdk4.net.obj;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Ability {

    @SerializedName("ability")
    @Expose
    private Ability__1 ability;
    @SerializedName("is_hidden")
    @Expose
    private Boolean isHidden;
    @SerializedName("slot")
    @Expose
    private Integer slot;

    public Ability__1 getAbility() {
        return ability;
    }

    public void setAbility(Ability__1 ability) {
        this.ability = ability;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

}
