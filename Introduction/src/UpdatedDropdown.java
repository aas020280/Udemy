import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());
		// System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		// System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());

		// Count the number of checkboxes

		// System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		// driver.findElement(By.xpath("//div[@id='divpaxOptions']")).click();
		driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
		Thread.sleep(2000L);

		/*
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * for(int i=1;i<5;i++) { driver.findElement(By.id("hrefIncAdt")).click(); }
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 */

	}
}
