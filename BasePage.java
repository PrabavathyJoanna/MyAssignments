package week3.day1.assign;

public class BasePage {
	
	//Method:1
	public void  findElement(int a)
	{
	System.out.println("\nFindElement:"+a);
	}
	

	//Method:2
	public void clickElement(int b)
	{
		System.out.println("\nClick the Element:" +b);
		
	}
	

	//Method:3
	public void performCommonTasks(int c)
	{
		System.out.println("\nPerform the Common Task Aissgned:" +c);
	}
	
	public static void main(String[] args) {
	//class initialized
	BasePage bp=new BasePage();
	
	//Passing value to Method using the object
	bp.findElement(1);
	bp.clickElement(2);
	bp.performCommonTasks(3);
	}

}
