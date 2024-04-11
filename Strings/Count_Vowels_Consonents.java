package Strings;

public class Count_Vowels_Consonents {
	
	public static void main(String[] args) {
        String str = "This is a really simple sentence";    
        int countVowels = 0, countConsonants = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (isVowel(ch)) {
                countVowels++;
            } else if (ch >= 'a' && ch <= 'z' && !isVowel(ch)) {
                countConsonants++;
            }
        }
        
        System.out.println("Total number of vowels: " + countVowels);
        System.out.println("Total number of consonants: " + countConsonants);
    }

    private static boolean isVowel(char ch) {
        String vowels = "aeiou";
        return vowels.indexOf(ch) != -1;
    }
}