package org.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Duplicate_elements_count {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> duplicateNamesCount = names.stream()
        .filter(name -> names.indexOf(name) != names.lastIndexOf(name)) // Filter duplicates
        .collect(Collectors.groupingBy(
                name -> name,
                Collectors.counting()
        ));
        System.out.println(duplicateNamesCount);
         
        ////////////////////////////////////////////////////////////////////////////////////////
        List<String> names2 = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String, Long> nameCount = names2.stream()
        .collect(Collectors.groupingBy(name -> name, LinkedHashMap::new, Collectors.counting()));

        nameCount.entrySet().stream()
        .filter(entry -> entry.getValue() > 1)
        .forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));

    }
}

