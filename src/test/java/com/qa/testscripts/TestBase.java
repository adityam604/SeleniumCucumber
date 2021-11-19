package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	ReadConfig readconfig = new ReadConfig();
	
	public String baseURl= readconfig.getApplicationURL();
	public static WebDriver Driver;
	public String username = readconfig.getuname();
	public String pwd = readconfig.getpwd();
	
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String Browser)
	{
		
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Driver = new FirefoxDriver();
		} else if(Browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			Driver = new InternetExplorerDriver();
		}
		
		Driver.get(baseURl);	
		
	}
	
	@AfterClass
	public void tearDown() {
		Driver.quit();
	}
	
	
}
