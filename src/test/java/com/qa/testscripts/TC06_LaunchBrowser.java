package com.qa.testscripts;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC06_LaunchBrowser {
	WebDriver Driver;
	@Test
	public void Browserlaunchconf()
	{
		System.out.println("Browser is launched");
	}
	
	@BeforeSuite
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	
	@Test
	public void teardown()
	{
		System.out.println("Browser is closed");
		Driver.close();
	}

}

