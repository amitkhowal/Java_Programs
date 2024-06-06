package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_8_Programs {
    public static void main(String args[]) {

    // find duplicate elements in a given integers list in java using Stream functions
     List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          Set<Integer> set = new HashSet<>();
          myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);

    //find the first element of the list using Stream functions
    List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);   
    myList.stream()
        .findFirst()
        .ifPresent(System.out::println);

    // sort all the values present
    myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

    // array nums, return true if any value appears at least twice in the array, and return false if every element is distinct        
    Set<Integer> set1 = new HashSet<>(myList);
    boolean hasDuplicates = set.size() != myList.size();
    System.out.println(hasDuplicates);
       
    //get the current date and time using Java 8 Date and Time API
    System.out.println("Current Local Date: " + java.time.LocalDate.now());
    //Used LocalDate API to get the date
    System.out.println("Current Local Time: " + java.time.LocalTime.now());
    //Used LocalTime API to get the time
    System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
    //Used LocalDateTime API to get both date and time

    //Java 8 program to concatenate two Streams
     List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());

        // Concatenated the list1 and list2 by converting them into Stream

        concatStream.forEach(str -> System.out.print(str + " "));
    
    //Java 8 program to sort an array and then convert the sorted array into Stream
    int arr[] = { 99, 55, 203, 99, 4, 91 };
    Arrays.parallelSort(arr);
    // Sorted the Array using parallelSort()
     
    Arrays.stream(arr).forEach(n-> System.out.print(n + " "));
    /* Converted it into Stream and then
       printed using forEach */

  //count each element/word from the String ArrayList in Java8
  List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                                .stream()
                                .collect(
                                 Collectors.groupingBy(
                                   Function.identity()
                                 , Collectors.counting()
                                 ));
        System.out.println(namesCount);

// find only duplicate elements with its count from the String ArrayList in Java8

// find the Maximum element in an arraypublic static int findMaxElement(int[] arr) {
 // return Arrays.stream(arr).max().getAsInt();

 
}
}


