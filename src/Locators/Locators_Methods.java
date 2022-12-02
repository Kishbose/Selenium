package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kishv\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.get("https://www.messenger.com/");

		WebElement fd = wd.findElement(By.id("email"));
		fd.sendKeys("kaameshbose2002@gmail.com");

		WebElement pd = wd.findElement(By.name("pass"));
		pd.sendKeys("Bose@045");

		WebElement lg = wd.findElement(By.name("login"));
		lg.click();

	}
}
