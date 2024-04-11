package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Left_Rotate_Array {
	
	public static void main(String args[])
	{
		//int[] arr=new int[] {1,2,3,4,5};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size=sc.nextInt();
		System.out.println("Enter the Array: ");
		ArrayList<Integer> arr=new ArrayList<Integer>();
		  for(int i = 0; i < size; i++)
	        {
	            arr.add(sc.nextInt());
	        }
		
		System.out.println("Enter the number of Rotations : ");
		int rotate_times=sc.nextInt();
		//rotate left
		leftroate(arr,rotate_times);
		System.out.println("Array after Rotations : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

	private static void leftroate(ArrayList<Integer> arr, int rotate_times) {
		int length=arr.size();
		//handling the case where roation is > than length of array
		rotate_times=rotate_times%length;
		//reverse first number of n elements
		reverse(arr,0,rotate_times-1);
		//reverse last number of n elements
		reverse(arr,rotate_times,length-1);
		//reverse whole array
		reverse(arr,0,length-1);
	}

	private static void reverse(ArrayList<Integer> arr, int start, int end) {
	
		while(start<end)
		{
			int temp=arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end, temp);
			start++;
			end--;
		}
	}
}
