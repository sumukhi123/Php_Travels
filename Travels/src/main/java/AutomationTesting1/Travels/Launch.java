package AutomationTesting1.Travels;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	 public static WebDriver driver;
	 public static Properties prop=new Properties();
public static void Launchbrowser() throws Exception {
System.out.println("Launch Class Started Executing ");	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Documents\\wdrivers\\chromedriver.exe");
driver= new ChromeDriver();

FileInputStream fis=new FileInputStream("C:\\Users\\Online Test\\Desktop\\Aswin Bhaskar 9847896588\\Travels\\src\\main\\java\\files\\data.properties");
prop.load(fis);
System.out.println("Property file loaded ");
driver.get(prop.getProperty("Host"));
System.out.println("Got host property from property file "+prop.getProperty("Host"));
driver.manage().window().maximize();
System.out.println("Launch Class Ended Executing ");
}
/*public static void main(String args[]) throws Exception
{
	Launchbrowser();
}*/

}
