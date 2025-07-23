package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] x1 = {3, 2, 11, 4, 6, 7};	
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(x1));    

		Collections.sort(list1);
		System.out.println("Sort list in ascending order:" + list1);
		
		Integer SecondLargestNumber = list1.get(list1.size()-2);
		System.out.println(SecondLargestNumber);
		
	}

}
