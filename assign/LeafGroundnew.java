package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundnew {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://leafground.com/button.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Click on the button
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		
		//Get Title
		String pageTitle = driver.getTitle();
		if (pageTitle == "Dashboard")
		{
			System.out.println("Title of the Page is Dashboard");
		}
		//Navigate back
		driver.navigate().back();
		
		//Get location
		WebElement submit = driver.findElement(By.id("j_idt88:j_idt94"));
		Point point = submit.getLocation();
		System.out.println("The Location of submit button is " +point);
		int x = point.getX();
		System.out.println("x---"+x);
		
		//is enabled 
		WebElement enable = driver.findElement(By.id("j_idt88:j_idt94"));
		boolean flag = enable.isEnabled();
		System.out.println("Button is Enabled---"+flag);
		
		//Element colour
		WebElement buttonClr = driver.findElement(By.id("j_idt88:j_idt96"));
		String Clr = buttonClr.getCssValue("background-color");
		System.out.println("The colour of the buttonn is---" +Clr);
		
		//height and width of the element
		WebElement submit1 = driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension size = submit1.getSize();
		System.out.println("Height and Widht of the button is " +size);
		
		//Close the Browser
		driver.close();

	}

}
