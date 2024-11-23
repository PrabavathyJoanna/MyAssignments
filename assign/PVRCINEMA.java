package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCINEMA {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='WICKED'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='p-button-label p-c'])[5]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("(//span[text()='12'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WebElement pre = driver.findElement(By.xpath("//p[text()='PREMIUM']"));
		String value = pre.getText();
		System.out.println("Seat Information: " + value);
		WebElement gt = driver.findElement(By.xpath("(//span[text()='189.50'])[2]"));
		String rate = gt.getText();
		System.out.println("Grand Total: " + rate);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		

	}

}
