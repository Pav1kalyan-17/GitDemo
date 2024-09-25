package d21;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException  {


		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(4000);
		driver.findElement(By.id("next2")).click();
		
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(2000);
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println(image.size());
		/*String act_url=driver.getTitle();
		if(act_url.equals("Your Store"))
		{
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}*/
		
		//Thread.sleep(5000);
		//driver.quit();

	}

}
