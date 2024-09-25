package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	WebDriver driver;
	@Test(priority = 0)
	public void openapp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void testLogo() throws InterruptedException {
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed()) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("LOGO Not displayed");
		}

	}

	@Test(priority = 2)
	public void testLogin() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Test(priority = 3)
	public void closeApp() {
		driver.close();

	}

}
