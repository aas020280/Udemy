//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//August 23
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//thead//tr[1]//th[2]")).getText().contains("April 2021"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'�')]")).click();
		}
		//List<WebElement> dates= driver.findElements(By.className("day"));
		
		int count=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}
	
}
