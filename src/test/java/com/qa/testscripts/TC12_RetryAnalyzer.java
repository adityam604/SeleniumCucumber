package com.qa.testscripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TC12_RetryAnalyzer implements IRetryAnalyzer{

	private int retryCount=0;
	private static final int maxRetryCount=3;
	
	  public boolean retry(ITestResult result) {
	        if (retryCount < maxRetryCount) {
	          retryCount++;
	          return true;
	        }
	        return false;

	
	
}
	  
}
