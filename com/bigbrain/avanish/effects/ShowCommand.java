package com.bigbrain.avanish.effects;

public class ShowCommand {

    static public void show(String[] currentCommand) {
        if (currentCommand.length == 1) {
            showHealth();
        } else {
            switch (currentCommand[1]) {
                case "stats":
                    showStats();
                    break;

                case "monsters":
                    showMonsters();
                    break;

                case "actions":
                    showActions();
                    break;
            }
        }


    }

    static private void showMonsters() {

    }

    static private void showHealth() {

    }

    static private void showStats() {

    }

    static private void showActions() {

    }


}
