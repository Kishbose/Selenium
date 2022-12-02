package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits_Method {

	// Static_Method = Thread.sleep(2000);

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kishv\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		// Implicit Waits
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Explicit waits

		/*
		 * WebDriver w = new WebDriverWait(wd, 2000);
		 * w.Until(ExpectedConditions.elementToBeClickable(xpath));
		 */

		wd.get("https://www.messenger.com/");

		WebElement fd = wd.findElement(By.id("email"));
		fd.sendKeys("kaameshbose2002@gmail.com");

		WebElement pd = wd.findElement(By.name("pass"));
		pd.sendKeys("Bose@045");

		WebElement lg = wd.findElement(By.name("login"));
		lg.click();

	}
}
