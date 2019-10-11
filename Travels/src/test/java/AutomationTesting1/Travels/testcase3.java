package AutomationTesting1.Travels;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class testcase3 extends Hotelsearch {
	Launch ln=new Launch();
	Hotelsearch he=new Hotelsearch();
	@Test
	public void method1() throws Exception {
		ln.Launchbrowser();
		he.hotel();
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:\\ProjectAPI\\hotelsearchscreenshot"));
		
	}
	
	

}
