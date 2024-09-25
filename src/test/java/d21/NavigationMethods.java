package d21;

import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@class='wikipedia-search-button']")).click();
		
		List<WebElement> dr=driver.findElements(By.tagName("a"));
		System.out.println(dr.size());
		for(WebElement s:dr)
		{
			System.out.println(s.getAttribute("href"));
			String get=s.getAttribute("href");
			if(!get.equals("null")) {
			driver.navigate().to(get);
			Thread.sleep(4000);
			}
		}
		
		
		
		/*
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@href='https://en.wikipedia.org/wiki/Test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@href='https://en.wikipedia.org/wiki/Testosterone']")).click();
		String windowH=driver.getWindowHandle();
		System.out.println(windowH);
		//To close the specific window in browser
		Set<String> ids=driver.getWindowHandles();
		List<String> ideas=new ArrayList(ids);
		for(String wind:ideas)
		{
			String title1=driver.switchTo().window(wind).getWindowHandle();
			String title=driver.switchTo().window(wind).getTitle();
			System.out.println(title1+" "+title);
			if(title.equals("Test - Wikipedia"))
			{
				driver.close();
			}
		}
*/
	}
}

