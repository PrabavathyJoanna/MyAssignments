package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/.");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Enter the Valid Username and Password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Login 
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Select LEAD
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the Company Name
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Testleaf");
		
		//Enter the FirstName and LastName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("new");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Newton");
		
		//Enter FirstName is Local
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("local");
		
		//Enter Department Name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer");
		
		//Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Part");
		
		//Enter Email_id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("praba.narmadha@gmail.com");
		
		//Selectprovince NewYork
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select opt = new Select(dropdown);
		opt.selectByValue("NY");
		
		//Click Create Button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Click Edit Button
		driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		
		//Clear the Description
		WebElement element =driver.findElement(By.id("updateLeadForm_description"));
		element.clear();
		
		//Update the Description
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("cleared the description");
		
		//Click Update Button
		driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		
		//Check the Page TITLE and Print 
		String title = driver.getTitle();
		System.out.println(title);
		
		
		Thread.sleep(5000);
		
		//Close the Browser
		driver.close();
	}
}
