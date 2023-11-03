package org.calculating.cleaning.homework3;


public class WorkWithMassive {
    public void analyzeMassive(int[] massive, int varForComparing) {

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > varForComparing) {
                System.out.println(massive[i] + " Value is more than " + varForComparing);
            } else if (massive[i] == varForComparing) {
                System.out.println(massive[i] + " Value is equal " + varForComparing);
            } else if (massive[i] < varForComparing) {
                System.out.println(massive[i] + " Value is less than " + varForComparing);
            }
        }
    }
}
