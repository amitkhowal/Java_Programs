package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Interview_Questions {
    
    //Sort a given list of decimals in reverse order
    public static void main(String[] args) {
        List<Double> decimals = Arrays.asList(3.14, 2.71, 1.618, 0.577, 1.414);

        // Sort decimals in reverse order
        decimals.sort(Collections.reverseOrder());

        System.out.println("Decimals sorted in reverse order: " + decimals);

        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
        List<Integer> mylist=list.stream().filter(n->n%2==0).toList();
        System.out.println(mylist);
    }
}
