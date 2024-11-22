package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 3 == 0 && number % 5 == 0) {
                result.add("FizzBuzz");
            } else if (number % 3 == 0) {
                result.add("Fizz");
            } else if (number % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(number.toString());
            }
        }
        return result; 
}

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        //throw new RuntimeException("Not implemented");
        String month;
        switch (number) {
            case 1: month = "January";  break;  
            case 2: month = "February";  break;
            case 3: month = "March";  break;
            case 4: month = "April";  break;
            case 5: month = "May";  break;
            case 6: month = "June";  break;
            case 7: month = "July";  break;
            case 8: month = "August";  break;
            case 9: month = "September";  break;
            case 10: month = "October";  break;
            case 11: month = "November";  break;
            case 12: month = "December";  break;
            default: month = "Invalid month number";  break;
        }
        return month;
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            } else {
                sumOfOdds += i;
            }
        }
        System.out.println("Sum of Evens: " + sumOfEvens);
        System.out.println("Sum of Odds: " + sumOfOdds);
        return Map.of("sumOfEvens", sumOfEvens, "sumOfOdds", sumOfOdds);
    }

    public List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reversedList = new ArrayList<>(numbers);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
