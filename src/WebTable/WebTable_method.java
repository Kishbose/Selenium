package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://cosmocode.io/automation-practice-webtable/");

		WebElement clk = wd.findElement(By.xpath("//table[@id='countries']/tbody/tr[10]/td/input"));
		clk.click();

		System.out.println("************************* 10 ROW CAP **************************");

		WebElement count = wd.findElement(By.xpath("//table[@id='countries']/tbody/tr[10]/td[3]"));
		String text = count.getText();
		System.out.println(text);

		System.out.println("*************************** 13 ROW DATAS ***************************");

		List<WebElement> row = wd.findElements(By.xpath("//table[@id='countries']/tbody/tr[13]"));
		for (WebElement s : row) {
			String text2 = s.getText();
			System.out.print(text2);
			System.out.println("*************************** 5 COL DATAS ***************************");

		}

		List<WebElement> col = wd.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[5]"));
		for (WebElement s : col) {
			String text3 = s.getText();
			System.out.println(text3);
		}

	}
}