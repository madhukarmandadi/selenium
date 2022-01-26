package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import common.Base;

public class TestUtils extends Base {
	
	
	public void getScreenShot() {
		Date currentdate=new Date();
		String scrrenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + scrrenshotfilename + ".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
