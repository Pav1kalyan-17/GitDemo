package TestNG;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test(priority=1)
	void login() {
		System.out.println("Login");		
	}
	@Test(priority=0)
	void open() {
		System.out.println("Open");
	}
	@Test(priority=-3)
	void logout() {		
		System.out.println("logout");
	}
	

}
