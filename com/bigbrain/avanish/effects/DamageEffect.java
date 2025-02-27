package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.EffectType;
import com.bigbrain.avanish.effects.util.StrengthType;
import com.bigbrain.avanish.effects.util.TargetMonster;

public class DamageEffect extends Effect {
    public TargetMonster targetMonster;
    public StrengthType strengthType;
    public int strength;

    public DamageEffect(String[] currentLine) {
        this.effectType = EffectType.DAMAGE;
        targetMonster = TargetMonster.valueOf(currentLine[1].toUpperCase());
        strengthType = StrengthType.valueOf(currentLine[2].toUpperCase());
        strength = Integer.parseInt(currentLine[3]);
        hitRate = Integer.parseInt(currentLine[4]);
    }

}
