package org.currency_exchange.menu;

import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static int getNumberFromConsole() {

        Scanner scanner = new Scanner(System.in);

        try{
            return scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }
    }


    public static double getDoubleFromConsole() {
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextDouble();
        } catch (Exception e) {
            return 0;
        }
    }

    private String alphabet = "QWEASDZXC";

    char getRandomKey(){
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        return randChar;
    }
}
