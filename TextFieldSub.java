package week3.day1.assign;

//Inherited ButtonSub  subclass
public class TextFieldSub extends ButtonSub{

	public void getText(String tx1) {
		System.out.println("\nclicked yes/no:" + tx1);
	}
	public static void main(String[] args) {
		TextFieldSub tfs = new TextFieldSub();
		tfs.getText("Newton");
				

	}

}
