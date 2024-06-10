package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AA_Terminal_Operations {

        public static void main(String[] args) {
            List<String> fruits = Arrays.asList("apple", "banana", "cherry", "apple");

            // forEach: Print each fruit
            fruits.stream().forEach(System.out::println);

            // collect: Collect fruits into a list
            List<String> fruitList = fruits.stream().collect(Collectors.toList());
            System.out.println(fruitList);

            // reduce: Concatenate all fruits into a single string
            Optional<String> concatenated = fruits.stream().reduce((s1, s2) -> s1 + ", " + s2);
            concatenated.ifPresent(System.out::println); // Output: apple, banana, cherry, apple

            // toArray: Convert stream to array
            String[] fruitArray = fruits.stream().toArray(String[]::new);
            System.out.println(Arrays.toString(fruitArray));

            // findFirst: Get the first fruit
            Optional<String> firstFruit = fruits.stream().findFirst();
            firstFruit.ifPresent(System.out::println); // Output: apple

            // findAny: Get any fruit (useful in parallel streams)
            Optional<String> anyFruit = fruits.stream().findAny();
            anyFruit.ifPresent(System.out::println); // Output: apple (or any other element)

            // count: Count the number of fruits
            long count = fruits.stream().count();
            System.out.println(count); // Output: 4

            // anyMatch: Check if any fruit starts with 'a'
            boolean anyMatch = fruits.stream().anyMatch(s -> s.startsWith("a"));
            System.out.println(anyMatch); // Output: true

            // allMatch: Check if all fruits start with 'a'
            boolean allMatch = fruits.stream().allMatch(s -> s.startsWith("a"));
            System.out.println(allMatch); // Output: false

            // noneMatch: Check if no fruit starts with 'z'
            boolean noneMatch = fruits.stream().noneMatch(s -> s.startsWith("z"));
            System.out.println(noneMatch); // Output: true
        }
    }

