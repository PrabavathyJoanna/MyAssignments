package week3.day2.assign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioUsingList {

	public static void main(String[] args) throws InterruptedException {
		
		//driver initialized
		ChromeDriver driver= new ChromeDriver();
		
		//maximized window
		driver.manage().window().maximize();
		
		//time based
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//url called
		driver.get("https://www.ajio.com/");
		Thread.sleep(1000);
		
		//In search box passes the value bags
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		
		//searched icon clicked
		driver.findElement(By.xpath("//span[@class='ic-search'][1]")).click();
	
		//selected the checkbox men
		WebElement chk=driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
		chk.click();
		chk.isSelected();
		Thread.sleep(1000);
	
		//selected the checkbox fashion bags
		WebElement chk1=driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
		chk1.click();
		chk1.isSelected();
		Thread.sleep(1000);
		
		//count the branditems and printed
		WebElement bt = driver.findElement(By.xpath("//div[@class='length']"));
		String brandItems = bt.getText();
		System.out.println(" Total No.of Brand Items: " +brandItems);
	
		//List of Brand counted and printed
		Thread.sleep(1000);
		List<WebElement> listofbrand=driver.findElements(By.tagName("brand"));
		float lb=listofbrand.size();
		System.out.println("List of Brand is:"+lb);
		for(int i = 0;i<listofbrand.size();i++)
		{
	
			System.out.println(listofbrand.get(i).getText());
		}
		Thread.sleep(1000);
		
		//List of bag counted and printed
		List<WebElement> bagname=driver.findElements(By.className("nameCls"));
		int bgn=bagname.size();
		System.out.println("BagNames are:"+bgn);
		for(int i = 0;i<bagname.size();i++)
		{
	
			System.out.println(bagname.get(i).getText());
		}
	}
	}
