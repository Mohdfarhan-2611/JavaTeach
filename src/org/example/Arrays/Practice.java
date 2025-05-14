package org.example.Arrays;

public class Practice {


    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] rev = new int[arr2.length];

//        int index = arr2.length-1;
//        for(int i=0; i<=arr2.length-1; i++){
//            rev[i] = arr2[index];
//            index--;
//        }
//
//
//        String[] result = new String[arr1.length];
//        int index2=0;
//        while (index2<arr2.length){
//            result[index2] = arr1[index2]+"+"+rev[index2];
//            index2++;
//        }
//
//        for(int i=0; i<result.length; i++){
//            System.out.println(result[i]);
//        }


      for(int i=0; i<arr1.length; ){
          for(int j=arr2.length-1; j>=0; ){
              System.out.println(arr1[i++]+"+"+arr2[j--]);
          }
      }






    }
}
