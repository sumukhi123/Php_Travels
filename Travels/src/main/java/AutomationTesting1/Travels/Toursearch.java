package AutomationTesting1.Travels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Toursearch extends Launch
{
	static By cookies = By.xpath("//button[@id='cookyGotItBtn']");
	static By TourButton = By.xpath("//div[@id='body-section']//li[3]//a[1]");
	static By field = By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
	static By field1 = By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
	static By tourname =By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[1]/div");
	static By departuredate = By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	static By guest = By.xpath("//select[@id='adults']");
	static By typetour = By.xpath("//select[@id='tourtype']");
	static By type1 = By.xpath("//option[contains(text(),'Couples')]");
	static By search = By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg "
    + "btn-block pfb0 loader'][contains(text(),'Search')]");
	
	public static void tours() throws InterruptedException {
		driver.findElement(TourButton).click();
		driver.findElement(cookies).click();
		Thread.sleep(1000);
		
		
		driver.findElement(field).click();
		driver.findElement(field1).sendKeys(prop.getProperty("TourName"));
		driver.findElement(field1).sendKeys(Keys.DOWN);
		driver.findElement(tourname).click();
		
		
		//date
		driver.findElement(departuredate).click();
		while(true)
		{
			String str1=driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[2]")).getText();
			if (str1.equals(prop.getProperty("tourMonth")))
			{
				break;
				
			}
			else
			{
				driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[3]")).click();
				
			}
		}
		driver.findElement(By.xpath("//div[11]//tr//td[contains(text(),"+prop.getProperty("tday")+")]")).click();
		
		
		
		//guest
		driver.findElement(guest).click();
		driver.findElement(By.xpath("//select[@id='adults']//option[4]")).click();
		
		
		//select
		
		driver.findElement(typetour).click();
		driver.findElement(type1).click();
		
		//search button
		
		driver.findElement(search).click();	
	}
	
	
	
	public static void main(String[] args) throws Exception {
		//TODO Auto-generate method stub
		Launchbrowser();
		tours();
	}

		
		

	}


