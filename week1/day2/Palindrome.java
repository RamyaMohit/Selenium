package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 121;
		int reversedNumber = 0;
		
		for(int i=number;i > 0; i =i/10)
		{
			
			int remainder = i % 10;
			reversedNumber = reversedNumber * 10 + remainder ;
			
		}
		
		if(number == reversedNumber)
		{
			System.out.println("number is palindrome:" + number );
		}else {
			System.out.println("number is not palindrome:" + number );
		}
	}

}
