package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 {
	// TODO Auto-generated method stub
	
	@Test
	
	public void WebLoginHomeLoan()
	{
		//selenium
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	
	public void MobileLoginHomeLoan() 
	{
		//Appium
		System.out.println("MobileLoginHomeLoan");
	}

	@BeforeMethod
	public void BM()
	{
		System.out.println("11111111");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("0000000");
	}
	
	@Test
	
	public void LoginAPIHomeLoan()
	{
		//Resr API automation
		System.out.println("LoginAPIHomeLoan");
	}
}
