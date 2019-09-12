package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	
	public void Test_3()
	{
		System.out.println("Good");
	}

	@BeforeTest
	
	public void prerequiste()
	{
		System.out.println("Hi again :)");
	}

	@BeforeSuite
	public void BeforeSuit()
	{
		System.out.println("Before Suite");
	}

	
	
}


