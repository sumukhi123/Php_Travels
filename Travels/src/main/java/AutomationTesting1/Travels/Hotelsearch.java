package AutomationTesting1.Travels;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

public class Hotelsearch extends Launch {
	static By Homebutton=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By Hotelname=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	static By Hotellink=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	static By Checkin=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	static By Hotelselect=By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li/div");
	
	public static void hotel() throws Exception {
		driver.findElement(Homebutton).click();
		//driver.findElement(cookies).click();//
		driver.findElement(Hotelname).click();
		driver.findElement(Hotellink).sendKeys(prop.getProperty("Hotellink"));
		Thread.sleep(4000);
		driver.findElement(Hotelselect).click();
		driver.findElement(Checkin).click();
		
		//Check-in
		while(true) 
		{
		String str1=driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[2]")).getText();
		if(str1.equals(prop.getProperty("Month"))) {
			break;
		}
		else {
			driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[3]")).click();
			
		}
		}
		driver.findElement(By.xpath("//div[14]//tr//td[contains(text(),"+prop.getProperty("day")+")]")).click();
		
		
		//Check-out
		
		while(true)
		{
			String str1=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
			if(str1.equals(prop.getProperty("Month1")))
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[3]")).click();
				
				
			}
		}
		driver.findElement(By.xpath("//div[15]//tr//td[contains(text(),"+prop.getProperty("day1")+")]")).click();
		
		
		//guests
		
		driver.findElement(By.xpath("//input[@id='htravellersInput']")).click();
		driver.findElement(By.xpath("//input[@id='hadultInput']")).sendKeys(prop.getProperty("adultid"));
		driver.findElement(By.xpath("//input[@id='hchildInput']")).sendKeys(prop.getProperty("childid"));
		
		
		//search
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")).click();
	}
	
	public static void main(String[] args) throws Exception {
	 Launchbrowser();
	 hotel();
	 }

	 
}
		
