package week3.day1;

public class Overriding extends Polymorphism{
	
	public void takeSnap()
	{
		super.takeSnap();
		System.out.println("overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding riding = new Overriding();
		riding.takeSnap();
	}

}
