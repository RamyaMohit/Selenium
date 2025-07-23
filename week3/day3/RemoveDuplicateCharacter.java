package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Decalre string
		String companyName = "google";	
		//convert string to characters
		char[] googleChar = companyName.toCharArray();
		//create new set
		Set<Character> name = new LinkedHashSet<Character>();
		//add the character in set using loop
		for(char i: googleChar)
		{
			name.add(i);
		}
		System.out.println("google character is:" + name);
	}

}
