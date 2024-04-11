package Programs;

public class Count_Number_of_Words {

	public static void main(String args[])
	{
		String words = "One Two Three ";
		
		//int countWords=words.split("\\s").length;
		int countWords=0;
		for(int i=0;i<words.length();i++)
		{
			if(words.charAt(i)==' ')
			{
				countWords++;
			}
		}
		System.out.println(countWords+1);
	}

}
