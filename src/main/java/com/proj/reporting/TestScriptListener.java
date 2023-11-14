package com.proj.reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.proj.utilities.CaptureScreenShot;

public class TestScriptListener implements ITestListener{
	
	ExtentReports extent=ExtentReportGenerator.extentReportGenerator("TestJenkinsJob");
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getTestClass().getName()+"__"+result.getMethod().getMethodName());
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
	     test.log(Status.PASS, result.getMethod().getMethodName()+" is PASSED");
	     test.addScreenCaptureFromPath(CaptureScreenShot.getscreenshotPath());
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+" is FAILED");
		test.addScreenCaptureFromPath(CaptureScreenShot.getscreenshotPath());
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" is SKIPPED");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
}