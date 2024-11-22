package com.codingblackfemales;

import java.util.List;

public class Calculator {
    public static Integer add(final int firstInput, final int secondInput) {
        return firstInput + secondInput;
    }

    public static Integer subtract(final int firstInput, final int secondInput) {
        return firstInput - secondInput;
    }

    public static Integer multiply(final int firstInput, final int secondInput) {
        return firstInput * secondInput;
    }

    public static Integer divide(final int firstInput, final int secondInput) {
        if (secondInput == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return firstInput / secondInput;
    }
    
    public static Integer findMinimum(List<Integer> numbers) {
        return numbers.stream().min(Integer::compareTo).orElseThrow(() -> new IllegalArgumentException("List is empty"));
    }

    public static Integer findMaximum(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo).orElseThrow(() -> new IllegalArgumentException("List is empty"));
    }

    public static Double calculateAverage(List<Integer> numbers) {
        return numbers.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElseThrow(() -> new IllegalArgumentException("List is empty"));
    }

    public static Integer calculateElements(List<Integer> numbers) {
        return numbers.size();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(6, 9,15, -2, 92, 11);

        System.out.println("The minimum number is: " + findMinimum(numbers));
        System.out.println("The maximum number is: " + findMaximum(numbers));
        System.out.println("The average of the numbers is: " + calculateAverage(numbers));
        System.out.println("The number of elements in the list is: " + calculateElements(numbers));
    }
}

