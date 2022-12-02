package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.rediff.com/");
		wd.switchTo().frame(0);

		String frame = wd.findElement(By.id("nseindex")).getText();
		System.out.println("Type :" + frame);
		wd.switchTo().defaultContent();
		WebElement news = wd.findElement(By.className("cricket"));
		news.click();

		wd.switchTo().defaultContent();
		String findElement = wd.findElement(By.xpath("//a[contains(text(),'injury')]")).getText();
		System.out.println("Text : " + findElement);
	}
}