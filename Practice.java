package org.example;

import java.util.Arrays;
import java.util.List;

public class Practice {
	public static void main(String args[])
	{
	//find even numbers from a list of integers and multiply with 2 using stream java 8.
		  List<Integer> list=Arrays.asList(5,3,6,4,7);
			List<Integer> result=list.stream().filter(n->n%2==0).map(n->n*2).toList();
			//summing up list
			long sum=list.stream().mapToInt(n->n).sum();
			System.out.println(result);
				System.out.println(sum);
			//array sum
				int[] arr = {1, 2, 3, 4, 5};
				int summing = Arrays.stream(arr).sum();
				System.out.println("Sum of array elements: " + summing);
	}
}
