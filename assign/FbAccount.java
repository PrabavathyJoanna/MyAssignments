package week2.days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbAccount {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Prabavathy");
		driver.findElement(By.name("lastname")).sendKeys("Newton");
		WebElement dropDown = driver.findElement(By.id("day"));
		Select opt=new Select(dropDown);
		opt.selectByValue("23");
		WebElement dropDown1 = driver.findElement(By.id("month"));
		Select opt1=new Select(dropDown1);
		opt1.selectByValue("11");
		WebElement dropDown2 = driver.findElement(By.id("year"));
		Select opt2=new Select(dropDown2);
		opt2.selectByValue("1990");
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Female')]/input"));
		element.click();
		boolean enabled = element.isSelected();
		System.out.println(enabled);
		if(enabled==false)
		{
			element.click();
			
		}
		driver.findElement(By.name("reg_email__")).sendKeys("praba.narmadha@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Prathy@321");





		Thread.sleep(5000);
		driver.close();
	}
}
