package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		String selectedValue=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
		Select sel=new Select(driver.findElement(By.id("dropdown-class-example")));
		sel.selectByVisibleText(selectedValue);
		driver.findElement(By.name("enter-name")).sendKeys(selectedValue);
		driver.findElement(By.id("alertbtn")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		String[] a=alertText.split(",");
		String[] a1=a[0].split(" ");
		if(a1[1].contains(selectedValue))
		{
			System.out.println("Given value and Alert value both are same-->"+a1[1]);
		}
		
		driver.switchTo().alert().accept();

	}

}
