package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_Element_in_List {
    public static void main(String[] args)
    {
        List<Integer> mylist=Arrays.asList(10,2,31,32,32,4);
        Set<Integer> set=new HashSet<>();
        mylist.stream().filter(n->!set.add(n)).forEach(System.out::println);

        //first element of the list
        mylist.stream().findFirst().ifPresent(System.out::println); 

        //find the total number of elements present in the list using Stream fu..nctions
        long count=mylist.stream().count();
        System.out.println(count);

        List<Integer> list1=List.of(2,3,4,5,6,8); //Non Mutable 
        List<Integer> list2=new ArrayList<>();//mutable
        list2.add(12);
        list2.add(14);

        List<Integer> list4=Arrays.asList(2,3,4,5,5);//non mutable
        System.out.println(list4);

        //Print the even number using stream
        List<Integer> resultList= list1.stream().filter(n->n%2==0).toList();
        System.out.println(resultList);
        //maximum value element present in list

    }
}
