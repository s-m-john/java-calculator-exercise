package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

         // Example usage
         double a = 10.5;
         double b = 4.2;
 
         System.out.println("Add: " + add(a, b));
         System.out.println("Subtract: " + subtract(a, b));
         System.out.println("Multiply: " + multiply(a, b));
         System.out.println("Are Equal: " + areEqual(a, b));
         System.out.println("Is Less Than: " + isLessThan(a, b));
         System.out.println("Is More Than: " + isMoreThan(a, b));
    }

    public static double add(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        return operand1 * operand2;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        return operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        return operand1 < operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        return operand1 > operand2;
    }
}
