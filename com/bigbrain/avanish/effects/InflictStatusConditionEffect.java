package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.EffectType;
import com.bigbrain.avanish.effects.util.StatusCondition;
import com.bigbrain.avanish.effects.util.TargetMonster;

public class InflictStatusConditionEffect extends Effect {
    public TargetMonster targetMonster;
    public StatusCondition statusCondition;

    public InflictStatusConditionEffect(String[] currentLine) {
        super(EffectType.INFLICTSTATUSCONDITION, Integer.parseInt(currentLine[3]));
        targetMonster = TargetMonster.valueOf(currentLine[1].toUpperCase());
        statusCondition = StatusCondition.valueOf(currentLine[2]);

    }
}
