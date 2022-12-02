package CSSselector;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Method {

	// Static_Method = Thread.sleep(2000);

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kishv\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		// Implicit Waits
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		wd.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");

		System.out.println(wd.findElement(By.cssSelector("input")).getAttribute("id")); // Get Att-Values

		wd.findElement(By.cssSelector("#firstName")).sendKeys("Bose"); // css id

		wd.findElement(By.cssSelector("#lastName")).sendKeys("H");

		wd.findElement(By.cssSelector(".gender")).sendKeys("Male"); // css class

		wd.findElement(By.cssSelector(".city")).sendKeys("Chennai");

		wd.findElement(By.xpath("//input[6]")).sendKeys("What the pass ?"); // x-path

		wd.findElement(By.xpath("//input[7]")).sendKeys("Secret Protocols");

		wd.findElement(By.xpath("//input[8]")).sendKeys("###########");

		Dimension size = wd.findElement(By.cssSelector("*")).getSize(); // Global Element
		System.out.println(size);

	}
}