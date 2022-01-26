package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	public static WebDriver driver=null;
	
	@BeforeSuite
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\OneDrive\\Documents\\AppiumJars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void closeDriver() {
		driver.close();
	}

}
