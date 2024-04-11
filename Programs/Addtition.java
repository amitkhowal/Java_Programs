package Programs;

import java.util.Scanner;

public class Addtition 
{
	public static void main(String args[])
	{
		int x,y,sum;
		Scanner sc=new Scanner(System.in);//create scanner object
		System.out.println("Type a number: ");
		x=sc.nextInt();
		
		System.out.println("Type another number: ");
		y=sc.nextInt();
		
		System.out.println("Sum of the numbers are : "+(x+y));
	}
}
