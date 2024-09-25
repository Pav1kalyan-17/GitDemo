package d21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(2000);
		
		//select calender date
		driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[4]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight']")).click();
			
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<3;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(1000);
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	////%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		/////////////////
		driver.findElement(By.id("autosuggest")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(4000);
		List<WebElement> open = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement options:open)
		{
			if(options.getText().equalsIgnoreCase("India"))
			{
				options.click();
				break;
			}
		}
		
	}

}
