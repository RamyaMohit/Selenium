package week2day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		
		int textlength1 = text1.length();
		int textlength2 = text2.length();
		
		if(textlength1 == textlength2)
		{
			char[] charArr1 = text1.toCharArray();
			char[] charArr2 = text2.toCharArray();
			
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			
			if(Arrays.equals(charArr1, charArr2))
			{
				System.out.println("The given strings are Anagram");
			}else {
				System.out.println("The given strings are not an Anagram.");
				
			}
			
		}else {
			System.out.print("\"Lengths mismatch, therefore the strings are not an Anagram");
		}
		
	}

}
