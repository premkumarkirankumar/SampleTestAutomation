package DevOpsTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.TestBase;

public class LoginTest extends TestBase {
    
    WebDriver driver;
	
	@Test()
	public void testLogin() {
		driver=initializeDriver();
		LoginPage lp = new LoginPage(driver);	
		driver.get("https://test.salesforce.com/");
		lp.loginWithCredentials("drzapiautouser1@ag.com.jantest22", "Drz$4ever");
		
		
	}
}
