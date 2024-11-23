package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/.");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Pass Username and Password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Select CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Select LEAD
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click Phone Number
		driver.findElement(By.linkText("Phone")).click();
		
		//Give 99 Input
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		
		//Get Id 
		WebElement emp = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
		String value = emp.getText();
		System.out.println("Value: " + value);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		//Delete Lead
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		//Click Find Lead
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Search the Stored Lead Id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(value);
		
		//Stored Lead Id not Display
		driver.findElement(By.linkText("Find Leads")).click();
		
		Thread.sleep(5000);
		
		//Close the Browser
		driver.close();
	}

}
