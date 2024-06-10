package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AA_Intermediate_Operations {

        public static void main(String[] args) {
            List<String> fruits = Arrays.asList("apple", "banana", "cherry", "apple");

            // Filter: Select fruits starting with 'a'
            Stream<String> filteredStream = fruits.stream().filter(s -> s.startsWith("a"));

            // Map: Convert each fruit to uppercase
            Stream<String> mappedStream = filteredStream.map(String::toUpperCase);

            // Distinct: Remove duplicates
            Stream<String> distinctStream = mappedStream.distinct();

            // Sorted: Sort fruits in natural order
            Stream<String> sortedStream = distinctStream.sorted();

            // Limit: Get only the first 2 fruits
            Stream<String> limitedStream = sortedStream.limit(2);

            // Skip: Skip the first fruit
            Stream<String> skippedStream = limitedStream.skip(1);

            // Collect the final result to a list
            List<String> result = skippedStream.collect(Collectors.toList());

            System.out.println(result); // Output: [APPLE]
        }
}
