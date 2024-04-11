package Strings;

import java.util.Arrays;

public class Anagrams {
	
	public static boolean main(String[] args)
	{
		String str1="Brag";
		String str2="Grab";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		   if (str1.length() != str2.length()) {  
	            System.out.println("Both the strings are not anagram");  
	        }  
	        // Convert strings to char arrays and sort them
		   char[] array1=str1.toCharArray();
		   char[] array2=str2.toCharArray();
		   Arrays.sort(array1);
		   Arrays.sort(array2);
		   
	        // Convert sorted char arrays back to strings and compare
		   String sortedStr1=new String(array1);
		   String sortedStr2=new String(array2);
		   
		   return sortedStr1.equals(sortedStr2);
				   
	}
}
