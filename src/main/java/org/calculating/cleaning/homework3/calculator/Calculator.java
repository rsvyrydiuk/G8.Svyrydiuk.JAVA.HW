package org.calculating.cleaning.homework3.calculator;

import org.calculating.cleaning.homework3.util.PrintToConsole;

public class Calculator {
    private int mnozhnyk;
    private int firstUserNumber;
    private int secondUserNumber;
    private double doubleUserNumber;


    public Calculator() {
        this.firstUserNumber = firstUserNumber;
        this.secondUserNumber = secondUserNumber;
        this.doubleUserNumber = doubleUserNumber;
        this.mnozhnyk = GeneralCalculatorConstant.DEFAULT_MNOGNYK;
    }


    public Calculator(int mnozhnyk) {
        this.firstUserNumber = firstUserNumber;
        this.secondUserNumber = secondUserNumber;
        this.doubleUserNumber = doubleUserNumber;
        this.mnozhnyk = mnozhnyk;
    }

    public int multiplication(int firstUserNumber, int secondUserNumber) {

        int resultRozrahunku = firstUserNumber * secondUserNumber * mnozhnyk;
        String formulaRozrahunku = "( " + firstUserNumber + " * " + secondUserNumber + " ) " + " * " + mnozhnyk;
        PrintToConsole.printResult(formulaRozrahunku, resultRozrahunku);
        return resultRozrahunku;
    }


    public int sum(int firstUserNumber, int secondUserNumber) {
        int resultRozrahunku = (firstUserNumber + secondUserNumber) * mnozhnyk;
        String formulaRozrahunku = "( " + firstUserNumber + " + " + secondUserNumber + " ) " + " * " + mnozhnyk;
        PrintToConsole.printResult(formulaRozrahunku, resultRozrahunku);
        return resultRozrahunku;
    }

    public double subtraction(double firstUserNumber, int secondUserNumber) {

        double resultRozrahunku = (firstUserNumber - secondUserNumber) * mnozhnyk;
        String formulaRozrahunku = "( " + firstUserNumber + " - " + secondUserNumber + " ) " + " * " + mnozhnyk;
        PrintToConsole.printResult(formulaRozrahunku, resultRozrahunku);
        return resultRozrahunku;
    }

    public int division(int firstUserNumber, int secondUserNumber) {
        int resultRozrahunku = (firstUserNumber / secondUserNumber) * mnozhnyk;
        String formulaRozrahunku = "( " + firstUserNumber + " / " + secondUserNumber + " ) " + " * " + mnozhnyk;
        PrintToConsole.printResult(formulaRozrahunku, resultRozrahunku);
        return resultRozrahunku;
    }

    public String sum(String test, String row) {
        String result = (test + row).repeat(mnozhnyk);
        PrintToConsole.printResult(result);
        return result;
    }

}
