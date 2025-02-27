package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.EffectType;
import com.bigbrain.avanish.effects.util.StrengthType;
import com.bigbrain.avanish.effects.util.TargetMonster;

public class HealEffect extends Effect {
    private final TargetMonster targetMonster;
    private final StrengthType strengthType;
    private final int strength;

    public HealEffect(String[] currentLine) {
        super(EffectType.HEAL, Integer.parseInt(currentLine[4]));
        targetMonster = TargetMonster.valueOf(currentLine[1].toUpperCase());
        strengthType = StrengthType.valueOf(currentLine[2].toUpperCase());
        strength = Integer.parseInt(currentLine[3]);
    }

    public TargetMonster getTargetMonster() {
        return targetMonster;
    }

    public StrengthType getStrengthType() {
        return strengthType;
    }

    public int getStrength() {
        return strength;
    }
}
