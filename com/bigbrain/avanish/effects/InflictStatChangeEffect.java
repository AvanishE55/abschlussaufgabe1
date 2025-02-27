package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.EffectType;
import com.bigbrain.avanish.effects.util.TargetMonster;
import com.bigbrain.avanish.util.Stats;

public class InflictStatChangeEffect extends Effect {


    private final TargetMonster targetMonster;
    private final Stats stat;
    private final int statChange;

    public InflictStatChangeEffect(String[] currentLine) {
        super(EffectType.INFLICTSTATCHANGE, Integer.parseInt(currentLine[4]));
        targetMonster = TargetMonster.valueOf(currentLine[1].toUpperCase());
        stat = Stats.valueOf(currentLine[2].toUpperCase());
        statChange = Integer.parseInt(currentLine[3]);
    }

    public TargetMonster getTargetMonster() {
        return targetMonster;
    }

    public Stats getStat() {
        return stat;
    }

    public int getStatChange() {
        return statChange;
    }
}
