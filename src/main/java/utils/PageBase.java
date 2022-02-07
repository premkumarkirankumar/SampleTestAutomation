package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;



public class PageBase {
	
	protected WebDriver driver;
	
	/**
	 * 
	 */
	public PageBase() {
	}
	
	/**
	 * 
	 * @param driver
	 */
	public PageBase(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
}
