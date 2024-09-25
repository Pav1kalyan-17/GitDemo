package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RobotExample {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// Setting up WebDriver and opening the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		// Create an instance of the Robot class
		Robot robot = new Robot();

		Thread.sleep(3000);
		// Simulate pressing the 'Tab' key
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_TAB);
	 Thread.sleep(3000);

		// Simulate pressing the 'Enter' key
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		// Close the browser
		//driver.quit();
	}
}