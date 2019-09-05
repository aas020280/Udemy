import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexercises {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22637/wia-vs-inda-3rd-unofficial-odi-india-a-tour-of-west-indies-2019");
		WebElement table = driver.findElement(By.xpath("//*[@id='innings_1'] /div[1]"));
		int count = table.findElements(By.xpath("//*[@id='innings_1'] /div[1] //*[@class='cb-col cb-col-100 cb-scrd-itms'] /div[3]")).size();
		int sum=0;
		for(int i=0;i<count-2;i++) 
		{
			String value = table.findElements(By.xpath("//*[@id='innings_1'] /div[1] //*[@class='cb-col cb-col-100 cb-scrd-itms'] /div[3]")).get(i).getText();
			int valueinteger= Integer.parseInt(value);
			sum=sum+valueinteger;
			
		}
	
			String extras = driver.findElement(By.xpath("//div[text()='Extras'] /following-sibling::div")).getText();
			int extrasValueInt = Integer.parseInt(extras);
			int totalSum = sum+extrasValueInt;
			//System.out.println(totalSum);
			String total = driver.findElement(By.xpath("//div[text()='Total'] /following-sibling::div")).getText();
			int totalInt = Integer.parseInt(total);
			if (totalSum == totalInt) 
			{
				System.out.println("Pass");
			}
			else 
			{
				System.out.println("Fall");
			}
			driver.quit();
	}
}
