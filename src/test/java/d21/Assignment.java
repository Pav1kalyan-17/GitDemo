package d21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='form-control ng-untouched ng-pristine ng-invalid']")).click();
		driver.findElement(By.cssSelector("input[class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Kalyan");
		driver.findElement(By.name("email")).sendKeys("Kalyan@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("gmail");
		driver.findElement(By.id("exampleCheck1")).click();
		//driver.findElement(By.id("exampleFormControlSelect1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='form-group']/select/option[2]")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12-07-2024");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());

	}

}
