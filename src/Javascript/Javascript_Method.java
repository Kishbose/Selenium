package Javascript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Javascript_Method {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("window.scroll(0,4800)");
		Thread.sleep(1000);

		WebElement scrnsht = wd.findElement(By.xpath(
				"//div[contains(@class,'a-section a-spacing-none shogun-widget card-lite image-shoveler aui-desktop fresh-shoveler image-shoveler')]")); // narrowing
		File src = scrnsht.getScreenshotAs(OutputType.FILE); // Output Type
		File destination = new File("C:\\Users\\kishv\\OneDrive\\Desktop\\Testing\\Screenshot.png"); // (store location)
		// FileUtils.copyFile(src,destination);
		FileHandler.copy(src, destination); // ( Selenium Handle without Jars)

	}
}
