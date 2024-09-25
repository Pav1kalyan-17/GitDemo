package Practice1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		System.out.println(url);
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		for (int i = 0; i < links.size(); i++) {
			String url1 = links.get(i).getAttribute("href");
			HttpURLConnection conn1 = (HttpURLConnection) new URL(url1).openConnection();
			conn1.setRequestMethod("HEAD");
			conn1.connect();
			int respCode1 = conn1.getResponseCode();
			System.out.println(respCode1);
			if (respCode1 > 400) {
				System.out.println(links.get(i).getText()+" is invalid");
			}
		}
	}

}
