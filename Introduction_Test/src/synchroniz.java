

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchroniz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/?t=1561420443424");
		driver.findElement(By.xpath("//input[@placeholder='Where do you need a hotel?']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@placeholder='Where do you need a hotel?']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@class='wl-input-base range-picker__input ng-pristine ng-valid ng-isolate-scope ng-not-empty ng-valid-required ng-valid-date ng-touched']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'The Westin Jersey City Newport')]")).click();
		
		
		
		
	}
}
