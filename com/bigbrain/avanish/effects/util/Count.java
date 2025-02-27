package com.bigbrain.avanish.effects.util;

import java.util.Random;

public class Count {

    private final int min;
    private final int max;

    public Count(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Count(int value) {
        this.min = value;
        this.max = value;
    }

    public int generateCount(Random rng) {
        if (min == max) {
            return min;
        } else {
            return rng.nextInt(min, max + 1);
        }
    }


}
