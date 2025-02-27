package com.bigbrain.avanish.util;

import com.bigbrain.avanish.Action;
import com.bigbrain.avanish.Monster;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static com.bigbrain.avanish.util.Commands.ACTION;
import static com.bigbrain.avanish.util.Commands.END;
import static com.bigbrain.avanish.util.Commands.ERROR_MESSAGE;
import static com.bigbrain.avanish.util.Commands.MONSTER;

public class InputParser {

    public static final String LOAD_SUCCESS_MESSAGE = "Loaded %s actions and %s monsters.%n";
    public static final String DEBUG = "debug";

    public static boolean parseStartupInput(String[] args, final HashMap<String, Action> actionDB, final HashMap<String, Monster> monsterDB, Random rng) throws IOException {

        loadConfig(args[0], actionDB, monsterDB);

        if (args.length > 1) {
            if (args[1].equals(DEBUG)) {
                return true;
            }
            rng = new Random(Long.parseLong(args[1]));
        } else {
            rng = new Random();
        }

        return false;
    }

    public static void loadConfig(String path, final HashMap<String, Action> actionDB, final HashMap<String, Monster> monsterDB) {
        HashMap<String, Action> tempActionDB = new HashMap<>();
        HashMap<String, Monster> tempMonsterDB = new HashMap<>();

        List<String> configFile;

        try {
            configFile = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        //configFile.forEach(System.out::println); //print read config file to stdout

        while (!configFile.isEmpty()) {
            String[] currentLine = configFile.remove(0).trim().split(" ");

            if (currentLine.length == 1) {
                continue;
            }

            switch (currentLine[0]) {
                case ACTION:
                    if (currentLine.length == 3) {
                        parseAction(currentLine[1], currentLine[2], configFile, tempActionDB);
                    } else {
                        System.out.println(ERROR_MESSAGE);
                    }
                    break;

                case MONSTER:
                    parseMonster(currentLine, tempActionDB, tempMonsterDB);
                    break;

                default:
                    break;
            }
        }

        actionDB.clear();
        actionDB.putAll(tempActionDB);
        monsterDB.clear();
        monsterDB.putAll(tempMonsterDB);

        System.out.printf(LOAD_SUCCESS_MESSAGE, actionDB.size(), monsterDB.size());
    }

    private static void parseAction(String name, String element, List<String> configFile, HashMap<String, Action> actionDB) {
        Action action = new Action(name, element);

        String[] currentLine = configFile.remove(0).trim().split(" ");

        while (!currentLine[0].equals(END)) {
            action.addEffect(currentLine);
            currentLine = configFile.remove(0).split(" ");
        }

        actionDB.put(name, action);
    }

    private static void parseMonster(String[] currentLine, HashMap<String, Action> actionDB, HashMap<String, Monster> monsterDB) {


    }


}
