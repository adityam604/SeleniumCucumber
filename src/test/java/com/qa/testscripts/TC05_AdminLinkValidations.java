package com.qa.testscripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class TC05_AdminLinkValidations extends TestBase {
	
	@Test
	public void login() throws InterruptedException
	{
		
		OrangePages OrangeOR = new OrangePages(Driver);
		OrangeOR.EnterUsername(username);
		OrangeOR.Enterpwd(pwd);
		OrangeOR.clickloginbtn();
		Thread.sleep(2000);
		
		String usermngmnt= OrangeOR.verifyadminusermanagement();
		Assert.assertEquals(usermngmnt, "User Management");
		
		String job= OrangeOR.verifyadminjob();
		Assert.assertEquals(job, "Job");
		
		String organization= OrangeOR.verifyadminorganization();
		Assert.assertEquals(organization, "Organization");
		
		String qualification= OrangeOR.verifyadminQualifications();
		Assert.assertEquals(qualification, "Qualifications");


		}

}
