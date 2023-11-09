package org.list;

import java.util.ArrayList;

public class MainClassListList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listList = new ArrayList<>();
        System.out.println(listList);
        listList.add(new ArrayList<>());
        System.out.println(listList);
        listList.get(0).add("Test_00");
        listList.get(0).add("Test_01");
        System.out.println(listList);
        listList.add(new ArrayList<>());
        listList.get(1).add("Test_10");
        //listList.get(1).add("Test_11");
        System.out.println(listList);

        System.out.println(listList.get(0).get(1));
        System.out.println(listList.get(1));

        listList.add(1, new ArrayList<>());
        listList.get(1).add("Test_11");
        System.out.println(listList);
        listList.remove(2);
        System.out.println(listList);

        //New_Test1,New_Test2

        ArrayList<String> newList = new ArrayList<>();
        newList.add("New_Test1");
        newList.add("New_Test2");
        System.out.println(newList);

        listList.add( newList);
        System.out.println(listList);


        newList.add("New_Test3");

        System.out.println(newList);
        System.out.println(listList);

        listList.add(new ArrayList<>());
        listList.get(3).addAll(newList);
        System.out.println(listList);


        newList.add("New_Test4");
        System.out.println(newList);
        System.out.println(listList);
    }
}
