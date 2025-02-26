package com.bigbrain.avanish.effects;

public class DamageEffect extends Effect {
    public String targetMonster;
    public int strength;


    public DamageEffect(String[] currentLine) {
        this.type = EffectType.ENUMINFLICTSTATUSCONDITION;
    }


}
