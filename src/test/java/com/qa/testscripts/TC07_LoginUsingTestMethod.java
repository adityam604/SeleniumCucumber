package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC07_LoginUsingTestMethod extends TestBase {

	@Test(priority=1)
	public void Login() throws InterruptedException
	{
		OrangePages OrangeOR = new OrangePages(Driver);
		OrangeOR.EnterUsername(username);
		OrangeOR.Enterpwd(pwd);
		OrangeOR.clickloginbtn();
		Thread.sleep(2000);
		String url = Driver.getCurrentUrl();
		
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	@Test(priority=2)
	public void adminclick()
	{
		OrangePages OrangeOR = new OrangePages(Driver);
		OrangeOR.clickadminmodule();
	}
	
}
