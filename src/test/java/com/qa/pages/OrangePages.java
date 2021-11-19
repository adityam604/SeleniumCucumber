package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePages {

	WebDriver Driver;
	@FindBy(id="txtUsername")
	WebElement username;
	public void EnterUsername(String usernm)
	{
		username.sendKeys(usernm);
	}
	
	@FindBy(id="txtPassword")
	WebElement password;
	public void Enterpwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminmodule;
	public void clickadminmodule()
	{
		adminmodule.click();
	}
	
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	@FindBy(id="menu_admin_viewJobTitleList")
	WebElement jobtitlelink;
	public void clickjobtitle()
	{
		jobtitlelink.click();
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h1[1]")
	WebElement jobtitlepage;
	public String verifyjobtitle()
	{
		return jobtitlepage.getText();
	}
	
	@FindAll(@FindBy(xpath="//img[contains(@src,'png')]"))
	List<WebElement> allimages;
	public List<WebElement> getimageelements()
	{
		return allimages;
	}
	
	@FindAll(@FindBy(xpath="//input[contains(@name,'txt')]"))
	List<WebElement> alltextboxes;
	public List<WebElement> gettextboxelements()
	{
		return alltextboxes;
	}
	
	 @FindAll(@FindBy(tagName = "a"))
	    @CacheLookup
	    List<WebElement> AllLinks;
	 public List<WebElement> getAllLinks() 
	    {
	        return AllLinks;
	    }
	    
	 @FindBy(id="menu_dashboard_index")
		WebElement dashboardmodule;
		public void clickdashboardmodule()
		{
			dashboardmodule.click();
		}
	
		 @FindBy(id="menu_leave_viewLeaveModule")
			WebElement leavemodule;
			public void clickleavemodule()
			{
				leavemodule.click();
			}
			
			 @FindBy(id="menu_pim_viewPimModule")
				WebElement pimmodule;
				public void clickpimmodule()
				{
					pimmodule.click();
				}
				
				@FindBy(id="menu_directory_viewDirectory")
				WebElement directorymodule;
				public void clickdirectorymodule()
				{
					directorymodule.click();
				}
				
				@FindBy(id="menu_maintenance_purgeEmployee")
				WebElement maintenancemodule;
				public void clickmaintenancemodule()
				{
					maintenancemodule.click();
				}
				
				@FindBy(id="menu_admin_UserManagement")
				WebElement adminusermanagement;
				public String verifyadminusermanagement()
				{
					return adminusermanagement.getText();
				}
				

				@FindBy(id="menu_admin_Job")
				WebElement adminjob;
				public String verifyadminjob()
				{
					return adminjob.getText();
				}
				
				
				@FindBy(id="menu_admin_Organization")
				WebElement adminorganization;
				public String verifyadminorganization()
				{
					return adminorganization.getText();
				}
				@FindBy(id="menu_admin_Qualifications")
				WebElement adminQualifications;
				public String verifyadminQualifications()
				{
					return adminQualifications.getText();
				}
				
				@FindBy(id="empsearch_employee_name_empName")
				WebElement pimemployeename;
				public void pimenteremployeename(String empname)
				{
					pimemployeename.sendKeys(empname);
				}
				
				@FindBy(id="searchBtn")
				WebElement pimemployeesearchbtn;
				public void pinsearchempoyee()
				{
					pimemployeesearchbtn.click();
				}
				
				
				

public OrangePages(WebDriver Driver)

	{
	 this.Driver = Driver;
     PageFactory.initElements(Driver, this);
	}

}
