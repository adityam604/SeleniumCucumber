package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03_PrintAllElements {
	
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
		String title = Driver.getTitle();
		System.out.println("The title of the URL "+title);
		List<WebElement> img= OrangeOR.getimageelements();
		
		for(WebElement imageFromList:img){
		     Dimension ImageUrl=imageFromList.getSize();
		     System.out.println(ImageUrl); 
		}
		
		List<WebElement> txt= OrangeOR.gettextboxelements();
		
		for(WebElement textFromList:txt){
		     String textstrings=textFromList.toString();
		     System.out.println(textstrings);
		}
		List<WebElement> hypertxt= OrangeOR.getAllLinks();
		
		for(WebElement textFromList1:hypertxt){
		     String hypertexts=textFromList1.getText();
		     System.out.println(hypertexts);
		}
		
		
		
		}
		
	@Test
	public void teardown()
	{
		Driver.close();
	}
	}
	


