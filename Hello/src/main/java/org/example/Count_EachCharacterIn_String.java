package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_EachCharacterIn_String {
    public static void main(String args[]) {
        String s = "Amit is a backend developer";

        Map<String, Long> mp=Arrays.stream(s.split(""))
        						.map(n->n.toLowerCase())
        						.collect(
        						Collectors.groupingBy(
        							str->str,LinkedHashMap::new,
        							Collectors.counting()));
                mp.forEach((key,value)->System.out.println((key+":"+value)));
//------------------------------------------------------------------------------------------------------------- 
        //below code is grouping each word and counting its count
        Map<String,Long> wordsCount = Arrays.stream(s.split(" "))
                .collect(
                  Collectors.groupingBy(
                    Function.identity(), Collectors.counting()
                  ));
        System.out.println(wordsCount);
        
//-------------------------------------------------------------------------------------------------------------

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                                .stream()
                                .collect(
                                 Collectors.groupingBy(
                                   Function.identity(),
                                   Collectors.counting()));
        System.out.println(namesCount);

        

    }
}