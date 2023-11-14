package org.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClassMap {
    public static void main(String[] args) {

        // | login | pass | pass1 |
        // | test  | 123  | 235   |

        Map<String, String> ourMap = new HashMap<>();
        ourMap.put("login", "test");
        ourMap.put("pass", "123");


        System.out.println(ourMap);
        ourMap.put("pass1", "235");

        System.out.println(ourMap);
        System.out.println(ourMap.size());
        System.out.println(ourMap.get("pass"));

        ourMap.put("pass", "999");
        System.out.println(ourMap);


        ourMap.remove("pass1");
        System.out.println(ourMap);

        System.out.println("--------------------------");


        // | login | pass | pass1 |
        // | test  | 123  | 235   |
        // | login | pass | pass1 |
        // | test1 | 678  | 765   |


        ArrayList<HashMap<String, String>> listMap = new ArrayList<>();

        listMap.add(new HashMap<>());
        listMap.get(0).put("login", "test");
        listMap.get(0).put("pass", "123");
        listMap.get(0).put("pass1", "235");

        System.out.println(listMap);

        listMap.add(new HashMap<>());
        listMap.get(1).put("login", "test1");
        listMap.get(1).put("pass", "678");
        listMap.get(1).put("pass1", "765");

        System.out.println(listMap);

        System.out.println(listMap.get(1).get("pass"));
        System.out.println(listMap.get(1));

        System.out.println("--------------------------");
        int count = 0;
        for (HashMap row : listMap) {
            System.out.println(count + " " + row);
            count++;
        }


    }
}
