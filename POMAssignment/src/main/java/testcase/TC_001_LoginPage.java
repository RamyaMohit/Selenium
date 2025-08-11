package testcase;

import org.testng.annotations.Test;

import base.BaseClass;

import pages.LoginPage;

public class TC_001_LoginPage extends BaseClass {

	@Test
	public void createAccount1()
	{
		LoginPage logPage = new LoginPage();
		logPage.enterUsername()
				.enterPassword()
				.clickLoginButton()
				.clikCrmsfa()
				.clickAccountsLink()
				.createAccountLink()
				.enterAccountname()
				.enterTotalEmployees()
				.clickCreateAccountlink()
				.verifyAccount();
		
	}
}
