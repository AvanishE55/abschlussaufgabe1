package com.bigbrain.avanish;

import java.util.HashMap;

import static com.bigbrain.avanish.util.Commands.ERROR_MESSAGE;
import static com.bigbrain.avanish.util.Commands.STATS;
import static com.bigbrain.avanish.util.EffectConstants.ABS;
import static com.bigbrain.avanish.util.EffectConstants.BASE;
import static com.bigbrain.avanish.util.EffectConstants.BURN;
import static com.bigbrain.avanish.util.EffectConstants.CONT;
import static com.bigbrain.avanish.util.EffectConstants.DAMAGE;
import static com.bigbrain.avanish.util.EffectConstants.HEAL;
import static com.bigbrain.avanish.util.EffectConstants.HIT_RATE;
import static com.bigbrain.avanish.util.EffectConstants.INFLICTSTATCHANGE;
import static com.bigbrain.avanish.util.EffectConstants.INFLICTSTATUSCONDITION;
import static com.bigbrain.avanish.util.EffectConstants.PROTECTSTAT;
import static com.bigbrain.avanish.util.EffectConstants.QUICKSAND;
import static com.bigbrain.avanish.util.EffectConstants.REL;
import static com.bigbrain.avanish.util.EffectConstants.REPEAT;
import static com.bigbrain.avanish.util.EffectConstants.SLEEP;
import static com.bigbrain.avanish.util.EffectConstants.STATUS_CONDITION_KEY;
import static com.bigbrain.avanish.util.EffectConstants.STRENGTH_KEY;
import static com.bigbrain.avanish.util.EffectConstants.TARGET;
import static com.bigbrain.avanish.util.EffectConstants.TARGET_MONSTER_KEY;
import static com.bigbrain.avanish.util.EffectConstants.USER;
import static com.bigbrain.avanish.util.EffectConstants.WET;
import static com.bigbrain.avanish.util.Stats.STAT_AGL;
import static com.bigbrain.avanish.util.Stats.STAT_ATK;
import static com.bigbrain.avanish.util.Stats.STAT_DEF;
import static com.bigbrain.avanish.util.Stats.STAT_PRC;
import static com.bigbrain.avanish.util.Stats.STAT_SPD;

public class Effect {

    public String type;
    public int repeat = 0;
    public HashMap<String, String> stringProperties = new HashMap<>();
    public HashMap<String, Integer> numberProperties = new HashMap<>();

    public Effect(String[] currentLine) {
        switch (currentLine[0]) {
            case DAMAGE:
                parseDamage(currentLine);
                break;

            case INFLICTSTATUSCONDITION:
                parseInflictStatusCondition(currentLine);
                break;

            case INFLICTSTATCHANGE:
                parseInflictStatChange(currentLine);
                break;

            case PROTECTSTAT:
                type = PROTECTSTAT;
                break;

            case HEAL:
                type = HEAL;
                break;

            case REPEAT:
                repeat = Integer.parseInt(currentLine[1]);
                break;

            case CONT:
                type = CONT;
                break;


        }
    }

    private void parseInflictStatChange(String[] currentLine) {
        type = INFLICTSTATCHANGE;
        if (currentLine.length != 5) {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        setTargetMonster(currentLine[1]);
        switch (currentLine[2]) {
            case STAT_ATK:
                stringProperties.put(STATS, STAT_ATK);
                break;
            case STAT_DEF:
                stringProperties.put(STATS, STAT_DEF);
                break;
            case STAT_SPD:
                stringProperties.put(STATS, STAT_SPD);
                break;
            case STAT_AGL:
                stringProperties.put(STATS, STAT_AGL);
                break;
            case STAT_PRC:
                stringProperties.put(STATS, STAT_PRC);
                break;
            default:
                System.out.println(ERROR_MESSAGE);
                break;
        }
        numberProperties.put(STATS, Integer.parseInt(currentLine[3]));
        numberProperties.put(HIT_RATE, Integer.parseInt(currentLine[4]));
    }

    private void parseInflictStatusCondition(String[] currentLine) {
        type = INFLICTSTATUSCONDITION;
        if (currentLine.length != 4) {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        setTargetMonster(currentLine[1]);

        switch (currentLine[2]) {
            case WET:
                stringProperties.put(STATUS_CONDITION_KEY, WET);
                break;
            case QUICKSAND:
                stringProperties.put(STATUS_CONDITION_KEY, QUICKSAND);
                break;
            case BURN:
                stringProperties.put(STATUS_CONDITION_KEY, BURN);
                break;
            case SLEEP:
                stringProperties.put(STATUS_CONDITION_KEY, SLEEP);
                break;
            default:
                System.out.println(ERROR_MESSAGE);
                break;
        }
        numberProperties.put(HIT_RATE, Integer.parseInt(currentLine[3]));
    }

    private void parseDamage(String[] currentLine) {
        if (currentLine.length != 5) {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        type = DAMAGE;
        setTargetMonster(currentLine[1]);
        setStrength(currentLine[2]);
        numberProperties.put(STRENGTH_KEY, Integer.parseInt(currentLine[3]));
        numberProperties.put(HIT_RATE, Integer.parseInt(currentLine[4]));
    }

    private void setStrength(String strength) {
        switch (strength) {
            case BASE:
                stringProperties.put(STRENGTH_KEY, BASE);
                break;
            case REL:
                stringProperties.put(STRENGTH_KEY, REL);
                break;
            case ABS:
                stringProperties.put(STRENGTH_KEY, ABS);
                break;
            default:
                System.out.println(ERROR_MESSAGE);
                break;
        }
    }

    private void setTargetMonster(String targetMonster) {
        switch (targetMonster) {
            case USER:
                stringProperties.put(TARGET_MONSTER_KEY, USER);
                break;
            case TARGET:
                stringProperties.put(TARGET_MONSTER_KEY, TARGET);
                break;
            default:
                System.out.println(ERROR_MESSAGE);
                break;
        }
    }
}
