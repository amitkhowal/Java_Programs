package org.example;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_MultipleStreams_Questions {
    public static void main(String[] args)
    {
    //How to create Stream interface Object
    //Stream API-Collection process //COllection /group of objects

    //1- Blank
    //Stream<Object> emptyStream=Stream.empty();

    //2-Array,Object,Collection
    String names[] = { "Amit", "Saurav", "Rahul", "Anustup" };
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(System.out::println);
    //Stream Builder
    Stream <Object> streamBuilder=Stream.builder().build();
    //
    IntStream stream=Arrays.stream((new int[]{2,3,4,45,5}));
    stream.forEach(System.out::println);
    //List , Set
    List<Integer> list3=Arrays.asList(2,3,4,5,6);//non mutable

    //Different ways to create a stream 
    //From Collections
    List<Integer> salary=Arrays.asList(200,2333,444,232,4334);
    Stream<Integer> streamInteger=salary.stream();

    // from arrays
    Integer[] arr={200,2333,444,232,4334};
    Stream<Integer> streamArr=Stream.of(arr);

    //from static method 
    Stream<Integer> streamInteger1=Stream.of(200,2333,444,232,4334);

    //from Stream Builder
    Stream.Builder<Integer> streamBuilder1=Stream.builder();
    streamBuilder1.add(200).add(344).add(232);
    Stream<Integer> stream2=streamBuilder1.build();

    //from stream iterate
    Stream<Integer> streamFromBuilder=Stream.iterate(100,(Integer n)-> n+5000).limit(5);
    
    //filter (predicte)
    //predicate return the boolean value function ex:- e->e>10

    //map(function)
    //map usees function
    //that perform each element operation
    List<String> list=Arrays.asList("Amit", "Saurav", "Rahul", "Anustup" );
    List<String> newNames=list.stream().filter(n->n.startsWith("A")).toList();
    System.out.println(newNames);

    //squre of a number
    List<Integer> list4=Arrays.asList(2,3,4,5,6);//non mutable
    List<Integer> squareList=list4.stream().map(n->n*n).toList();
    System.out.println(squareList);

    //new way to show result
    newNames.forEach(System.out::println);

    //sorted
    list.stream().sorted().forEach(System.out::println);

    //Min
    int minimum=list3.stream().min(Integer::compareTo).get();
    System.out.println(minimum);

    //Max
    int maximum=list3.stream().max(Integer::compareTo).get();
    System.out.println(maximum);

    long count=list3.stream().count();
    System.out.println(count);

    //sorting using comparator
    list3.stream().sorted(Integer::compareTo).forEach(System.out::println);

    //firstRepeatedChar
    String s="java is used in Backend".toLowerCase();
    Map<String,Long> charCountMap=Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
    String firstRepeatedChar=charCountMap.entrySet()
                                         .stream()
                                         .filter(e->e.getValue()>1)
                                         .map(e->e.getKey())
                                         .findFirst()
                                         .get();
        System.out.println(firstRepeatedChar);

    //find the maximum value element
        int max =  list4.stream()
                           .max(Integer::compare)
                           .get();
          System.out.println(max);           
}
}
