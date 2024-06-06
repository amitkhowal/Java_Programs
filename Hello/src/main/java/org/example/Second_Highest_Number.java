package org.example;

import java.util.Arrays;

public class Second_Highest_Number {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 2, 8, 15};
        
        int secondHighest = Arrays.stream(numbers)
                                  .boxed() // Convert int to Integer
                                  .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                                  .distinct() // Remove duplicates
                                  .skip(1) // Skip the first element (highest)
                                  .findFirst() // Get the first element remaining (second highest)
                                  .orElseThrow(() -> new IllegalArgumentException("Array is empty"));

        System.out.println("Second highest number: " + secondHighest);
    }
}
