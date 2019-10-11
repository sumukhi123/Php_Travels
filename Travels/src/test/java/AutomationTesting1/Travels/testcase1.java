package AutomationTesting1.Travels;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class testcase1 extends Regispage{
	Launch la=new Launch();
	Homepage ho=new Homepage();
	Regispage ri=new Regispage();
	 
	@Test
	public void method() throws Exception {
		la.Launchbrowser();
		ho.Signup();
		ri.Registrationpage();
		
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:\\ProjectAPI\\registerscreenshot"));
	}

}
