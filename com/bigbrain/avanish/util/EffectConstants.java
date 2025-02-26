package com.bigbrain.avanish.util;

import java.util.Arrays;
import java.util.List;

public final class EffectConstants {
    //Effect Types
    static final public String DAMAGE =  "damage";
    static final public String INFLICTSTATUSCONDITION =  "inflictStatusCondition";
    static final public String INFLICTSTATCHANGE = "inflictStatChange";
    static final public String PROTECTSTAT = "protectStat";
    static final public String HEAL = "heal";
    static final public String REPEAT = "repeat";
    static final public String CONT = "continue";
    static final public List<String> DAMAGE_TYPES = Arrays.asList("damage", "inflictStatusCondition", "inflictStatChange", "protectStat", "heal", "repeat", "continue");


    //Status Conditions
    static final public String STATUS_CONDITION_KEY = "STATUS_CONDITION";
//    static final public String WET = "WET";
//    static final public String QUICKSAND = "QUICKSAND";
//    static final public String BURN = "BURN";
//    static final public String SLEEP = "SLEEP";
    static final public List<String> STATUS_CONDITIONS = Arrays.asList("WET","QUICKSAND","BURN", "SLEEP");

    //Strength - damage type
    static final public String STRENGTH_KEY = "STRENGTH";
    static final public String BASE = "base";
    static final public String REL = "rel";
    static final public String ABS = "abs";
    static final public  List<String> DAMAGE_TYPE = Arrays.asList("base","rel","abs");



    static final public String HIT_RATE = "HIT_RATE";

    //Target monster
    static final public String TARGET_MONSTER_KEY = "TARGET_MONSTER";
    static final public String USER = "user";
    static final public String TARGET = "target";

}
