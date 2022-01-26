package common;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.TestUtils;

public class Listeners extends TestUtils implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("test method started");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test method success");
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("test method failed");
		getScreenShot();
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("test method skipped");
	}

}
