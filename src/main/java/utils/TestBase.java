package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public  WebDriver driver;
	
	public WebDriver initializeDriver() {
		  String driverPath= System.getProperty("user.dir") + "\\driver\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverPath);
		driver= new ChromeDriver();
		return driver;
		
	}

}
