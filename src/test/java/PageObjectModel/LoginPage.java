package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//Page object classes can be created into 2 ways
//1-->without using PageFactory<--
public class LoginPage {
	WebDriver driver;

	// constructor------------------------------------------------------------------
	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators----------------------------------------------------------------------
	By txt_username_loc = By.cssSelector("input[name='username']");
	By txt_password_loc = By.cssSelector("input[name='password']");
	By btn_login_loc = By.cssSelector("button[type='submit']");

	// Action Methods------------------------------------------------------------------
	public void setUsername(String user) {
		driver.findElement(txt_username_loc).sendKeys(user);
	}

	public void setPassword(String pwd) {
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}

	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}

}
