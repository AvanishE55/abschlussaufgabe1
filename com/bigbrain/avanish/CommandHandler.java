package com.bigbrain.avanish;

import com.bigbrain.avanish.util.InputParser;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import static com.bigbrain.avanish.util.Commands.ACTION;
import static com.bigbrain.avanish.util.Commands.COMPETITION;
import static com.bigbrain.avanish.util.Commands.LOAD;
import static com.bigbrain.avanish.util.Commands.QUIT;
import static com.bigbrain.avanish.util.Commands.ERROR_MESSAGE;
import static com.bigbrain.avanish.util.Commands.SHOW;

public class CommandHandler {


    static Scanner scanner;
    static Random rng;
    static public boolean debug = false;

    static final HashMap<String, Action> actionDB = new HashMap<>();
    static final HashMap<String, Monster> monsterDB = new HashMap<>();
    static Competition competition;

    public static void main(String[] args) throws IOException {

        debug = InputParser.parseStartupInput(args, actionDB, monsterDB, rng);

        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals(QUIT)) {
            performCommand(input.split(" "));
            input = scanner.nextLine();
        }
    }

    /**
     * Method with performs the inputted command/ calls the relevant method.
     * @param currentCommand current inputted command
     */
    public static void performCommand(String[] currentCommand) {
        if (currentCommand.length < 1) {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        switch (currentCommand[0]) {
            case SHOW:

                break;

            case LOAD:
                InputParser.loadConfig(currentCommand[0], actionDB, monsterDB);

                break;

            case ACTION:

                break;

            case COMPETITION:
                //competition = new Competition();
                break;

            default:
                System.out.println(ERROR_MESSAGE);
        }
    }
}
