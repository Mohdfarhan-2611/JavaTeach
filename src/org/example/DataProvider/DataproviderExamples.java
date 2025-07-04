package org.example.DataProvider;

import java.util.*;

public class DataproviderExamples {


    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);

        Object[][] objArray = new Object[][]{{"1",2,"farhan"}, {"4",5,"Farhan2"}};

        List<Object[][]> dataArray = new ArrayList<>();
        dataArray.add(objArray);

        Iterator<Object[][]> it = dataArray.iterator();
        while (it.hasNext()){
            System.out.println();
        }

    }

}
