package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utils.PageBase;

public class LoginPage extends PageBase {
	
	
	@FindBy(id = "username")
	public WebElement textboxUserName;
	@FindBy(id = "password")
	private WebElement textboxPassword;
	@FindBy(id = "Login")
	private WebElement buttonLogin;
	

	/** Constructor **/
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginWithCredentials(String username, String password) {
		textboxUserName.sendKeys(username);
		textboxPassword.sendKeys(password);
		buttonLogin.click();
	}
	

}
