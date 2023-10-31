package org.calculating.cleaning.part_2;

import org.calculating.cleaning.part_2.rooms.Room;
import org.calculating.cleaning.part_2.util.PrintToConsole;

public class CalculatingCleaningTimeForRooms {

    /**      1.1 Calculate time for TimeForVacuumCleanerAndMop and total time for cleaning
                one 'Living room' room 3.4x4.6
                  (2 pieces of furniture and 1 window )
        1.2 Calculate time for TimeForVacuumCleanerAndMop, timeWindows, timeWindows and total time for cleaning
                one 'Children room' room 2.5x3.5
                  (1 piece of furniture and 2 windows)
             change number of furniture to 10 and calculatingTotalTimeForCleaning
        1.3 Calculate time for TimeForVacuumCleanerAndMop and total time for cleaning
                one 'Cabinet' room 2x3
                  (1 piece of furniture and 2 windows)
        1.4 Calculate time for TimeForVacuumCleanerAndMop and total time for cleaning
                one 'Bathroom' room 1.5x2
                  (1 piece of furniture and 1 windows)

        2.1 Calculate total area of rooms
        2.2 Calculate total time for cleaning all rooms
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
    }
}
