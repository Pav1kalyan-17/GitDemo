package Practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		String[] devices = { "Samsung Note 8", "iphone X", "Blackberry" };
		driver.manage().window().maximize();
		String name = "Teacher";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@data-style='btn-info']")));
		s.selectByVisibleText(name);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("signInBtn")).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='my-4']")));
		System.out.println(driver.findElement(By.cssSelector("h1[class='my-4']")).getText());

		List<WebElement> li = driver.findElements(By.xpath("//h4[@class='card-title']"));
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
		}
		List<WebElement> lis = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		System.out.println(lis.size() + " " + lis.get(3).getText());
		List al = Arrays.asList(devices);
		for (int i = 0; i < li.size(); i++) {
			String den = li.get(i).getText();
			if (al.contains(den)) {
				lis.get(i).click();
				System.out.println(lis.get(i).getText());
			}

		}

	}

}
