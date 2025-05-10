package org.example.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethods {


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(10);

        List<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.addAll(list1);


        System.out.println(list2);

        list2.remove(1);
        list2.remove(Integer.valueOf(10));

        System.out.println(list2);

        list2.add(1,50);

        System.out.println(list2);


        //Retrive
        for(int i=0; i<list2.size(); i++){
            System.out.println(list2.get(i));
        }

        System.out.println("===============");
        for(int num : list2){
            System.out.println(num);
        }

        System.out.println("============");

        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
