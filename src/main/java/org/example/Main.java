package org.example;

import java.util.Arrays;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press ⇧F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press ⇧F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing ⌘F8.
            System.out.println("i = " + i);
        }

        String name = "John";
        System.out.println(name);

//        final int myNum = 15;
        int myNum; // -2147483648 to 2147483647
        myNum = 15;
        System.out.println(myNum);

        myNum = 20;  // myNum is now 20
        System.out.println(myNum);

        byte myByteNum = 100; // -128 to 127
        float myFloatNum = 5.99f;
        double myDoubleNum = 19.99d;
        // The short data type can store whole numbers from -32768 to 32767:
        short myShortNum = 5000;
        long myLongNum = 15000000000L; // -9223372036854775808 to 9223372036854775807
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars.length);
        System.out.println(Arrays.toString(cars));
        int[] myNums = {10, 20, 30, 40};

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        System.out.println(sum(10));
        System.out.println(sum(5, 10));
    }

    static void myMethod(String fname) {
        System.out.println("I just got executed!");
        System.out.println(fname + " Refsnes");
    }

    // Recursion
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

}