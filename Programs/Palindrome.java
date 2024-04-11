package Programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
//		int rem,sum=0,temp;
//		int n=54545;
//		temp=n;
//		while(n>0)
//		{
//			rem=n%10;
//			sum=(sum*10)+rem;
//			n=n/10;
//		}
//		if(temp==sum)
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not a Palindrome");
//		}
		String OG,reverse="";
		Scanner sc=new Scanner(System.in);
		OG=sc.nextLine();
		int length=OG.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+OG.charAt(i);
		}
		if(OG.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
