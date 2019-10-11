package AutomationTesting1.Travels;
import org.openqa.selenium.By;

public class Homepage extends Launch{
		 static By MyAccount=By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/a[1]");
		 static By Signupbutton=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
		 static By loginbutton=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
		 
	/*public Homepage(WebDriver driver)
	{
		Launch.driver = driver;
	}*/
	
	public static void Signup() {
		driver.findElement(MyAccount).click();
		driver.findElement(Signupbutton).click();
	}
	public static void login() {
		driver.findElement(MyAccount).click();
		driver.findElement(loginbutton).click();
	}
	/*public static void main(String args[])throws Exception{
		Launchbrowser();
		Signup();
		login();
	
	}*/
}
