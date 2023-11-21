package org.currency_exchange.menu;

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
}
