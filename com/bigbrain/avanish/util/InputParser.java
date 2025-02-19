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
import static com.bigbrain.avanish.util.Commands.MONSTER;

public class InputParser {

    public static void parse(String[] args, HashMap<String, Action> actionDB, HashMap<String, Monster> monsterDB, Random rng) throws IOException {
        if (args.length > 1) {
            rng = new Random(Long.parseLong(args[1]));
        } else {
            rng = new Random();
        }

        List<String> configFile = Files.readAllLines(Paths.get(args[0]));
        //configFile.forEach(System.out::println);

        if (configFile != null) {
            while (!configFile.isEmpty()) {
                //remove first line and split by space
                String[] currentLine = configFile.get(0).split(" ");

                switch (currentLine[0]) {
                    case ACTION:
                        if (currentLine.length == 3) {
                            parseAction(currentLine[1], currentLine[2], configFile, actionDB);
                        }
                        break;

                    case MONSTER:
                        parseMonster(configFile, actionDB, monsterDB);
                        break;

                    default:
                        break;
                }
            }


        }
    }

    private static void parseAction(String name, String element, List<String> configFile, HashMap<String, Action> actionDB) {
        String[] currentline = configFile.remove(0).split(" ");
        Action action = new Action(name, element);

        while (currentline[0] != END) {


        }


    }

    private static void parseMonster(List<String> configFile, HashMap<String, Action> actionDB, HashMap<String, Monster> monsterDB) {


    }


}
