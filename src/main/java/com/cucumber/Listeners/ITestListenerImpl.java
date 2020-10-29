package com.cucumber.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ITestListenerImpl extends ExtentReportListener implements ITestListener{

	private static ExtentReports extent;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test PASSED...");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test FAILED...");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test SKIPPED...");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution started...");
		extent=setUp();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution finished...");
		extent.flush();
		
	}

}
