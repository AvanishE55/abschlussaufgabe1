package com.bigbrain.avanish.effects;

import com.bigbrain.avanish.Action;
import com.bigbrain.avanish.effects.util.EffectType;

import java.util.List;

public abstract class Effect {
    static final public String DAMAGE = "damage";
    static final public String INFLICTSTATUSCONDITION = "inflictStatusCondition";
    static final public String INFLICTSTATCHANGE = "inflictStatChange";
    static final public String PROTECTSTAT = "protectStat";
    static final public String HEAL = "heal";
    static final public String REPEAT = "repeat";
    static final public String CONTINUE = "continue";

    protected final EffectType effectType;
    protected final int hitRate;

    Effect(EffectType effectType, int hitRate) {
        this.effectType = effectType;
        this.hitRate = hitRate;
    }


    public int getHitRate() {
        return hitRate;
    }

    public EffectType getEffectType() {
        return effectType;
    }

//     abstract void performEffect();
//     abstract void printEffect();


    public static void addEffect(List<Effect> effectsDB, String[] currentLine, List<String> configFile) {
        switch (currentLine[0]) {
            case DAMAGE:
                effectsDB.add(new DamageEffect(currentLine));
                break;

            case INFLICTSTATUSCONDITION:
                effectsDB.add(new InflictStatusConditionEffect(currentLine));
                break;

            case INFLICTSTATCHANGE:
                effectsDB.add(new InflictStatChangeEffect(currentLine));
                break;

            case PROTECTSTAT:
                effectsDB.add(new ProtectStatEffect(currentLine));
                break;

            case HEAL:
                effectsDB.add(new HealEffect(currentLine));
                break;

            case REPEAT:
                effectsDB.add(new RepeatEffect(Integer.parseInt(currentLine[1]), configFile));
                break;

            case CONTINUE:
                effectsDB.add(new ContinueEffect(currentLine));
                break;
        }


    }
}



