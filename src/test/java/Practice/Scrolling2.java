package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		js.executeScript("window.scrollBy(0,700)");
		List<WebElement> siz =driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println("Number of rows "+siz.size());
		List<WebElement> siz1 =driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		System.out.println("Number of Columns "+siz1.size());
		for(int i=0;i<3;i++)
		{
		System.out.println(siz1.get(i).getText());
		
		}

	}

}

