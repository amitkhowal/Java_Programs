package Programs;

import java.util.Scanner;

public class Factorial {
	static int prod=1;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		factorial(n);
		System.out.println("Factorial of Number is: "+prod);
	}

	private static void factorial(int n) {
		for(int i=1;i<=n;i++)
		{
			prod=i*prod;
		}
	}
}
