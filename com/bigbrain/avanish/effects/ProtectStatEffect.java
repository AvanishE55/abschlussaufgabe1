package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.Count;
import com.bigbrain.avanish.effects.util.EffectType;
import com.bigbrain.avanish.effects.util.ProtectTarget;

public class ProtectStatEffect extends Effect {

    private final ProtectTarget protectTarget;
    private final Count count;

    public ProtectStatEffect(String[] currentLine) {
        super(EffectType.PROTECTSTAT, Integer.parseInt(currentLine[currentLine.length - 1]));
        protectTarget = ProtectTarget.valueOf(currentLine[1].toUpperCase());
        if (currentLine.length == 6) {
            this.count = new Count(Integer.parseInt(currentLine[3]), Integer.parseInt(currentLine[4]));
        } else {
            this.count = new Count(Integer.parseInt(currentLine[2]));
        }
    }

    public Count getCount() {
        return count;
    }

    public ProtectTarget getProtectTarget() {
        return protectTarget;
    }

}
