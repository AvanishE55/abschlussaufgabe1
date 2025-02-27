package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.effects.util.EffectType;

import java.util.List;
import java.util.Scanner;

import static com.bigbrain.avanish.util.Commands.END;

public class RepeatEffect extends Effect {


    public RepeatEffect(String[] currentLine, List<String> configFile) {
        super(EffectType.REPEAT, 0);
        while (!currentLine[0].equals(END)) {
//make add effect static method - maybe create a factory class to create effects and add them to a given action
            currentLine = configFile.remove(0).split(" ");
        }

    }
}
