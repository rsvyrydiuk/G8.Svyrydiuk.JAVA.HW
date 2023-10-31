package org.calculating.cleaning.part_2.rooms;

import org.calculating.cleaning.part_2.util.PrintToConsole;

import static org.calculating.cleaning.part_2.rooms.GeneralRoomConstants.TIME_FOR_WIPE_THE_DUST;

public class Room {
    private String nameOfRoom;
    private String longNameOfRoom;
    private double width;
    private double length;
    private int numberOfFurniture;
    private int numberOfWindows;

    private  double areaOfRoom;

    public Room(String nameOfRoom, double width, double length, int numberOfFurniture, int numberOfWindows) {
        this.nameOfRoom = nameOfRoom;
        this.width = width;
        this.length = length;
        this.numberOfFurniture = numberOfFurniture;
        this.numberOfWindows = numberOfWindows;
        areaOfRoom = width * length;
    }

    public String getLongNameOfRoom() {
        return longNameOfRoom;
    }

    public String getName() {
        return nameOfRoom;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public int getNumberOfFurniture() {
        return numberOfFurniture;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public double getAreaOfRoom() {
        return areaOfRoom;
    }

    public double calculatingTimeForVacuumCleanerAndMop(double actualRoomArea) {
        double time= actualRoomArea * (GeneralRoomConstants.TIME_FOR_VACUUM_CLEANER + GeneralRoomConstants.TIME_FOR_MOP);
        System.out.println("Time for vacuum cleaner and mop: " + actualRoomArea + " is " + time + " minutes");
        return time;
    }



    //Return time for vacuum cleaner and mop
    public double calculatingTimeForVacuumCleanerAndMop(){
        return  calculatingTimeForVacuumCleanerAndMop(areaOfRoom);
    }


    public double calculatingTimeForFurniture(){
        double time= numberOfFurniture * TIME_FOR_WIPE_THE_DUST;
        System.out.println("Time for furniture: " + numberOfFurniture + " is " + time+ " minutes");
        return time;
    }

    public double calculatingTimeForWindows(){
        double time= numberOfWindows * GeneralRoomConstants.TIME_FOR_CLEANING_WINDOW;
        System.out.println("Time for windows: " + numberOfWindows + " is " + time + " minutes");
        return time;
    }

    public double calculatingTotalTimeForCleaning(){
        double totalTime = calculatingTimeForVacuumCleanerAndMop() + calculatingTimeForFurniture() + calculatingTimeForWindows();
        System.out.println("Current room is " + nameOfRoom );
        PrintToConsole.printTotalValue(totalTime);
        return totalTime;
    }

}
