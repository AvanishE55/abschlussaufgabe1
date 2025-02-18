package com.bigbrain.avanish.util;

import com.bigbrain.avanish.Action;
import com.bigbrain.avanish.Monster;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static com.bigbrain.avanish.util.CMD.ACTION;
import static com.bigbrain.avanish.util.CMD.MONSTER;

public class InputParser {

    public static void parse(String[] args, HashMap<String, Action> actionDB, HashMap<String, Monster> monsterDB, Random rng) throws IOException {
        if(args.length > 1){
            rng = new Random(Long.parseLong(args[1]));
        }else{
            rng = new Random();
        }

        List<String> configFile = Files.readAllLines(Paths.get(args[0]));
        //configFile.forEach(System.out::println);

        for( String s : configFile){
            String[] splitted = s.split(" ");
            switch (splitted[0]){
                case ACTION:
                    break;
                case MONSTER:
                    break;

            }
        }


    }
}
