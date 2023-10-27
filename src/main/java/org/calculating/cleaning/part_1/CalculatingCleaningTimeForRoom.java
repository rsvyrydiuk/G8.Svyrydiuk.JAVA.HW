package org.calculating.cleaning.part_1;

public class CalculatingCleaningTimeForRoom {
    /**
     *      Homework #2:
     *      For this homework you should create
     *          -  separate package 'org.calculating.cleaning.homework2'
     *          -  separate class 'CalculatingCleaningTimeForGarageAndKitchen' and put there all your code.
     *
     *      Task 2.1 Calculate time for cleaning room 'Garage' and 'Kitchen'
     *      Garage 3.5x6 (1 gate (1.8 x 3.3) and 1 window)
     *          - Gate should be washed by Karcher on both sides
     *          - Floor should be cleaned by Karcher (time is 2 times less than for mop)
     *      Kitchen 2.5x3.5 (2 windows, 14 pieces of furniture and 8 dishes)
     *          - Floor should be cleaned only by mop
     *          - Wash dishes (time for washing 1 dish is middle between time for mop and cleaning the window) (middle time means: (time for mop + time for cleaning the window) / 2)
     *
     *          Result should be printed like:
     *          - Calculate time for washing Gate and print result (Like "For one dish we need 1.5 minutes so for 8 dishes we need 12 minutes")
     *          - Calculate time for cleaning Gate and print result (Like "For gate with area 5.94 square meters we need 2.97 minutes")
     *          - Calculate time for cleaning two room 'Garage' and 'Kitchen' separately and print result
     *          - Calculate time for cleaning two room 'Garage' and 'Kitchen' together - total time, and print result
     *              (Like "Total time for *Garage* with area 15 and *Kitchen* with area 12 is 10.5 minutes")
     *
     *          For calculating Areas create separate methods and use it every time when you need to calculate area of room, gate, etc.:
     *          - calculate area of room (Create method 'calculateAreaOfRoom' which will calculate area of room) that will return area of room as double
     *
     *          For printing special TEXT create and use next methods:
     *          - print result like header (Create method 'printLikeHeader' which will print text like header).
     *          - print result like !!TOTAL_TIME!! + result + text (Create method 'printLikeTotalTime' which will print text like !!TOTAL_TIME!! + result +text)
     *
     *          For rounding result create and use next method:
     *          - round result to 1 decimal places (Create method 'roundResult' which will round result to 1 decimal places)

     *   Assumptions:
     *       for 1 square meter of room we need 1.5 minute to clean it by vacuum cleaner
     *       for 1 square meter of room we need 3 minute to clean it by mop
     *       for 1 square meter of gate we need 0.5 minute to wash it by Karcher
     *       for wipe the dust on one piece of furniture we need 1 minute
     *       for clean the window we need 5 minutes
     *
     *       Tips:
     *       - Try to do step by step (as we did on lesson)
     *
     */

    public static void main(String[] args) {

        //General variables
        float timeForVacuumCleanerDefault = 1.5f;
        byte timeForMopDefault = 3, timeForWipeTheDustDefault = 1, timeForWindowsDefault = 5;


       // String nameOfRoom_1="Living room1";
        int numberOfFurnitureRoom_1=2;
        int numberOfWindowsRoom_1=1;

        double widthOfRoom_1=3.5;
        double lenghOfRoom_1=4.25;

        String longNameOfRoom_1="Living room1";



        printTextLikeHeader("Start calculation time for cleaning " +longNameOfRoom_1);

        double areaOfRoom_1= rounding(widthOfRoom_1 * lenghOfRoom_1);
        System.out.println("Area is " + areaOfRoom_1);


        double timeForVacuumCleanerAndMopRoom_1= rounding(areaOfRoom_1 * (timeForMopDefault+timeForVacuumCleanerDefault));
        System.out.println("Time for vacuum cleaner and mop is " + timeForVacuumCleanerAndMopRoom_1);


        double timeForFurnitureRoom_1= numberOfFurnitureRoom_1 * timeForWipeTheDustDefault;
        System.out.println("Time for windows is " + timeForFurnitureRoom_1);

        double timeForWindowsRoom_1= numberOfWindowsRoom_1 * timeForWindowsDefault;
        System.out.println("Time for windows is " + timeForWindowsRoom_1);

        double totalTimeForRoom_1=timeForVacuumCleanerAndMopRoom_1 + timeForFurnitureRoom_1 + timeForWindowsRoom_1;
        System.out.println("Total time for " +longNameOfRoom_1 + " is " + totalTimeForRoom_1);


        printTextLikeHeader("Finish calculation time for cleaning " +longNameOfRoom_1);



        //General variables2

      //  String nameOfRoom_2="Cold room";
        int numberOfWindowsRoom_2 = 2;
        double widthOfRoom_2=2.5, lenghOfRoom_2=3.5;
        char typePfCleaning = 'A';

        String longNameOfRoom_2="Cold room";



        printTextLikeHeader("Start calculation time for cleaning " +longNameOfRoom_2);

        double areaOfRoom_2= rounding(widthOfRoom_2 * lenghOfRoom_2);
        System.out.println("Area is " + areaOfRoom_2);


        double timeForVacuumCleanerAndMopRoom_2= rounding(areaOfRoom_2 * (timeForMopDefault+timeForVacuumCleanerDefault));
        System.out.println("Time for vacuum cleaner and mop is " + timeForVacuumCleanerAndMopRoom_2);


        double timeForWindowsRoom_2= numberOfWindowsRoom_2 * timeForWindowsDefault;
        System.out.println("Time for windows is " + timeForWindowsRoom_2);

        double totalTimeForRoom_2=timeForVacuumCleanerAndMopRoom_2 + timeForWindowsRoom_2;
        System.out.println("Total time for " +longNameOfRoom_2 + " is " + totalTimeForRoom_2);


        printTextLikeHeader("Finish calculation time for cleaning " +longNameOfRoom_2);

    }

    private static void printTextLikeHeader(String  text){

        String headerSymbol = "-".repeat(10);
        String spaces = " ".repeat(2);

        System.out.println(headerSymbol + spaces + text + spaces + headerSymbol);
    }


    private static double rounding(double value){
        return  Math.round(value * 100.0)/100.0;
    }


}
