package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] companyName = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list1 = new ArrayList<String>(Arrays.asList(companyName)); 
		Collections.sort(list1);
		System.out.println(list1);
		//reverse the loop using descending order
		for(int i= list1.size()-1; i>=0;i--)
		{
			System.out.println(list1.get(i));
		}

	}

}
