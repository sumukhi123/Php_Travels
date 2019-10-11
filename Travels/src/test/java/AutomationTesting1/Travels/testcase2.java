package AutomationTesting1.Travels;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class testcase2 extends Launch {
	Launch lu=new Launch();
	Homepage hm=new Homepage();
	Loginpage lg=new Loginpage();
	@Test
	public void method() throws Exception {
		lu.Launchbrowser();
		hm.login();
		lg.login1();
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:\\ProjectAPI\\loginscreenshot"));

	}

}
