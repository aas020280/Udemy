package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day1 {
	// TODO Auto-generated method stub
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("Goodbye");
	}
	
	@Test(groups= {"Smoke"})
	public void Demo() 
	{	
		System.out.println("Hello");
	}

	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
	
	@Test(groups= {"First"})
	public void Demo_2()
	{
		System.out.println("By By");
	}
	
}
