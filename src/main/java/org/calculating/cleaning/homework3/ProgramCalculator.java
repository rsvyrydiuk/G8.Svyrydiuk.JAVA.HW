package org.calculating.cleaning.homework3;

import org.calculating.cleaning.homework3.calculator.Calculator;

import static org.calculating.cleaning.homework3.util.PrintToConsole.printResult;

public class ProgramCalculator {
    /**
     * For homework, create a separate Calculator class and a new homework3 package
     * Write a calculator that would multiply the results of actions by a multiplier number
     * This class (Calculator) should have two constructors:
     * - by default, this multiplier (mnognyk) should be equal to 2 (that is, hardcode the value and create the object with the default constructor)
     * - when creating an object, make it possible to set another value to this multiplier (in the designer, set the transferred value)
     * Create objects in the main program
     * calculatorMnognyk2 - with a default multiplier of 2
     * calculatorMnognyk5 - with a multiplier of 5
     * calculatorMnognyk1 - with a multiplier of 1
     * Perform actions:
     * int result_1 = calculatorMnognyk2.sum (int , int); // if we pass the values 3 and 5, then 16 should come out
     * double result_2 = calculatorMnognyk2.subtraction (double , int); // 20.0 and 5 - we will get 30.0
     * result_2 = calculatorMnognyk2.multiplication (int , int); // if we pass the values 2 and 3, then 12 should come out
     * double result_3 = calculatorMnognyk2.division (int , int); // if we pass the values 30 and 3, then 20.0 should come out
     * int result_4 = calculatorMnognyk5.sum (int , int); // if we pass the values 3 and 5, then 40 should come out
     * double result_5 = calculatorMnognyk5.subtraction (double , int); // 20.0 and 5 - we will get 75.0
     * result_5 = calculatorMnognyk5.multiplication (int , int); // if we pass the values 2 and 3, then 30 should come out
     * double result_6 = calculatorMnognyk5.division (int , int); // if we pass the values 30 and 3, then 50.0 should come out
     * String result_string_7 = calculatorMnognyk5.sum (String , String); // (Use the repeat method with String)
     * if we pass the values "_Test" and "_row" - we will get "_Test_row_Test_row_Test_row_Test_row_Test_row"
     * int result_8 = calculatorMnognyk1.sum (int , int); // if we pass the values 3 and 5, then 8 should come out
     * String result_string_9 = calculatorMnognyk1.sum (String , String); // "_Test" and "_row" - we will get "_Test_row_Test_row"
     * perform actions using methods from created objects
     * int result_10 = (((3 + 5) * 2 + (8 - 5) * 5) / 31.0 + 100.0) * 2
     * add up all the results (digital) and display them on the screen
     * for example like this:
     * System.out.println("Result of performing actions: " + (result_1 + result_2 + result_3 + result_4 + result_5 + result_6 + result_8 + result_10));
     * To output to the console, create a separate PrintToConsole class and methods in it:
     * printResult(String formulaRozrahunku, int resultRozrahunku) - which outputs the transferred text in the format:
     * printResult(String formulaRozrahunku, double resultRozrahunku) - which outputs the transmitted text in the format:
     * printResult(String formulaRozrahunku, String resultRozrahunku) - which outputs the transferred text in the format:
     * "The result of the action: " + formulaRozrahunku + " = " + result
     * Display all results on the screen in the format (each method must display the result of the action using the PrintToConsole method):
     * "The result of the action: (3 + 5) * 2= 16"
     * "The result of the action: (20.0 - 5) * 5 = 75.0" and so on
     */
    public static void main(String[] args) {

        Calculator calculatorMnognyk2 = new Calculator(3, 5);
        int result_1 = calculatorMnognyk2.sum(3, 5);
        double result_2 = calculatorMnognyk2.subtraction(20.0, 5);
        int result_3 = calculatorMnognyk2.multiplication(2, 3);
        double result_4 = calculatorMnognyk2.division(30, 3);


        Calculator calculatorMnognyk5 = new Calculator(5);

        int result_5 = calculatorMnognyk5.sum(3, 5);
        double result_6 = calculatorMnognyk5.subtraction(20.0, 5);
        int result_7 = calculatorMnognyk5.multiplication(2, 3);
        double result_8 = calculatorMnognyk5.division(30, 3);
        String result_string_9 = calculatorMnognyk5.sum("_Test", "_row");


        Calculator calculatorMnognyk1 = new Calculator(1);

        int result_10 = calculatorMnognyk1.sum(3, 5);
        String result_string_11 = calculatorMnognyk1.sum("_Test", "_row");


        System.out.println("Result of sum results: " + (result_1 + result_2 + result_3 + result_4 + result_5 + result_6 + result_7 + result_8 + result_10));
    }
}
