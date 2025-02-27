package com.bigbrain.avanish;

import com.bigbrain.avanish.effects.ContinueEffect;
import com.bigbrain.avanish.effects.DamageEffect;
import com.bigbrain.avanish.effects.Effect;
import com.bigbrain.avanish.effects.HealEffect;
import com.bigbrain.avanish.effects.InflictStatChangeEffect;
import com.bigbrain.avanish.effects.InflictStatusConditionEffect;
import com.bigbrain.avanish.effects.ProtectStatEffect;
import com.bigbrain.avanish.effects.RepeatEffect;
import com.bigbrain.avanish.util.Elements;

import java.util.ArrayList;
import java.util.List;


public class Action {

    private final String name;
    private final Elements element;
    private final List<Effect> effectDB = new ArrayList<>();

    public Action(String name, String element) {
        this.name = name;
        this.element = Elements.valueOf(element.toUpperCase());
    }

    public void performAction(Monster self, Monster target) {
    }

    public List<Effect> getEffectDB() {
        return effectDB;
    }

    public Elements getElement() {
        return element;
    }

    public String getName() {
        return name;
    }
}
