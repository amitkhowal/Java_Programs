package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Duplicate_Element {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size=sc.nextInt();
		System.out.println("Enter the Array: ");
		ArrayList<Integer> arr=new ArrayList<Integer>();
		  for(int i = 0; i < size; i++)
	        {
	            arr.add(sc.nextInt());
	        }
		HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			if(mp.containsKey(i))
			{
				mp.put(i,mp.get(i)+1);
			}
			else
			{
				mp.put(i, 1);
			}
		}
		System.out.println("Duplicates in the Array are : ");
		for(int i:mp.keySet())
		{
			if(mp.get(i)>1)
			{
				System.out.println("Number of : "+i+"->"+mp.get(i));
			}
		}
	}
}
