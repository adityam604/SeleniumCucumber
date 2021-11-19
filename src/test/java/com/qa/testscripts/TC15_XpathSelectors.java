package com.qa.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class TC15_XpathSelectors extends TestBase {
	
	@Test
	public void login() throws InterruptedException
	{
		
		OrangePages OrangeOR = new OrangePages(Driver);
		OrangeOR.EnterUsername(username);
		OrangeOR.Enterpwd(pwd);
		OrangeOR.clickloginbtn();
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		
		Driver.findElement(By.xpath("//input[@id='MP_link']")).click();
		
		OrangeOR.clickdashboardmodule();
		
		Driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/img[1]")).click();
		
		Driver.findElement(By.xpath("//a[@id='welcome']")).click();
		

		}

}
