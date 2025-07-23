package week2.day1;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayNumber[] = {2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(arrayNumber); 

	    System.out.println("Sorted array: " + Arrays.toString(arrayNumber));
		
		for(int i = 0;i < arrayNumber.length - 1; i++)
		{
			if(arrayNumber[i] == arrayNumber[i + 1]) 
			{
				System.out.println("Duplicate value is:"+ arrayNumber[i]);
							
			}
		}
		

	}

}
