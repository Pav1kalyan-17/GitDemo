package Grouping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider="dp")
	void testLogin(String email,String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		boolean status=driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//*[@id='column-right']/div/a[13]")).click();
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
		
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}
	//purpose of this DataProvider method is creating the test data and returning it
	//indices-->if we want to execute only specific data we can mention array index numbers by using
	//indices like indices={0,1,2} then only 0,1,2 array index numbers will execute
	@DataProvider(name="dp",indices= {0,1})
	Object[][] loginData(){
		
		Object data[][]= {
				{"abc@gmail.com","test123"},
				{"pavanol123@gmail.com","test@123"},
				{"kalyan@gmail.com","test123"},
				{"pavan@gmail.com","wsdee"},
		};
		
		return data;
	}

}
