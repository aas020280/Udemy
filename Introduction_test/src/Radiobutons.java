import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		// driver.findElement(By.xpath("//*[@value='Cheese']")).click();
		int count = driver.findElements(By.xpath("//*[@name='group1']")).size();
		for (int i = 0; i < count; i++) {
			// driver.findElements(By.xpath("//*[@name='group1']")).get(i).click();
			String text = driver.findElements(By.xpath("//*[@name='group1']")).get(i).getAttribute("value");
			if (text.equals("Cheese")) {
				driver.findElements(By.xpath("//*[@name='group1']")).get(i).click();
			}
		}

	}

}
