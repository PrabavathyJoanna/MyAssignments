package week3.day1.assign;

//Inherited ButtonSub subclass
public class ExecutionElements extends ButtonSub{

	//created Method 
	public void elements()
	{
		System.out.println("The Execution Main Part");
		
		//Called Base Class using super Keyword
		super.setText("Called the WebElement BaseClass");
		super.click();
		
	}
	public static void main(String[] args) {
	//Class Initialized
	ExecutionElements el=new ExecutionElements();
	
	//Using the Object called method
	el.elements();
	el.submit();
	
	

	}

}
