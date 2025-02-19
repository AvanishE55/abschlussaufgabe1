package com.bigbrain.avanish;

import java.util.List;

public class Action {
    String name;
    String element;
    List<Effect> effectDB;

    public Action(String name, String element) {
        this.name = name;
        this.element = element;
    }

    public void addEffect(Effect effect){
        effectDB.add(effect);
    }
}
