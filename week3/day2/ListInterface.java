package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		
		Integer[] a1 = {3, 2, 11, 4, 6, 7};
		Integer[] a2 = {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(a1));    
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(a2)); 
		
		int listSize1 = list1.size();
		
		for(int i = 0; i < listSize1; i++) {
            if (list2.contains(list1.get(i))) {
                System.out.println(list1.get(i));
            }
        }
		
	}
	
	
}
