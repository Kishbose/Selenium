package WebElement;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\kishv\\\\eclipse-workspace\\\\Selenium_Testing\\\\Driver\\\\chromedriver.exe ");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://profile.w3schools.com/");
//		WebElement fe = wd.findElement(By.xpath("//input[@type='text']"));
//		System.out.println(fe.isDisplayed());
//		System.out.println(fe.isEnabled());
//		fe.sendKeys("kaameshbose2002@gmail.com");

//		WebElement pd = wd.findElement(By.xpath("//input[@class='PasswordInput_input_field__EWMIU undefined']"));
//		pd.sendKeys("Out@zoho45");
//		
//		WebElement lg = wd.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']"));
//		lg.click();
//		
//		WebElement fd = wd.findElement(By.linkText("Forgot password?"));
//		fd.click();
//		System.out.println(fd.getText());
//		
//		WebElement rs = wd.findElement(By.xpath("//input[@type='text']"));
//		rs.sendKeys("freezebose@gmail.com");				
	}
}
