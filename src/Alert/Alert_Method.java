package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demo.automationtesting.in/Alerts.html");

		// WebElement find =
		// wd.findElement(By.xpath("//button[@onclick='alertbox()']"));
		// find.click();

		WebElement findElement = wd.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		findElement.click();

		WebElement input = wd.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		input.click();

		WebElement keys = wd.findElement(By.xpath("//button[@class='btn btn-info']"));
		keys.sendKeys("ddd");

	}
}