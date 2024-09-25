package d21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		String pass=getPassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys("Hanmala");
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String getText=driver.findElement(By.cssSelector("form p")).getText();
		String[] Arr=getText.split("'");
		String[] Brr=Arr[1].split("'");
		System.out.println(Brr[0]);
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		return Brr[0];
	}

}
