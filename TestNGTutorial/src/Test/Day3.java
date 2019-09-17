package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {
	// TODO Auto-generated method stub
	
	@Test(groups= {"First"})
	
	public void WebLoginCarLoan()
	{
		//selenium
		System.out.println("WebLoginCarLoan");
	}
	
	@Test(groups= {"Smoke"})
	
	public void MobileLoginCarLoan() 
	{
		//Appium
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test(groups= {"First"})
	
	public void MobileSignInCarLoan() 
	{
		//Appium
		System.out.println("MobileSignInCarLoan");
	}

	@Test(dataProvider = "getData")

	public void MobileSignOutCarLoan(String username, String password) 
	{
		//Appium
		System.out.println("MobileSignOutCarLoan");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods= {"MobileSignInCarLoan","MobileLoginCarLoan"})
	
	public void LoginAPICarLoan()
	{
		//Resr API automation
		System.out.println("LoginAPICarLoan");
	}
	
}

