package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_Each_Character_In_String {
    public static void main(String args[]) {
        String s = "Amit is a backend developer";

        Map<String, Long> mp=Arrays.stream(s.split(""))           // .filter(n -> !n.equals(" ")) // Skip spaces
        						.map(n->n.toLowerCase())
        						.collect(Collectors.groupingBy(str->str,LinkedHashMap::new, Collectors.counting()));
        mp.forEach((key,value)->System.out.println((key+":"+value)));
//------------------------------------------------------------------------------------------------------------- 
        Map<String,Long> wordsCount = Arrays.stream(s.split(""))
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordsCount);
        
//-------------------------------------------------------------------------------------------------------------

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names.stream()
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(namesCount);

    //Function.identity() is used to indicate that the elements themselves should be the keys in the resulting map.

        List<String> names2 = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String, Long> nameCount = names2.stream()
                .collect(Collectors.groupingBy(name -> name, LinkedHashMap::new, Collectors.counting()));

        nameCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));

    }
}