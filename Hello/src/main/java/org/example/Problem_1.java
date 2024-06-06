package org.example;

import java.util.Arrays;
import java.util.List;

public class Problem_1 {
		public static void main(String args[])
		{
			
			//PASSING MARKS
			List<Integer> list=Arrays.asList(10,20,30,40,50,60);
			list.stream().filter(n->n>35).forEach(System.out::println);
			
			//GRACE MARKS
			List<Integer> newMarks=list.stream().filter(n->n<35).map(n->n+5).toList();
			System.out.println(newMarks);
			
			//COUNT THE FAILED STUDENTS
			long count_Failed=list.stream().filter(n->n>35).count();
			System.out.println(count_Failed);


		}
		
}
