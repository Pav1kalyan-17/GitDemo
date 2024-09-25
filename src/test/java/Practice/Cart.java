package Practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// https://rahulshettyacademy.com/seleniumPractise/#/

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		String[] veg = { "Brocolli", "Tomato", "Brinjal", "Beetroot" };

		List<WebElement> data = driver.findElements(By.xpath("//h4[@class='product-name']"));
		System.out.println(data.size());

		for (int i = 0; i < data.size(); i++) {
			String[] den = data.get(i).getText().split("-");
			String name = den[0].trim();
			List al = Arrays.asList(veg);
			if (al.contains(name)) {
				System.out.println(name);
				Thread.sleep(1000);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}
	}

}
