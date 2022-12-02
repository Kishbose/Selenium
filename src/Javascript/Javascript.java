package Javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("window.scroll(0,3000)");
		Thread.sleep(1000);

		WebElement find = wd.findElement(By.xpath("//div[contains(@class,'_3YgSsQ')][1]"));
		js.executeScript("aruguments[0].scrollIntoView(true)", find);

	}
}
