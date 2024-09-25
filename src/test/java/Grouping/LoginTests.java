package Grouping;

import org.testng.annotations.Test;

public class LoginTests {
	@Test(priority=1,groups= {"sanity"})
	void LoginByEmail()
	{
		System.out.println("This is Login by Email........");
	}
	@Test(priority=2,groups= {"sanity"})
	void LoginByFacebook()
	{
		System.out.println("This is Login by Facebook........");
	}
	@Test(priority=3,groups= {"sanity"})
	void LoginByTwitter()
	{
		System.out.println("This is Login by Twitter........");
	}

}
