package com.qa.testscripts;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class TC14_CSS_Selector extends TestBase{
	
	@Test
	public void login() throws InterruptedException
	{
		
		OrangePages OrangeOR = new OrangePages(Driver);
		OrangeOR.EnterUsername(username);
		OrangeOR.Enterpwd(pwd);
		OrangeOR.clickloginbtn();
		Thread.sleep(2000);
		Driver.findElement(By.cssSelector("img[src='/webres_5fee89a90600f2.94309009/orangehrmLeavePlugin/images/ApplyLeave.png']")).click();
		OrangeOR.clickdashboardmodule();
		Driver.findElement(By.cssSelector("img[src='/webres_5fee89a90600f2.94309009/orangehrmTimePlugin/images/MyTimesheet.png']")).click();
		
		Driver.findElement(By.cssSelector("a[id=menu_pim_viewPimModule]")).click();
		
		Driver.findElement(By.cssSelector("a[id=menu_time_viewTimeModule]")).click();
		
		Driver.findElement(By.cssSelector("a[id=menu_maintenance_purgeEmployee]")).click();
		

		}
	
}
