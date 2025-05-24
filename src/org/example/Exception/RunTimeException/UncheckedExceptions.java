package org.example.Exception.RunTimeException;

public class UncheckedExceptions {
   //AirthMati Exception

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c=0;

        try {
            c = a / b; //stop
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero exception");;
        }

        System.out.println(c);

    }
}
