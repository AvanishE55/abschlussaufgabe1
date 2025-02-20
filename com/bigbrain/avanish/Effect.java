package com.bigbrain.avanish;

import java.util.HashMap;

import static com.bigbrain.avanish.util.Commands.ERROR_MESSAGE;
import static com.bigbrain.avanish.util.EffectConstants.ABS;
import static com.bigbrain.avanish.util.EffectConstants.BASE;
import static com.bigbrain.avanish.util.EffectConstants.CONT;
import static com.bigbrain.avanish.util.EffectConstants.DAMAGE;
import static com.bigbrain.avanish.util.EffectConstants.HEAL;
import static com.bigbrain.avanish.util.EffectConstants.HIT_RATE;
import static com.bigbrain.avanish.util.EffectConstants.INFLICTSTATCHANGE;
import static com.bigbrain.avanish.util.EffectConstants.INFLICTSTATUSCONDITION;
import static com.bigbrain.avanish.util.EffectConstants.PROTECTSTAT;
import static com.bigbrain.avanish.util.EffectConstants.REL;
import static com.bigbrain.avanish.util.EffectConstants.REPEAT;
import static com.bigbrain.avanish.util.EffectConstants.STRENGTH;
import static com.bigbrain.avanish.util.EffectConstants.TARGET;
import static com.bigbrain.avanish.util.EffectConstants.TARGET_MONSTER;
import static com.bigbrain.avanish.util.EffectConstants.USER;

public class Effect {

    public String type;
    public int repeat = 0;
    public HashMap<String, String> stringProperties = new HashMap<>();
    public HashMap<String, Integer> numberProperties = new HashMap<>();

    public Effect(String[] currentline) {
        switch (currentline[0]) {
            case DAMAGE:
                parseDamage(currentline);
                break;

            case INFLICTSTATUSCONDITION:
                type = INFLICTSTATUSCONDITION;
                break;

            case INFLICTSTATCHANGE:
                type = INFLICTSTATCHANGE;
                break;

            case PROTECTSTAT:
                type = PROTECTSTAT;
                break;

            case HEAL:
                type = HEAL;
                break;

            case REPEAT:
                repeat = Integer.parseInt(currentline[1]);
                break;

            case CONT:
                type = CONT;
                break;


        }
    }

    private void parseDamage(String[] currentline) {
        if(currentline.length != 5){
            System.out.println(ERROR_MESSAGE);
            return;
        }
        type = DAMAGE;
        switch (currentline[1]) {
            case USER:
                stringProperties.put(TARGET_MONSTER, USER);
                break;
            case TARGET:
                stringProperties.put(TARGET_MONSTER, TARGET);
                break;
        }

        switch (currentline[2]) {
            case BASE:
                stringProperties.put(STRENGTH, BASE);
                break;
            case REL:
                stringProperties.put(STRENGTH, REL);
                break;
            case ABS:
                stringProperties.put(STRENGTH, ABS);
                break;
        }

        numberProperties.put(HIT_RATE, Integer.parseInt(currentline[3]));
    }
}
