package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.Count;
import com.bigbrain.avanish.effects.util.EffectType;

import java.util.ArrayList;
import java.util.List;

import static com.bigbrain.avanish.util.Commands.END;

public class RepeatEffect extends Effect {
    private final List<Effect> repeatedEffects = new ArrayList<>();
    private final Count count;

    public RepeatEffect(int repeat, List<String> configFile) {
        super(EffectType.REPEAT, 0);
        count = new Count(repeat);

        String[] currentLine = configFile.remove(0).trim().split(" ");

        while (!currentLine[0].equals(END)) {
            Effect.addEffect(repeatedEffects, currentLine, configFile);
            currentLine = configFile.remove(0).trim().split(" ");
        }
    }

    public List<Effect> getRepeatedEffects() {
        return repeatedEffects;
    }
}
