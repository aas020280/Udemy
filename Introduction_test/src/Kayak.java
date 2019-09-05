import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kayak {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@data-placeholder='From?']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@placeholder='From?']")).clear();
		driver.findElement(By.xpath("//*[@placeholder='From?']")).sendKeys("San Francisco", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@data-placeholder='To?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='To?']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='To?']")).sendKeys("Krasnodar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='To?']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(@class, 'Common-Widgets-Datepicker-DateModal')] /div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Departure date input']")).sendKeys("09/12/2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Departure date input']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class, 'Common-Widgets-Datepicker-DateModal')] /div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Return date input']")).sendKeys("10/12/2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Return date input']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id, 'col-button-wrapper')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@aria-label,'Result number 3')]")).click();
		
	}
}
