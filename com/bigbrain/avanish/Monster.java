package com.bigbrain.avanish;

import java.util.Collection;
import java.util.HashMap;

import static com.bigbrain.avanish.util.Stats.STAT_AGL;
import static com.bigbrain.avanish.util.Stats.STAT_ATK;
import static com.bigbrain.avanish.util.Stats.STAT_DEF;
import static com.bigbrain.avanish.util.Stats.STAT_PRC;
import static com.bigbrain.avanish.util.Stats.STAT_SPD;

public class Monster {
    String name;
    String element;

    Collection<Action> actions;
    HashMap<String, Integer> baseStats =  new HashMap<>(5);
    HashMap<String, Integer> statModifiers =  new HashMap<>(5);

    public Monster(String name, String element, int baseATK, int baseDEF, int baseSPD, int baseAGL, int basePRC, Collection<Action> actions) {
        this.name = name;
        this.element = element;
        baseStats.put(STAT_ATK, baseATK);
        baseStats.put(STAT_DEF, baseDEF);
        baseStats.put(STAT_SPD, baseSPD);
        baseStats.put(STAT_AGL, baseAGL);
        baseStats.put(STAT_PRC, basePRC);
        this.actions = actions;


    }

    public Collection<Action> getActions() {
        return actions;
    }

    public void setActions(Collection<Action> actions) {
        this.actions = actions;
    }


}
