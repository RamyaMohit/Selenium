package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("Fibonacci sereis of terms:" + range);
		
		for(int i=1; i<=range;i++)
		{
			System.out.println(num1);
		    int num3 = num1 + num2;		  
			num1 = num2;
			num2 = num3;
		
		}
	}

}
