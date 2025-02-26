package com.bigbrain.avanish.effects;

public abstract class Effect {
    EffectType type;
    public int hitRate;

    public int getHitRate() {
        return hitRate;
    }

    public void setHitRate(int hitRate) {
        this.hitRate = hitRate;
    }

    public EffectType getType() {
        return type;
    }

    public void setType(EffectType type) {
        this.type = type;
    }


}



