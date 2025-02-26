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

    public static void parse(String[] args, HashMap<String, Action> actionDB, HashMap<String, Monster> monsterDB, Random rng) throws IOException {
        if (args.length > 1) {
            rng = new Random(Long.parseLong(args[1]));
        } else {
            rng = new Random();
        }

        List<String> configFile = Files.readAllLines(Paths.get(args[0]));
        //configFile.forEach(System.out::println);


        while (!configFile.isEmpty()) {
            String[] currentLine = configFile.remove(0).trim().split(" ");

            if (currentLine.length == 1) {
                continue;
            }

            switch (currentLine[0]) {
                case ACTION:
                    if (currentLine.length == 3) {
                        parseAction(currentLine[1], currentLine[2], configFile, actionDB);
                    } else {
                        System.out.println(ERROR_MESSAGE);
                    }
                    break;

                case MONSTER:
                    parseMonster(currentLine, actionDB, monsterDB);
                    break;

                default:
                    break;
            }
        }

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
