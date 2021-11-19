package com.qa.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class TC08_PageTitles extends TestBase{
	@Test
	public void login() throws InterruptedException
	{
		
		OrangePages OrangeOR = new OrangePages(Driver);
		OrangeOR.EnterUsername(username);
		OrangeOR.Enterpwd(pwd);
		OrangeOR.clickloginbtn();
		Thread.sleep(2000);
		OrangeOR.clickadminmodule();
		String Adminpagetitle= Driver.getTitle();
		System.out.println(Adminpagetitle);
		
		OrangeOR.clickpimmodule();
		String pimpagetitle= Driver.getTitle();
		System.out.println(pimpagetitle);
		
		OrangeOR.clickleavemodule();
		String Leavepagetitle= Driver.getTitle();
		System.out.println(Leavepagetitle);
		
		OrangeOR.clickdashboardmodule();
		String dashboardpagetitle= Driver.getTitle();
		System.out.println(dashboardpagetitle);
		
		OrangeOR.clickdirectorymodule();
		String directorypagetitle= Driver.getTitle();
		System.out.println(directorypagetitle);
		
		OrangeOR.clickmaintenancemodule();
		String maintenancepagetitle= Driver.getTitle();
		System.out.println(maintenancepagetitle);
		
	}

	
}
