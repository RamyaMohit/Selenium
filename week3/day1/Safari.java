package week3.day1;

public class Safari extends Browser{

	public void readerMode()
	{
		System.out.println(" Browser is in read mode");
	}
	
	public void fullScreenMode()
	{
		System.out.println("Browser is in full read mode");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari safari = new Safari();
		safari.navigateBack();
		safari.readerMode();
		

	}

}
