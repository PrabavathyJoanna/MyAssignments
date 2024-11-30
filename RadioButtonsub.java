package week3.day1.assign;

//Inherited ButtonSub subclass
public class RadioButtonsub extends ButtonSub{
	
	public void selectRadioButton()
	{
		System.out.println("Select the Radio Button");
	
	}

	public static void main(String[] args) {
	RadioButtonsub rbs = new RadioButtonsub();
	rbs.click();
	rbs.setText("Praba");
	rbs.submit();
	
	}



}
