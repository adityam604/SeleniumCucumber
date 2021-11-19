package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_OpenURL {

	WebDriver Driver;
	OrangePages OrangeOR;
	
	@Test
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		OrangeOR = new OrangePages(Driver);
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		Driver.manage().window().maximize();
		
	}
	

	
}
