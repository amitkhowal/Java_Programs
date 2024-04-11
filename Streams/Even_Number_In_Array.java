package Streams;

import java.util.Arrays;
import java.util.List;

public class Even_Number_In_Array {

	public static void main(String args[])
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		list.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));	
		}
	
}
