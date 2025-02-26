package com.bigbrain.avanish.effects;

public enum EffectType {
    ENUMDAMAGE("damage"),
    ENUMINFLICTSTATUSCONDITION("inflictStatusCondition"),
    ENUMINFLICTSTATCHANGE("inflictStatChange"),
    ENUMPROTECTSTATENUM("protectStat"),
    ENUMHEAL("heal"),
    ENUMREPEAT("repeat"),
    ENUMCONT("continue");

    public final String value;

    private EffectType(String value) {
        this.value = value;


    }
}
