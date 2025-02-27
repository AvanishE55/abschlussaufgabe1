package com.bigbrain.avanish;

import com.bigbrain.avanish.util.Elements;
import com.bigbrain.avanish.util.Stats;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.bigbrain.avanish.CommandHandler.actionDB;
import static com.bigbrain.avanish.util.Commands.ERROR_MESSAGE;

public class Monster {
    String name;
    Elements element;

    List<String> actions = new ArrayList<>();
    HashMap<Stats, Integer> baseStats = new HashMap<>(5);
    HashMap<Stats, Integer> statModifiers = new HashMap<>(5);

    public Monster(String[] monsterLine) {
        this.name = monsterLine[0];
        this.element = Elements.valueOf(monsterLine[1]);
        baseStats.put(Stats.HP, Integer.parseInt(monsterLine[2]));
        baseStats.put(Stats.ATK, Integer.parseInt(monsterLine[3]));
        baseStats.put(Stats.DEF, Integer.parseInt(monsterLine[4]));
        baseStats.put(Stats.SPD, Integer.parseInt(monsterLine[5]));
        baseStats.put(Stats.PRC, 1);
//        actions.addAll(List.of(Arrays.copyOfRange(monsterLine, 6, monsterLine.length)));

        for(String action : Arrays.copyOfRange(monsterLine, 6, monsterLine.length)){
            if(actionDB.containsKey(action) && !actions.contains(action)){
                actions.add(action);
            }else {
                System.out.println(ERROR_MESSAGE + "parsing action");
            }

        }


    }


}
