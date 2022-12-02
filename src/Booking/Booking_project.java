package Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking_project {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();

		wd.get("https://www.saucedemo.com/");

		WebElement user = wd.findElement(By.id("user-name"));
		user.sendKeys("performance_glitch_user");

		WebElement pass = wd.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement login = wd.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);

		WebElement dress = wd.findElement(By.xpath("//img[contains(@alt,'Jacket')]"));
		dress.click();

		WebElement add = wd.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		add.click();

		WebElement cart = wd.findElement(By.className("shopping_cart_link"));
		cart.click();

		WebElement check = wd.findElement(By.id("checkout"));
		check.click();
        Thread.sleep(2000);
        
		WebElement name = wd.findElement(By.id("first-name"));
		name.sendKeys("Bose");

		WebElement lastname = wd.findElement(By.id("last-name"));
		lastname.sendKeys("H");

		WebElement code = wd.findElement(By.id("postal-code"));
		code.sendKeys("603406");

		WebElement continue1 = wd.findElement(By.id("continue"));
		continue1.click();
		Thread.sleep(2000);

		WebElement finish = wd.findElement(By.id("finish"));
		finish.click();

	}
}
