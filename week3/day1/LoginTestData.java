package week3.day1;

public class LoginTestData extends TestData{
	
	public void enterUsername()
	{
		System.out.println("Enter the username");
	}

	public void enterPassword()
	{
		System.out.println("Enter the password");
	}
	
	public static void main(String[] args) {
		LoginTestData testData1 = new LoginTestData();
		testData1.enterCredentials();
		testData1.navigateToHomePage();
		testData1.enterUsername();
		testData1.enterPassword();
		
	}

}
