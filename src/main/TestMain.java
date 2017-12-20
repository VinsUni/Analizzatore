package main;

import analyze.Messaggio;

import java.io.File;

/**
 * @author Vincenzo Plantone
 * @matricola 639371
 */

public class TestMain {

    public static void main(String[] args) {

        final int MEX = 7;
        Messaggio[] messages = new Messaggio[MEX];
        for(int i = 0; i < MEX; i++){
            messages[i] = new Messaggio(new File(args[i]));
        }
    }
}
