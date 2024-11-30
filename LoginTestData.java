package week3.day1.assign;

public class LoginTestData extends TestData {
	
	public void  userName() {
		System.out.println("Username=Praba");
	}
	public void  passWord() {
		System.out.println("Password=New@123");
	}

	public static void main(String[] args) {
		
	//Calling outside the class using inheritance
	LoginTestData ltd=new LoginTestData();
	
	//Calling inside the class
	ltd.enterCredentials();
	
	//Inside the Class methods called
	ltd.userName();
	ltd.passWord();
	
	//Calling outside the class using inheritance
	ltd.navigateToHomePage();
		
	}

}
