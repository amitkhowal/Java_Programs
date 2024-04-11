package Strings;

public class Divide_String_N_Parts {
	 public static void main(String[] args) {
	        String inputString = "This is a sample string to divide";
	        int parts = 3; // Number of parts to divide the string into
	        
	        String[] dividedStrings = divideString(inputString, parts);
	        
	        if (dividedStrings != null) {
	            System.out.println("Original string: " + inputString);
	            System.out.println("Divided into " + parts + " equal parts:");
	            for (int i = 0; i < dividedStrings.length; i++) {
	                System.out.println("Part " + (i + 1) + ": " + dividedStrings[i]);
	            }
	        } else {
	            System.out.println("Cannot divide the string into " + parts + " equal parts.");
	        }
	    }

	    public static String[] divideString(String str, int parts) {
	        int length = str.length();
	        if (length % parts != 0) {
	            // Length of string is not divisible by parts
	            return null;
	        }
	        
	        // Calculate the length of each part
	        int partLength = length / parts;
	        String[] dividedStrings = new String[parts];
	        
	        // Divide the string into equal parts
	        for (int i = 0; i < parts; i++) {
	            int startIndex = i * partLength;
	            int endIndex = startIndex + partLength;
	            dividedStrings[i] = str.substring(startIndex, endIndex);
	        }
	        
	        return dividedStrings;
	    }

}
