package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Convert_StreamOfObject_into_Array {

    public static void main(String args[])
    {
        Integer[] array = {1, 2, 3, 4, 5};

        // for int array[] we can do the same

        // Convert array to Stream
        Stream<Integer> stream = Arrays.stream(array);

        // Now you can work with the stream
        stream.forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Convert the Stream of objects into an array
        Integer[] array1 = list.toArray(Integer[]::new);

        // Print the array
        System.out.println(Arrays.toString(array1));

        Stream<?> item=Stream.of(9,98,88,777,"aa","cc");
        item.forEach(System.out::println);
    }
}
