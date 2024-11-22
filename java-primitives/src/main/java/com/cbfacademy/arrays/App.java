package com.cbfacademy.arrays;

public class App {
    public static void main(String[] args) {
        // Create an array of 8 integer elements
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        // Create an array of 12 float elements
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.0f, 11.1f, 12.2f};
        // Create an array of 5 double elements
        double[] doubleArray = {1.11, 2.22, 3.33, 4.44, 5.55};
        // Create an array of 6 Boolean elements
        Boolean[] booleanArray = {true, false, true, false, true, false};

        // Print the 5th element of each array
        System.out.println("5th element of intArray: " + intArray[4]);
        System.out.println("5th element of floatArray: " + floatArray[4]);
        System.out.println("5th element of doubleArray: " + doubleArray[4]);
        System.out.println("5th element of booleanArray: " + booleanArray[4]);
    }
}



