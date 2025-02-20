package com.bigbrain.avanish;

import java.util.ArrayList;
import java.util.List;

import static com.bigbrain.avanish.util.Commands.ERROR_MESSAGE;
import static com.bigbrain.avanish.util.Elements.*;

public class Action {
    String name;
    String element;
    List<Effect> effectDB = new ArrayList<>();

    public Action(String name, String element) {
        this.name = name;
        this.element = element;
        switch(element){
            case FIRE:
                this.element = FIRE;
                break;
            case WATER:
                this.element = WATER;
                break;
            case EARTH:
                this.element = EARTH;
                break;
            case NORMAL:
                this.element = NORMAL;
                break;
            default:
                System.out.println(ERROR_MESSAGE);
                break;

        }
    }

    public void addEffect(Effect effect){
        effectDB.add(effect);
    }

    public void performAction(Monster self, Monster target){

    }
}
