package WindowHandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WindowHandles_Method {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");

		Actions act = new Actions(wd); // Action Method

		WebElement ft = wd.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(ft).build().perform();

		Robot rob = new Robot(); // Robot Method

		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		WebElement ft1 = wd.findElement(By.xpath("//a[text()='Books']"));
		act.contextClick(ft1).build().perform();

		// Robot Method
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		WebElement ft2 = wd.findElement(By.xpath("//a[text()='Home & Kitchen']"));
		act.contextClick(ft2).build().perform();
		// Robot Method
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		WebElement ft3 = wd.findElement(By.xpath("//a[text()='Computers']"));
		act.contextClick(ft3).build().perform();

		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		System.out.println("-------------------------------------------------------------"); // single title

		String parent = wd.getWindowHandle();
		System.out.println(parent);

		System.out.println("-------------------------------------------------------------");

		Set<String> tabs = wd.getWindowHandles();
		for (String child : tabs) { // for each
			String title = wd.switchTo().window(child).getTitle();
			System.out.println(title);
		}
		String s = "Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
		for (String child : tabs) {
			if (wd.switchTo().window(child).getTitle().equals(s)) {
				break;
			}
		}
		// books inputs
		WebElement add = wd.findElement(By.xpath("//li[@id='sobe_d_b_18_1']"));
		act.click(add).build().perform();
		WebElement add1 = wd.findElement(By.xpath("//a[@id='a-autoid-3-announce']"));
		act.click(add1).build().perform();
		WebElement add2 = wd.findElement(By.xpath("//input[@type='submit']"));
		act.click(add2).build().perform();
		Thread.sleep(2000);

		String com = "Computers & Accessories: Buy Computers & Accessories Online at Low Prices in India - Amazon.in";
		for (String child : tabs) {
			if (wd.switchTo().window(child).getTitle().equals(com)) {
				break;
			}
		}

		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("window.scroll(0,10000)");
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot) wd; // narrowing
		File src = ts.getScreenshotAs(OutputType.FILE); // Output Type
		File destination = new File("C:\\Users\\kishv\\OneDrive\\Desktop\\Testing.png"); // (store location
		FileHandler.copy(src, destination); // ( Selenium Handle without Jars)
		Thread.sleep(3000);
		for (String child : tabs) {
			if (!child.equals(parent)) {
				wd.switchTo().window(child);
				wd.close();
			}
		}
	}
}
