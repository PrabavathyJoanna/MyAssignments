package week1.day2;

public class Broswer {
	public String launchBrowser(String BrowserName){
		System.out.println(BrowserName);
		return BrowserName;
	}
	public void loadUrl() {
		System.out.println("Application URL loaded Successfully");
		
	}
	public static void main(String[] args) {
		Broswer b= new Broswer();
		String launchBrowser = b.launchBrowser("Chrome");
		b.loadUrl();
		
	}
	
}
