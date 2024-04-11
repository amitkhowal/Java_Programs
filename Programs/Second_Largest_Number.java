package Programs;

public class Second_Largest_Number {

	public static void main(String[] args)
	{
		 int[] array = {5, 2, 8, 1, 3};
		 System.out.print(secondLargest(array));
		 
	}

	private static int secondLargest(int[] array) {
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(max<array[i])
			{
				secondMax=max;
				max=array[i];
			}
			if(array[i]>secondMax && array[i]!=max)
			{
				secondMax=array[i];
			}
		}
		return secondMax;
	}
}
