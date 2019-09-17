package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day31 {
	@Test(dataProvider = "getData")

	public void MobileSignOutCarLoan(String username, String password) 
	{

		System.out.println("MobileSignOutCarLoan");
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData()
	{
		//1st combination username password - good credit history = row
		//2nd - usernsme password - no credit history
		//3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		//couloumns in the row are nothing but values for that particualar combination(row)
		
		//2nd set
		data[1][0] = "secondsetisername";
		data[1][1] = "second password";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
		
	}
}
