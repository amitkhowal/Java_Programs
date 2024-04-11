package Programs;
import java.util.ArrayList;
import java.util.Arrays;


public class Sorting_Of_Array {
	    public static void main(String[] args) {
	        int[] array = {5, 2, 8, 1, 3};
	        
	        System.out.println("Original array:");
	        printArray(array);
	        
	        // Sort the array in ascending order
	        Arrays.sort(array);
	        
	        System.out.println("\nArray after sorting in ascending order:");
	        printArray(array);
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        // Adding elements of array to ArrayList
	        for (int num : array) {
	            list.add(num);
	        }
	        
	        int sum = list.stream().mapToInt(Integer::intValue).sum();
	        System.out.println("\nSum of all elements in the array:"+sum);
	    }
	    
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}

