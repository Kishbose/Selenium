package AbsulteXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absulte_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/s?k=iphone+13&crid=224ITNINBN7Y8&sprefix=ip%2Caps%2C401&ref=nb_sb_ss_ts-doa-p_1_2");

		WebElement find = wd.findElement(By.xpath(
				"//div[@id='search']/div/div/div/span[3]/div[2]/div[5]/div/div/div/div/div/div/div/div[2]/div/span/a/div/img"));
		find.click();

	}
}
