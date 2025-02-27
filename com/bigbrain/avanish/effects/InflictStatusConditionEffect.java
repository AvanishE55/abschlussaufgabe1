package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.EffectType;
import com.bigbrain.avanish.effects.util.StatusCondition;
import com.bigbrain.avanish.effects.util.StrengthType;
import com.bigbrain.avanish.effects.util.TargetMonster;
import com.bigbrain.avanish.util.Stats;

public class InflictStatusConditionEffect extends Effect {
    public TargetMonster targetMonster;
    public Stats stat;
    public StatusCondition statusCondition;

    public InflictStatusConditionEffect(String[] currentLine) {
        this.effectType = EffectType.INFLICTSTATUSCONDITION;
        targetMonster = TargetMonster.valueOf(currentLine[1].toUpperCase());
        statusCondition = StatusCondition.valueOf(currentLine[2]);

    }
}
