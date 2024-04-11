package Programs;

import java.util.Scanner;

public class Fibonacci {
	static int num1=0,num2=1,num3=0;
	
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		count=sc.nextInt();
		System.out.println(num1+" "+num2);
//		for(int i=2;i<=count;i++)
//		{
//			num3=num1+num2;
//			System.out.println(" "+num3);
//			num1=num2;
//			num2=num3;
//		}
		printFibonacci(count-2);
	}

	 /**
	 * @param count
	 */
	static void printFibonacci(int count) {
		if(count>0)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num3);   
	        printFibonacci(count-1);    
		}
	}
}
