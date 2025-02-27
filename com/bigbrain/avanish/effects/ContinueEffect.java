package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.EffectType;

public class ContinueEffect extends Effect {
    public ContinueEffect(String[] currentLine){
        super(EffectType.CONTINUE, Integer.parseInt(currentLine[1]));
    }
}
