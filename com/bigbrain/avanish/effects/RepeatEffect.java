package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.EffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.bigbrain.avanish.util.Commands.END;

public class RepeatEffect extends Effect {
    private final List<Effect> repeatedEffects = new ArrayList<>();

    public RepeatEffect(String[] currentLine, List<String> configFile) {
        super(EffectType.REPEAT, 0);
        while (!currentLine[0].equals(END)) {
            Effect.addEffect(repeatedEffects, currentLine, configFile);
            currentLine = configFile.remove(0).split(" ");
        }

    }

    public List<Effect> getRepeatedEffects() {
        return repeatedEffects;
    }
}
