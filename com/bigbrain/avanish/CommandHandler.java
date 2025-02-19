package com.bigbrain.avanish;

import com.bigbrain.avanish.util.InputParser;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import static com.bigbrain.avanish.util.Commands.QUIT;
import static com.bigbrain.avanish.util.Commands.ERROR_MESSAGE;
import static com.bigbrain.avanish.util.Commands.SHOW;

public class CommandHandler {


    static Scanner scanner;
    static Random rng;

    static HashMap<String, Action> actionDB;
    static HashMap<String, Monster> monsterDB;

    public static void main(String[] args) throws IOException {

        InputParser.parse(args, actionDB, monsterDB, rng);

        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!Objects.equals(input, QUIT)) {
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

            //System.out.println(String.format("It is %d oclock", 5));

            return;
        }
        switch (currentCommand[0]) {
            case SHOW:
                break;


            default:
                System.out.println(ERROR_MESSAGE);
        }
    }
}
