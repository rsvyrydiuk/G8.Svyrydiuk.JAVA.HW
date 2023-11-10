package org.homework5;

import java.util.ArrayList;

public class WorkWithList {

    public Integer findMaxValue(ArrayList list) {
        Integer max = -2147483648;
        for (int i = 0; i < list.size(); i++) {
            if (max < (int) list.get(i)) {
                max = (int) list.get(i);
            }
        }
        System.out.println("Max value = " + max);
        return max;
    }

    public ArrayList reverse(ArrayList list) {
        ArrayList list2 = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println("Reversed list " + list2);
        return list2;
    }
}
