package com.bigbrain.avanish;

import com.bigbrain.avanish.effects.DamageEffect;
import com.bigbrain.avanish.effects.Effect;
import com.bigbrain.avanish.effects.InflictStatusConditionEffect;

import java.util.ArrayList;
import java.util.List;

import static com.bigbrain.avanish.util.EffectConstants.CONT;
import static com.bigbrain.avanish.util.EffectConstants.DAMAGE;
import static com.bigbrain.avanish.util.EffectConstants.HEAL;
import static com.bigbrain.avanish.util.EffectConstants.INFLICTSTATCHANGE;
import static com.bigbrain.avanish.util.EffectConstants.INFLICTSTATUSCONDITION;
import static com.bigbrain.avanish.util.EffectConstants.PROTECTSTAT;
import static com.bigbrain.avanish.util.EffectConstants.REPEAT;

public class Action {
    String name;
    String element;
    List<Effect> effectDB = new ArrayList<>();

    public Action(String name, String element) {
        this.name = name;
        this.element = element;
    }

    public void addEffect(String[] currentLine){
        switch (currentLine[0]) {
            case DAMAGE:
                effectDB.add(new DamageEffect(currentLine));
                break;

            case INFLICTSTATUSCONDITION:
                effectDB.add(new InflictStatusConditionEffect(currentLine));
                break;

            case INFLICTSTATCHANGE:
                break;

            case PROTECTSTAT:
                break;

            case HEAL:
                break;

            case REPEAT:
                break;

            case CONT:
                break;


        }

    }

    public void performAction(Monster self, Monster target){

    }
}
