package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", // --- Browser name
				"C:\\Users\\kishv\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe"); // --- location

		WebDriver wd = new ChromeDriver(); // --- New Launcher

		wd.manage().window().maximize(); // --- Maximize window

		wd.get("http://www.google.co.in");

		String t = wd.getTitle(); // --- title Ref- ctrl+2+l
		System.out.println(t);

		String c = wd.getCurrentUrl();
		System.out.println(c);
		// --- NAVIGATION METHOD
		wd.navigate().to(" https://www.w3schools.com/");
		wd.navigate().back();
		wd.navigate().forward();
		wd.navigate().to("http://www.gmail.com/");
		wd.navigate().refresh();
		Thread.sleep(2000);
		wd.close();
	}
}
