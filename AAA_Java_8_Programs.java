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

public class AAA_Java_8_Programs {
    public static void main(String args[]) {

     List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

    //find the first element of the list using Stream functions
    List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);   
    myList.stream().findFirst().ifPresent(System.out::println);

    // sort all the values present
    myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
       
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

        List<String> concatStream = Stream.concat(list1.stream(), list2.stream()).toList();
        String sentence = String.join(" ", concatStream);
        System.out.println(sentence);
        System.out.println(concatStream);

    //Java 8 program to sort an array and then convert the sorted array into Stream
    int arr[] = { 99, 55, 203, 99, 4, 91 };
    Arrays.parallelSort(arr);
    // Sorted the Array using parallelSort()
     
    Arrays.stream(arr).forEach(n-> System.out.print(n + " "));

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
  //printed using forEach
        namesCount.forEach((key, value) -> System.out.println(key + ": " + value));

        //Sort a given list of decimals in reverse order
        List<Double> decimals = Arrays.asList(3.14, 2.71, 1.618, 0.577, 1.414);
        // Sort decimals in reverse order
        decimals.sort(Collections.reverseOrder());
        System.out.println("Decimals sorted in reverse order: " + decimals);
}
}


