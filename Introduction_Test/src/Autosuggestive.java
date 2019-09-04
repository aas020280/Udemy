import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Enter the letters BENG
//Verify if Airoport option is displayed in the suggestive box
public class Autosuggestive {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web");
		WebElement City = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		City.sendKeys("BENG");
		Thread.sleep(2000);
		City.sendKeys(Keys.DOWN);
		
		System.out.println(City.getText());
		//Javascript DOM can extract hidden elements
		//because selenium cannot identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it have hidden text
		
		//JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i= 0;
		//BENGALURU INTERNATION AIRPORT
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			i++;
			City.sendKeys(Keys.DOWN);
			
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10)
			{
				break;
			}
		}
		if(i>10)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found");
		}
	}
	
	
}
