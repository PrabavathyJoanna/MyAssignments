package week2.days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcc {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		/*
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("leaf@2024");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	*/
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("JohnAlex");
		driver.findElement(By.xpath("//textarea[@class='inputBox'][1]")).sendKeys("Selenium Automation Tester");
		WebElement dropDown = driver.findElement(By.name("industryEnumId"));
		Select opt= new Select(dropDown);
		opt.selectByIndex(2);
		WebElement dropDown1 = driver.findElement(By.name("ownershipEnumId"));
		Select opt1=new Select(dropDown1);
		opt1.selectByVisibleText("S-Corporation");
		WebElement dropDown2 = driver.findElement(By.id("dataSourceId"));
		Select opt2=new Select(dropDown2);
		opt2.selectByValue("LEAD_EMPLOYEE");
		WebElement dropDown3 = driver.findElement(By.id("marketingCampaignId"));
		Select opt3=new Select(dropDown3);
		opt3.selectByIndex(5);
		WebElement dropDown4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select opt4=new Select(dropDown4);
		opt4.selectByValue("TX");
		driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
