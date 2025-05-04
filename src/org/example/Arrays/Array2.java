package org.example.Arrays;

public class Array2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int[] arr = {10,20,30,40,50,60}; //initialize
        int[] arr2 = new int[4];  //Denfine
        arr2[0]=10;               //Initializrion
        arr2[1]=20;
        arr2[2]=30;
        arr2[3]=40;
        arr2[4]=60;
        arr2[5]=70;

        //Normal Loop
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        System.out.println("===========");

//        //For each
//        //for(PrimitiveDataType variable : Array)
//        for(int j : arr){
//
//            System.out.println(j);
//        }
//
//        System.out.println("===================");
//
//        String[] names = {"farhan","Jacob", "Jason"};
//        for(String name : names){
//            System.out.println(name);
//        }\

//        Object[] arr3 = {1, "Farhan", true};





    }
}
