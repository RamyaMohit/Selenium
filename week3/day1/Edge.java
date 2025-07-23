package week3.day1;

public class Edge extends Browser{
	
	public void takeSnap()
	{
		System.out.println("take the snap");
	}
	
	public void clearCookies()
	{
		System.out.println("Cookies cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge edge1 = new Edge();
		edge1.closeBrowser();
		edge1.takeSnap();
		
		
	}

}
