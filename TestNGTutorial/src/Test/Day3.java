package Test;

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

	@Test

	public void MobileSignOutCarLoan() 
	{
		//Appium
		System.out.println("MobileSignOutCarLoan");
	}

	@Test(dependsOnMethods= {"MobileSignInCarLoan","MobileLoginCarLoan"})
	
	public void LoginAPICarLoan()
	{
		//Resr API automation
		System.out.println("LoginAPICarLoan");
	}
}
