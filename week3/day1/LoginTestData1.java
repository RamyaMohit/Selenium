package week3.day1;

public class LoginTestData1 extends TestData{
	
	public void enterUsername1()
	{
		System.out.println("Enter the username for logintestdata1");
	}
	
	public void enterPassword1()
	{
		System.out.println("Enter the password for LoginTestData1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData1 testData2 = new LoginTestData1();
		testData2.enterCredentials();
		testData2.navigateToHomePage();
		testData2.enterUsername1();
		testData2.enterPassword1();
		
	}

}
