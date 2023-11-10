package org.homework5;

import java.util.ArrayList;

public class HomeWorkWithList {
    public static void main(String[] args) {

        WorkWithList workWithList = new WorkWithList();

        ArrayList list;
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(6);


        //1
        workWithList.findMaxValue(list);

        //2
        workWithList.reverse(list);


        list.add(-5);
        list.add(0);
        list.add(10);
        workWithList.findMaxValue(list);
        workWithList.reverse(list);

    }

}
