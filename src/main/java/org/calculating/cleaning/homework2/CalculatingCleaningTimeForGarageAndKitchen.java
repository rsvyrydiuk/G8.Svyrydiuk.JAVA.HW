package org.calculating.cleaning.homework2;

public class CalculatingCleaningTimeForGarageAndKitchen {
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
     *          - Calculate time for washing Dishes and print result (Like "For one dish we need 1.5 minutes so for 8 dishes we need 12 minutes")
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
        double timeForWashByKarcherDefault=0.5f;
        byte timeForWipeTheDustDefault = 1, timeForWindowsDefault = 5, timeForMopDefault = 3;
        double timeForWashDishDefault= (timeForMopDefault+timeForWindowsDefault)/2;

        String longNameOfRoom_1="Garage";
        int numberOfWindowsRoom_1=1;

        double widthOfRoom_1=3.5;
        double lengthOfRoom_1=6;

        double widthOfGate_1=1.8;
        double highOfGate=3.3;




        printTextLikeHeader("Start calculation time for cleaning " +longNameOfRoom_1);

        double areaOfRoom_1=calculateAreaOfRoom(widthOfRoom_1,lengthOfRoom_1);
        double timeForMopByKarcherRoom_1= roundResult(areaOfRoom_1 * timeForMopDefault/2.0);

        double timeForWindowsRoom_1= numberOfWindowsRoom_1 * timeForWindowsDefault;


        double areaOfGate=roundResult(calculateAreaOfRoom(widthOfGate_1,highOfGate));
        double timeForWashByKarcherGate= roundResult(areaOfGate * timeForWashByKarcherDefault*2);
        printLikeTotalTime("Gate with area " + areaOfGate + " square meters we need" , timeForWashByKarcherGate, " minutes" );


        double totalTimeForRoom_1=timeForMopByKarcherRoom_1 + timeForWindowsRoom_1+timeForWashByKarcherGate;
        printLikeTotalTime(longNameOfRoom_1 , totalTimeForRoom_1, " minutes" );

        printTextLikeHeader("Finish calculation time for cleaning " +longNameOfRoom_1);



        //General variables2
        int numberOfWindowsRoom_2 = 2;
        int numberOfFurnitureRoom_2=14;
        int numberOfDishes=8;
        double widthOfRoom_2=2.5, lengthOfRoom_2=3.5;
        String longNameOfRoom_2="Kitchen";



        printTextLikeHeader("Start calculation time for cleaning " +longNameOfRoom_2);


        double areaOfRoom_2=roundResult(calculateAreaOfRoom(widthOfRoom_2,lengthOfRoom_2));
        double timeForMopRoom_2= roundResult(areaOfRoom_2 * timeForMopDefault);

        double timeForWindowsRoom_2= numberOfWindowsRoom_2 * timeForWindowsDefault;

        double timeForFurnitureRoom_2= numberOfFurnitureRoom_2 * timeForWipeTheDustDefault;

        double timeForWashDish= numberOfDishes * timeForWashDishDefault;

        printLikeTotalTime("one dish we need " + timeForWashDishDefault + " minutes so for " + numberOfDishes +" dishes we need", timeForWashDish, " minutes" );

        double totalTimeForRoom_2=timeForMopRoom_2 + timeForWindowsRoom_2 + timeForFurnitureRoom_2 + timeForWashDish;
        printLikeTotalTime(longNameOfRoom_2,  totalTimeForRoom_2, " minutes");

        printTextLikeHeader("Finish calculation time for cleaning " +longNameOfRoom_2);



        double totalTimeForRoom_1AndRoom_2=roundResult(totalTimeForRoom_1+totalTimeForRoom_2);
        printLikeTotalTime(longNameOfRoom_1 +" with area " + areaOfRoom_1 + " and " + longNameOfRoom_2 +" with area " + areaOfRoom_2 + " is" , totalTimeForRoom_1AndRoom_2, " minutes");


    }

    private static double calculateAreaOfRoom( double width, double length){
        double area = width * length;
        return area;
    }

    private static void printTextLikeHeader(String  text){
        String headerSymbol = "-".repeat(10);
        String spaces = " ".repeat(2);
        System.out.println(headerSymbol + spaces + text + spaces + headerSymbol);
    }

    private static void printLikeTotalTime( String room, double result, String unit) {
        System.out.println("!!TOTAL_TIME!! for " + room + " " + result + unit);
    }

    private static double roundResult(double value){
        return  Math.round(value *10)/10.0;

    }

}
