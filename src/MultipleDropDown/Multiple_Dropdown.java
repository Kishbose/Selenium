package MultipleDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://testleaf.herokuapp.com/pages/Dropdown.html");

		// Muliple_method
		WebElement demo = wd.findElement(By.xpath("(//select)[6]"));
		Select q = new Select(demo);
		boolean multiple = q.isMultiple();
		System.out.println("Multi_not :" + multiple);
		// getoption
		List<WebElement> getoptions = q.getOptions();
		for (WebElement i1 : getoptions) {
			System.out.println(i1.getText());
		}

		int size = getoptions.size();
		System.out.println("Size : " + size);

		for (int i = 0; i < size; i++) {
			if (i == 5 | i == 7 | i == 10 | i == 16 | i == 1) {
				q.selectByIndex(i);
			}
		}
		// getAllSelection
		List<WebElement> getoption = q.getAllSelectedOptions();
		for (WebElement i : getoption) {
			System.out.println(i.getText());

		}
		// getFirstSelect
		wd.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement opti = wd.findElement(By.xpath("(//select)"));
		Select option = new Select(opti);

		WebElement firstSelectedOption = option.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
}
