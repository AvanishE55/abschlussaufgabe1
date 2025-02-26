package com.bigbrain.avanish;

import com.bigbrain.avanish.effects.DamageEffect;
import com.bigbrain.avanish.effects.Effect;
import com.bigbrain.avanish.effects.InflictStatusConditionEffect;

import java.util.ArrayList;
import java.util.List;

public class Action {
    static final public String DAMAGE =  "damage";
    static final public String INFLICTSTATUSCONDITION =  "inflictStatusCondition";
    static final public String INFLICTSTATCHANGE = "inflictStatChange";
    static final public String PROTECTSTAT = "protectStat";
    static final public String HEAL = "heal";
    static final public String REPEAT = "repeat";
    static final public String CONT = "continue";
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
