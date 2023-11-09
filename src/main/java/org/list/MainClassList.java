package org.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassList {
    public static void main(String[] args) {

        List <String> list_1;

        list_1 = new ArrayList<String>();

        System.out.println(list_1);
        list_1.add("Test_1");
        System.out.println(list_1);
        System.out.println(list_1.get(0));

        list_1.add("Test_2");
        list_1.add("");
        list_1.add("Test_4");
        System.out.println(list_1);
        list_1.add(0, "Test_0");
        list_1.add(2, "Test_11");
        System.out.println(list_1);

        list_1.remove(3);
        System.out.println(list_1);

        list_1.set(1, list_1.get(1) + "11");
        System.out.println(list_1);


        System.out.println("-----------------");

        for(int i = 0; i < list_1.size(); i++){
            System.out.println(i+1 + ". " +list_1.get(i));
        }


        for (String element : list_1) {
            System.out.println(element);
        }



        System.out.println("-----------------");


        ArrayList<Integer> listOfInteger = new ArrayList<>();

        listOfInteger.add(22);
        listOfInteger.add(11);
        listOfInteger.add(66);
        listOfInteger.add(44);

        System.out.println(listOfInteger);
        System.out.println("min value = " +Collections.min(listOfInteger));

        Collections.sort(listOfInteger);
        System.out.println(listOfInteger);

        Collections.reverse(listOfInteger);
        System.out.println(listOfInteger);


    }
}
