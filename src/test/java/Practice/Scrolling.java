package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//Selenium did not provide any scrolling tecniques we need to use Javascript for this
//we need to give javscriptexecutor object to intialize scrolling
public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js= (JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		String a[]=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":");
		int s = Integer.parseInt(a[1].trim());
		if(s==296)
		{
			System.out.println("Both are equal");
		}
		
	}

}
