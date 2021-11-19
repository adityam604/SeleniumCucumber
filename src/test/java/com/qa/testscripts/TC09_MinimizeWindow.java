package com.qa.testscripts;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.pages.OrangePages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC09_MinimizeWindow {
	WebDriver Driver;
	OrangePages OrangeOR;
	
	
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		OrangeOR = new OrangePages(Driver);
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		Driver.manage().window().maximize();
		Driver.manage().window().setPosition(new Point(0, -1000));
		
	}
	
}
