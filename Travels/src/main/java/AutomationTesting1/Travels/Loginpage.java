package AutomationTesting1.Travels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage extends Homepage {
	
	/*public Loginpage(WebDriver driver) {
		super(driver);
	}*/


	By email=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By cookie = By.xpath("//button[@id='cookyGotItBtn']");
	By login=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	public void login1()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(cookie).click();
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(password).sendKeys(prop.getProperty("password"));
		driver.findElement(login).click();
	}
	

	public static void main(String[] args) throws Exception {
		Launch l = new Launch();
		l.Launchbrowser();
		Homepage hp = new Homepage();
		hp.login();
		Loginpage lp = new Loginpage();
		lp.login1();
		
	}
	

}
