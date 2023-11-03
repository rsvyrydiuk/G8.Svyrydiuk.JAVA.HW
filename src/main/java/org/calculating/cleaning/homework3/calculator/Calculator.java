package org.calculating.cleaning.homework3.calculator;

import org.calculating.cleaning.homework3.util.PrintToConsole;

public class Calculator {
    private int mnozhnyk;
    private int firstUserNumber;
    private int secondUserNumber;
    private double doubleUserNumber;
    private double doubleUserNumber2;


    public Calculator() {

        this.mnozhnyk = GeneralCalculatorConstant.DEFAULT_MNOGNYK;
    }


    public Calculator(int mnozhnyk) {

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

    public double sum(double firstUserNumber, double secondUserNumber) {
        double resultRozrahunku = (firstUserNumber + secondUserNumber) * mnozhnyk;
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
        try {
            int resultRozrahunku = (firstUserNumber / secondUserNumber) * mnozhnyk;
            String formulaRozrahunku = "( " + firstUserNumber + " / " + secondUserNumber + " ) " + " * " + mnozhnyk;
            PrintToConsole.printResult(formulaRozrahunku, resultRozrahunku);
            return resultRozrahunku;
        } catch (ArithmeticException e) {
            String formulaRozrahunku = "( " + doubleUserNumber + " / " + doubleUserNumber2 + " ) " + " * " + mnozhnyk;
            System.out.println("ArithmeticException for --- " + formulaRozrahunku);
            return 8888;
        } catch (Exception e) {
            System.out.println("Error occurred --- ");
            return 9999;
        }
    }

    public Integer division(Integer firstUserNumber, Integer secondUserNumber) {
        try {
            Integer resultRozrahunku = (firstUserNumber / secondUserNumber) * mnozhnyk;
            String formulaRozrahunku = "( " + firstUserNumber + " / " + secondUserNumber + " ) " + " * " + mnozhnyk;
            PrintToConsole.printResult(formulaRozrahunku, resultRozrahunku);
            return resultRozrahunku;
        } catch (ArithmeticException e) {
            String formulaRozrahunku = "( " + doubleUserNumber + " / " + doubleUserNumber2 + " ) " + " * " + mnozhnyk;
            System.out.println("ArithmeticException for --- " + formulaRozrahunku);
            return 8888;
        } catch (Exception e) {
            System.out.println("Error occurred --- ");
            return 9999;
        }

    }

    public double division(double doubleUserNumber, double doubleUserNumber2) {
        try {
            double resultRozrahunku = (doubleUserNumber / doubleUserNumber2) * mnozhnyk;
            String formulaRozrahunku = "( " + doubleUserNumber + " / " + doubleUserNumber2 + " ) " + " * " + mnozhnyk;
            PrintToConsole.printResult(formulaRozrahunku, resultRozrahunku);
            return resultRozrahunku;
        } catch (ArithmeticException e) {
            String formulaRozrahunku = "( " + doubleUserNumber + " / " + doubleUserNumber2 + " ) " + " * " + mnozhnyk;
            System.out.println("ArithmeticException for --- " + formulaRozrahunku);
            return 8888;
        } catch (Exception e) {
            System.out.println("Error occurred --- ");
            return 9999;
        }
    }

    public String sum(String test, String row) {
        String result = (test + row).repeat(mnozhnyk);
        PrintToConsole.printResult(result);
        return result;
    }

}
