package org.example.Exception.RunTimeException;

public class ArrayIndex {


    public static void main(String[] args) {
        int a= 10;
        int b = 0;
        int c = 0;
        try {
            int [] arr = {1,2,3};
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound Exception "+e.getMessage());
        } finally {
            try {
                c = a/b;
            } catch (ArithmeticException e){
                System.out.println("Airthmatic Exception "+e.getMessage());
            }
            System.out.println("This is finally and always executed");
        }


        System.out.println("After try");
    }
}
