package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting_Comparator {

	public static void main(String args[])
	{
		List<String> list=Arrays.asList("A","AAA","BBBBB","CCCCCCC");
		//SORT THE ELEMENT IN DESCENDING ORDER USING COMAPARATOR FROM STREAM
		Comparator<String> c=(a,b)->
		{
			int l1=a.length();
			int l2=b.length();
			if(l1>l2)
				return -1;
			else if(l1<l2)
			    return 1;
			else return 0;
			
			//return Integer.compare(l2,l1);
		};
		List<String> sortedString=list.stream().sorted(c).toList();
		System.out.println(sortedString);
		
// Program to print only numbers from an alphanumeric char array using stream API in java-8.
		String str = "a1b2c3d4e5f6g7h8i9j0";
		char[] arr = str.toCharArray();
		System.out.println("Original array: " + Arrays.toString(arr));
		int[] nums = new String(arr)
						.chars()
						.filter(Character::isDigit)
						.map(Character::getNumericValue)
						.toArray();
		System.out.println("Numbers only: " + Arrays.toString(nums));
}
}