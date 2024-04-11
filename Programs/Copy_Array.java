package Programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Copy_Array {
    public static void main(String[] args) {

    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
     	Integer[] arr1=new Integer[size];
    	for(int i=0;i<size;i++)
    	{
    		arr1[i]=sc.nextInt();
    	}
    	
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(arr1));

        System.out.println("Elements of original array: ");
        for (int i : arr1) {
 //       	arr2.add(i);
            System.out.print(i + " ");
        }

        System.out.println();

        // Display elements of ArrayList arr2
        System.out.println("Elements of new ArrayList: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        int max=arr1[0];
        for(int i:arr1)
        {
			if(i>max)
        	{
        		max=i;
        	}
        }
        System.out.println("Maximum element in ArrayList: "+max);
        int min=arr1[0];
        for(int i:arr1)
        {
			if(i<min)
        	{
        		min=i;
        	}
        }
        System.out.println("Minimum element in ArrayList: "+min);
    }
}