package org.calculating.cleaning.part_2.util;

public class PrintToConsole {
    public static void printTotalValue(double totalValue) {
        System.out.println();
        System.out.println("TOTAL: " + totalValue);
    }

    public static void printLikeHeader(String text) {
        System.out.println("-".repeat(10) + text + "-".repeat(10));
    }
}
