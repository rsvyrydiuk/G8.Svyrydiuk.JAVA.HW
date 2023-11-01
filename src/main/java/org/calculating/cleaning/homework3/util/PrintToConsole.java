package org.calculating.cleaning.homework3.util;

public class PrintToConsole {
    public static void printResult(String formulaRozrahunku, double resultRozrahunku) {
        System.out.println();
        System.out.println("Result of operation: " + formulaRozrahunku + " = " + resultRozrahunku);
    }

    public static void printResult(String formulaRozrahunku, int resultRozrahunku) {
        System.out.println();
        System.out.println("Result of operation: " + formulaRozrahunku + " = " + resultRozrahunku);
    }


    public static void printResult(String resultRozrahunku) {
        System.out.println();
        System.out.println("Result of concatenation: " + resultRozrahunku);
    }


    public static void printLikeHeader(String text) {
        System.out.println("-".repeat(10) + text + "-".repeat(10));
    }
}