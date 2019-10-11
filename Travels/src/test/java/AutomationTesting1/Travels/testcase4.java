package AutomationTesting1.Travels;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class testcase4 extends Toursearch {
	Launch lc=new Launch();
	Toursearch to=new Toursearch();
	@Test
	

	public void method2() throws Exception {
		lc.Launchbrowser();
		to.tours();
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:\\ProjectAPI\\toursearchscreenshot"));
		
		
	}

}
