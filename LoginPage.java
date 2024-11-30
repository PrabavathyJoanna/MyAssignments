package week3.day1.assign;

public class LoginPage extends BasePage {
	
	
	//Method Overrided
	
	@Override public void performCommonTasks(int c)
	{
		//Passed from main function 5
		System.out.println("\nPerform the Common Task:" +c);
		
		//Using Super keyword in SubClass Overrided the  Base class
		super.performCommonTasks(10);
	}
	
	//Main 
	public static void main(String[] args) {
		
	//Class Initialized
	LoginPage lp=new LoginPage();
	
	//called the method using object and passed the value
	lp.performCommonTasks(5);
	

	}

}
