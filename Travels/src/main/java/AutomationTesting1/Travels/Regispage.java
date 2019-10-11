package AutomationTesting1.Travels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Regispage extends Homepage {
	
	 public Regispage() {
		
	}
	static By firstname=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[3]/input[1]");
	static By lastname=By.xpath("//input[@placeholder='Last Name']");
	static By mobilenumber=By.xpath("//input[@placeholder='Mobile Number']");
	static By email=By.xpath("//input[@placeholder='Email']");
	static By password=By.xpath("//input[@placeholder='Password']");
	static By confirmpassword=By.xpath("//input[@placeholder='Confirm Password']");
	static By signup=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	static By cookie = By.xpath("//button[@id='cookyGotItBtn']");

	public static void Registrationpage() {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(cookie).click();
		driver.findElement(firstname).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(lastname).sendKeys(prop.getProperty("lastname"));
		driver.findElement(mobilenumber).sendKeys(prop.getProperty("mobilenumber"));
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(password).sendKeys(prop.getProperty("password"));
		driver.findElement(confirmpassword).sendKeys(prop.getProperty("confirmpassword"));
		driver.findElement(signup).click();
		
		
	}
	public static void main(String[] args) throws Exception {
		 /*Launch l = new Launch();*/
		Launchbrowser();
		/*Homepage hp = new Homepage();*/
		Signup();
		 /*Regispage rp = new Regispage(driver);*/
		Registrationpage();
	}

}
