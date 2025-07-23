package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] x1 = {1, 2, 3, 4, 10, 6, 8};	
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(x1));
		//sort list in asc order
		Collections.sort(list1);
		System.out.println("Sort list in ascending order:" + list1);
		for(int i=1;i< list1.size() -1 ;i++)
		{
			//int previous number
			int previous = list1.get(i);
			//int next number
			int next = list1.get(i+1);
			
			 if (next - previous > 1) 
			 {
	                for (int j = previous + 1; j < next; j++) {
	                    System.out.print(j + " ");
	                }
	           }
		}
		
		
	}

}
