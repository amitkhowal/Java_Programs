package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frequency_of_Each_Element {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(size);
		for(int i=0;i<size;i++)
		{
			arr.add(sc.nextInt());
		}
		System.out.println("Array is : ");
		for(int i:arr)
		{
			System.out.println(i+ " ");
		}
		HashMap<Integer,Integer> mp=new HashMap<Integer, Integer>();
		for(int i:arr)
		{
			//check if our key is present or not 
			if(mp.containsKey(i))
			{
				mp.put(i, mp.get(i)+1);
			}
			else
			{
				mp.put(i,1);
			}
		}
		for(int i:mp.keySet())
		{
			System.out.println("Frequency of "+i+" "+mp.get(i));
		}
	}
}
