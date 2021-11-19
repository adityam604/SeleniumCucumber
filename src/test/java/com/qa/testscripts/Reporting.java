package com.qa.testscripts;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting extends TestBase  implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
		
	}
	 public void onTestSuccess(ITestResult result) {
		
		Shutterbug.shootPage(Driver, ScrollStrategy.WHOLE_PAGE,500,true).withName("FullPageScreenshotpass").save();
		
		
	}
	 public void onTestFailure(ITestResult result) {
		 
			Shutterbug.shootPage(Driver, ScrollStrategy.WHOLE_PAGE,500,true).withName("FullPageScreenshotFail").save();
			
		
	}
	 public void onTestSkipped(ITestResult result) {
		
		
	}
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	 public void onStart(ITestContext context) {
		
		
	}
	 public void onFinish(ITestContext context) {
		
		// xReport.flush();
	}

}
