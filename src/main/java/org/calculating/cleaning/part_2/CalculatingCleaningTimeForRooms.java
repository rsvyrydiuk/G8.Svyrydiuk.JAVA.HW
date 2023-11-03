package org.calculating.cleaning.part_2;

import org.calculating.cleaning.part_2.rooms.Room;
import org.calculating.cleaning.part_2.util.PrintToConsole;

public class CalculatingCleaningTimeForRooms {

    /**
     * 1.1 Calculate time for TimeForVacuumCleanerAndMop and total time for cleaning
     * one 'Living room' room 3.4x4.6
     * (2 pieces of furniture and 1 window )
     * 1.2 Calculate time for TimeForVacuumCleanerAndMop, timeWindows, timeWindows and total time for cleaning
     * one 'Children room' room 2.5x3.5
     * (1 piece of furniture and 2 windows)
     * change number of furniture to 10 and calculatingTotalTimeForCleaning
     * 1.3 Calculate time for TimeForVacuumCleanerAndMop and total time for cleaning
     * one 'Cabinet' room 2x3
     * (1 piece of furniture and 2 windows)
     * 1.4 Calculate time for TimeForVacuumCleanerAndMop and total time for cleaning
     * one 'Bathroom' room 1.5x2
     * (1 piece of furniture and 1 windows)
     * <p>
     * 2.1 Calculate total area of rooms
     * 2.2 Calculate total time for cleaning all rooms
     */
    public static void main(String[] args) {
        Room livingRoom = new Room("Living room", 3.4, 4.6, 2, 1);
        System.out.println(livingRoom.getAreaOfRoom());

//        livingRoom.calculatingTimeForVacuumCleanerAndMop();
//        livingRoom.calculatingTimeForVacuumCleanerAndMop(25);
        PrintToConsole.printLikeHeader("Start to work with Room1");
        livingRoom.calculatingTotalTimeForCleaning();


        Room childrenRoom = new Room("Children room", 2.5, 3.5, 1, 2);

        PrintToConsole.printLikeHeader("Start to work with Children room");
        childrenRoom.calculatingTotalTimeForCleaning();

        Room cabinet = new Room("Cabinet", 2, 3, 1, 2);
        PrintToConsole.printLikeHeader("Start to work with Cabinet");
        cabinet.calculatingTotalTimeForCleaning();

        Room bathroom = new Room("Bathroom", 1.5, 2, 1, 1);


        // ---- Arrays ---- Massive
        System.out.println();
        System.out.println("---- Arrays ---- Massive");
        int[] massive = {2, 5, 4};


        System.out.println(massive);
        System.out.println(massive.length);
        System.out.println(massive[2]);

        double[] roomsArea = {livingRoom.getAreaOfRoom(), childrenRoom.getAreaOfRoom(), cabinet.getAreaOfRoom()};

        System.out.println("Rooms areas array length: " + roomsArea.length);

        double totalArea = 0;

        for (int i = 0; i < roomsArea.length; i++) {
            totalArea = totalArea + roomsArea[i];
            System.out.println(i + 1 + ". " + totalArea);
        }


        double[] roomsArea_v2 = new double[10];
        roomsArea_v2[0] = livingRoom.getAreaOfRoom();
        roomsArea_v2[1] = childrenRoom.getAreaOfRoom();
        roomsArea_v2[2] = cabinet.getAreaOfRoom();

        for (int i = 0; i < roomsArea_v2.length; i++) {

            if (roomsArea_v2[i] > 0 & roomsArea_v2[i] < 10) {
                // !true = false
                System.out.println("Room " + (i + 1) + " area is " + roomsArea_v2[i] + " square meters");
            } else if (roomsArea_v2[i] >= 10) {
                System.out.println("BIG Room " + (i + 1) + " area is " + roomsArea_v2[i] + " square meters");
            } else {
                System.out.println("Room isn't set");
            }
            //System.out.println("Room " + (i +1)  + " area is " + roomsArea_v2[i] + " square meters");
        }


        PrintToConsole.printLikeHeader("Exception");

        childrenRoom.dividingCleaningWindowByPerson(2);
        childrenRoom.dividingCleaningWindowByPerson(1);
        childrenRoom.dividingCleaningWindowByPerson(0);

        childrenRoom.dividingCleaningWindowByPerson(null);

        PrintToConsole.printLikeHeader("The end");


    }
}
