package com.bigbrain.avanish.effects;

public class DamageEffect extends Effect {
    public TargetMonster targetMonster;
    public int strength;
    public StrengthType strengthType;


    public DamageEffect(String[] currentLine) {
        this.type = EffectType.ENUMDAMAGE;
        targetMonster = TargetMonster.valueOf(currentLine[1].toUpperCase());
        strengthType = StrengthType.valueOf(currentLine[2].toUpperCase());
        strength = Integer.parseInt(currentLine[3]);
        hitRate = Integer.parseInt(currentLine[4]);
    }

}
