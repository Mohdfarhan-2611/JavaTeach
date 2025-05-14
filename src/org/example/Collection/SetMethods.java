package org.example.Collection;

import java.util.*;

public class SetMethods {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(50);
        set1.add(10);
        set1.add(30);
        set1.add(50);

        System.out.println("Hashset: "+set1);

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(set1);

        //Retrive
        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }




        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(50);
        set2.add(10);
        set2.add(30);
        set2.add(50);

        System.out.println("LinkedHashSet "+set2);



        Set<Integer> set3 = new TreeSet<>();
        set3.add(50);
        set3.add(10);
        set3.add(30);
        set3.add(50);

        System.out.println("TreeSet: "+ set3);






    }
}
