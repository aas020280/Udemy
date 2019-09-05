import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiv {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		// driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity
		// inactiveWidget')]//label")).clear();
		// driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity
		// inactiveWidget')]//label")).click();
		driver.findElement(By.id("fromCity")).click();
		WebElement source = driver.findElement(By.xpath("//input[contains(@placeholder,'From')]"));
		source.sendKeys("mos");
		Thread.sleep(2000);
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.ENTER);
		WebElement sourceTo = driver.findElement(By.xpath("//input[@placeholder='To']"));
		sourceTo.sendKeys("krasnodar");
		Thread.sleep(2000);
		sourceTo.sendKeys(Keys.DOWN);
		sourceTo.sendKeys(Keys.ENTER);

	}

}
