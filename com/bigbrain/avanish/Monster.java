package com.bigbrain.avanish;

import java.util.Collection;
import java.util.HashMap;

public class Monster {
    String name;
    String element;
    int baseATK;
    int baseDEF;
    int baseSPD;
    int baseAGL;
    int basePRC;
    int currATK;
    int currDEF;
    int currSPD;
    int currAGL;
    int currPRC;
    HashMap<String, Action> actions;

    public Monster(String name, String element, int baseATK, int baseDEF, int baseSPD, int baseAGL, int basePRC, Collection<Action> actions) {
        this.name = name;
        this.element = element;
        this.baseATK = baseATK;
        this.baseDEF = baseDEF;
        this.baseSPD = baseSPD;
        this.baseAGL = baseAGL;
        this.basePRC = basePRC;


    }

    public int getCurrATK() {
        return currATK;
    }

    public void setCurrATK(int currATK) {
        this.currATK = currATK;
    }

    public int getCurrDEF() {
        return currDEF;
    }

    public void setCurrDEF(int currDEF) {
        this.currDEF = currDEF;
    }

    public int getCurrSPD() {
        return currSPD;
    }

    public void setCurrSPD(int currSPD) {
        this.currSPD = currSPD;
    }

    public int getCurrAGL() {
        return currAGL;
    }

    public void setCurrAGL(int currAGL) {
        this.currAGL = currAGL;
    }

    public int getCurrPRC() {
        return currPRC;
    }

    public void setCurrPRC(int currPRC) {
        this.currPRC = currPRC;
    }

    public HashMap<String, Action> getActions() {
        return actions;
    }

    public void setActions(HashMap<String, Action> actions) {
        this.actions = actions;
    }


}
