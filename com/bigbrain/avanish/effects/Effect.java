package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.EffectType;

public abstract class Effect {

    protected final EffectType effectType;
    protected final int hitRate;

    Effect(EffectType effectType, int hitRate) {
        this.effectType = effectType;
        this.hitRate = hitRate;
    }

    public int getHitRate() {
        return hitRate;
    }

    public EffectType getEffectType() {
        return effectType;
    }

//     abstract void performEffect();
//     abstract void printEffect();
}



