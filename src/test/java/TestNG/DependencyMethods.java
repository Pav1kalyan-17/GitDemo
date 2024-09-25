package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
//Every Method Depends on Previous Methods----->Dependency Methods*********
public class DependencyMethods {
	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(true);	
	}
	@Test(priority=2,dependsOnMethods= {"openApp"})//case sensitive --->dependsOnMethods
	void login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods= {"openApp"})
	void advSearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods= {"openApp"})
	void logout()
	{
		Assert.assertTrue(true);
	}
}
