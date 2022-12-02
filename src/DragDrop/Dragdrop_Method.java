package DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.globalsqa.com/demo-site/draganddrop/");

		Actions act = new Actions(wd);
		WebElement frame = wd.findElement(By.xpath("//*[@id='post-2669']/div/div/div/div[1]/p/iframe")); // Frame
		wd.switchTo().frame(frame);

		WebElement from1 = wd.findElement(By.xpath("//*[@id='gallery']/li"));
		WebElement to1 = wd.findElement(By.id("trash"));
		act.dragAndDrop(from1, to1).build().perform();

		WebElement from2 = wd.findElement(By.xpath("//*[@id='gallery']/li[2]"));
		WebElement to2 = wd.findElement(By.id("trash"));
		act.dragAndDrop(from2, to2).build().perform();

		WebElement from3 = wd.findElement(By.xpath("//*[@id='gallery']/li[3]"));
		WebElement to3 = wd.findElement(By.id("trash"));
		act.dragAndDrop(from3, to3).build().perform();

		WebElement from4 = wd.findElement(By.xpath("//*[@id='gallery']/li[1]"));
		WebElement to4 = wd.findElement(By.id("trash"));
		act.dragAndDrop(from4, to4).build().perform();
	}
}
