package com.testcases.amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class B_RetryAnalyzer implements IRetryAnalyzer {

	int count=0;
	int retryCount=2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<retryCount) {
			count++;
			return true;
		}
	
		return false;
	}
}
