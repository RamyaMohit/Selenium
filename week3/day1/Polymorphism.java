package week3.day1;

public class Polymorphism {

	public void reportStep(String message, String status)
	{
		System.out.println("Message: " + message + ", Status: " + status);
	}
	
	public void reportStep(String message, String status , boolean snap )
	{
		System.out.println("Message: " + message + ", Status: " + status + " boolean:" + snap);

	}
	public void takeSnap()
	{
		System.out.println("overloading");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p1 = new Polymorphism();
		p1.reportStep("Hello", "Progress");
		p1.reportStep("Hello", "Done" , true);
		p1.takeSnap();
	}

}
