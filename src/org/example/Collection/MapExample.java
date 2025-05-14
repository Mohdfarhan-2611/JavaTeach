package org.example.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Java");
        map1.put(102, "Python");
        map1.put(103, "JavaScript");
        map1.put(101, "C++");
        map1.put(104, "Python");
        map1.put(null, "Hindi");
        map1.put(null, "English");
        map1.put(1, null);
        map1.put(2, null);

        System.out.println("Hashmap: "+map1);

        System.out.println(map1.get(102));

        System.out.println(map1.keySet());

        //foreach
        for(Integer num : map1.keySet()){
            System.out.println(num +":"+ map1.get(num));
        }

        System.out.println("====================");

        //Iterate
        for (Map.Entry<Integer, String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }



    }
}
