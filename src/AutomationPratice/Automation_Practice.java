package AutomationPratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		/*
		 * WebElement login = wd.findElement(By.xpath(
		 * "/html/body/div[1]/div[1]/header/div/div/div/nav/div[1]/a")); // Absolute //
		 * X-path login.click(); WebElement create =
		 * wd.findElement(By.xpath("(//input)[5]"));
		 * create.sendKeys("kaameshbose2002@gmail.com"); WebElement account =
		 * wd.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")); account.click();
		 * JavascriptExecutor jse = (JavascriptExecutor) wd; //
		 * javascriptExecutor_Method jse.executeScript("window.scroll(0,500)");
		 * WebElement name = wd.findElement(By.id("customer_firstname"));
		 * name.sendKeys("Bose"); WebElement last =
		 * wd.findElement(By.xpath("//inpt)[8]")); last.sendKeys("H"); WebElement pass =
		 * wd.findElement(By.xpath("//input)[10]")); pass.sendKeys("087@Pass");
		 * WebElement day = wd.findElement(By.id("days")); Select s = new Select(day);
		 * s.selectByIndex(10); WebElement month = wd.findElement(By.id("months"));
		 * Select s1 = new Select(month); s1.selectByValue("June"); WebElement year =
		 * wd.findElement(By.id("years")); Select s2 = new Select(year);
		 * s2.selectByValue("2010"); WebElement name1 =
		 * wd.findElement(By.xpath("(//input)[13]")); name1.sendKeys("Bose"); WebElement
		 * last1 = wd.findElement(By.xpath("//inpt)[14]")); last1.sendKeys("H");
		 * WebElement Address = wd.findElement(By.xpath("//inpt)[16]"));
		 * Address.sendKeys("No-22 Ramakrishna Nagar, Kanchipuram."); WebElement city =
		 * wd.findElement(By.xpath("//input)[18]")); Select s3 = new Select(city);
		 * s3.selectByValue("Kanchipuram"); WebElement state =
		 * wd.findElement(By.xpath("(//select)[4]")); Select s4 = new Select(state);
		 * s4.deselectByVisibleText("California"); WebElement code =
		 * wd.findElement(By.xpath("//inpt)[19]")); code.sendKeys("000 000"); WebElement
		 * phone = wd.findElement(By.xpath("//inpt)[21]"));
		 * phone.sendKeys("0000000000"); WebElement address2 =
		 * wd.findElement(By.xpath("//inpt)[22]"));
		 * address2.sendKeys("No-22 Ramakrishna Nagar, Kanchipuram."); WebElement reg =
		 * wd.findElement(By.name("submitAccount")); reg.click();
		 */

		JavascriptExecutor js = (JavascriptExecutor) wd; // javascriptExecutor_Method
		js.executeScript("window.scroll(0,300)");
		Thread.sleep(2000);

		WebElement email = wd.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("kaameshbose2002@gmail.com");

		WebElement pass = wd.findElement(By.name("passwd"));
		pass.sendKeys("087@Pass");

		WebElement sign = wd.findElement(By.name("SubmitLogin"));
		sign.click();

		WebElement dresses = wd.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		dresses.click();

		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("window.scroll(0,500)");
		Thread.sleep(1000);

		WebElement ed = wd.findElement(By.xpath("(//a[@class='img'])[2]"));
		ed.click();
		Thread.sleep(1000);
		// jse.executeScript("arguments[0].scrollIntoView(true)",ed);
		jse.executeScript("window.scroll(0,500)");

		WebElement ck = wd.findElement(By.xpath("//div[@class='product-image-container']"));
		ck.click();

		Thread.sleep(6000);

		TakesScreenshot ts = (TakesScreenshot) wd; // narrowing
		File src = ts.getScreenshotAs(OutputType.FILE); // Output Type
		File destination = new File("C:\\Users\\kishv\\OneDrive\\Desktop\\Testing\\Automation.png"); // store location
																										// Type
		// FileUtils.copyFile(src,destination);
		FileHandler.copy(src, destination);
	}
}