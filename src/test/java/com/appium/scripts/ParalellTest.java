package com.appium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParalellTest {

	protected static ThreadLocal<ChromeDriver> driver = new ThreadLocal<ChromeDriver>();

	@BeforeMethod
	public void initializeDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\OneDrive\\Documents\\AppiumJars\\chromedriver.exe");
		driver.set(new ChromeDriver());
	}

	public WebDriver getDriver() {
		return driver.get();
	}

	@AfterMethod
	public void quitDriver() {
		getDriver().quit();
	}

}
