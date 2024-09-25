package d21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Hanmala");
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		driver.findElement(By.className("signInBtn")).click();
		String Location = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(Location);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pavan");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Pavan@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("123456");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		//driver.findElement(By.className("reset-pwd-btn")).click();
		String gan= driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(gan);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//driver.findElement(By.cssSelector("#Password")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("logout-btn")).click();
		
		

	}

}
