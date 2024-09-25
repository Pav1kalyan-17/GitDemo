package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Page object classes can be created into 2 ways
//1-->using PageFactory<--
public class LoginPage2 {
	WebDriver driver;

	// constructor
	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(css = "input[name='username']")
	WebElement txt_username_loc;
	@FindBy(css = "input[name='password']")
	WebElement txt_password_loc;
	@FindBy(css = "button[type='submit']")
	WebElement btn_login_loc;
	
	//To locate multiple Web Elements--> @FindBy(tagName="a") List<WebElements> links;
	

	// By txt_username_loc = By.cssSelector("input[name='username']");
	// By txt_password_loc = By.cssSelector("input[name='password']");
	// By btn_login_loc = By.cssSelector("button[type='submit']");

	// Action Methods
	public void setUsername(String user) {
		// driver.findElement(txt_username_loc).sendKeys(user);
		txt_username_loc.sendKeys(user);
	}

	public void setPassword(String pwd) {
		// driver.findElement(txt_password_loc1).sendKeys(pwd);
		txt_password_loc.sendKeys(pwd);

	}

	public void clickLogin() {
		// driver.findElement(btn_login_loc).click();
		btn_login_loc.click();
	}

}
