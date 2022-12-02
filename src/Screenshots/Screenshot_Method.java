package Screenshots;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// SCREENSHOT_METHOD
public class Screenshot_Method {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.youtube.com/results?search_query=selenium+tamil");

		TakesScreenshot ts = (TakesScreenshot) wd; // narrowing
		File src = ts.getScreenshotAs(OutputType.FILE); // Output Type
		File destination = new File("C:\\Users\\kishv\\OneDrive\\Desktop\\Testing\\Screenshot.png"); // (store location)
		// FileUtils.copyFile(src,destination);
		FileHandler.copy(src, destination); // ( Selenium Handle without Jars)

	}
}