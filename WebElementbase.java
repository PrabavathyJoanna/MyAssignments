package week3.day1.assign;

public class WebElementbase {
	public void click()
	{
		System.out.println("Click");
	}
	public void setText(String tx) {
		System.out.println("\nBase Class:" + tx);
	}
	public static void main(String[] args) {
	WebElementbase wlb = new WebElementbase();
	//wlb.click();
	//wlb.setText("Yes");
	}

}
