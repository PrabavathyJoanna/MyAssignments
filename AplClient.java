package week3.day1.assign;

public class AplClient {
	
	//Method without Arguments
	public void sendRequest()
	{
		System.out.println("No Arguments");
		System.out.println("Endpoints");
	}
	
	//Same Method with one arguments overloaded
	public void sendRequest(String endpoint)
	{
		System.out.println("\nSame Method with one Arguments");
		System.out.println("Enter the EdPoint:" +endpoint);
		
	}
	//Same Method with two arguments overloaded
	public void sendRequest(String endpoint, String requestBody)
	{
		System.out.println("\nSame Method with two Arguments");
		System.out.println("Enter the Endpoint Name:" +endpoint);
		System.out.println("Enter the RequestBody:" +requestBody);
		
	}
	//Same Method with three arguments overloaded
	public void sendRequest(String endpoint,String requestBody, Boolean requeststatus)
	{
		System.out.println("\nSame Method with three Arguments");
		System.out.println("Enter the Endpoint Name:" +endpoint);
		System.out.println("Enter the RequestBody:" +requestBody);
		System.out.println("The Sender want to Send Request :" +requeststatus);
	}

	public static void main(String[] args) {
		//class initialized
		AplClient aplc=new AplClient();
		System.out.println("*******Method Overloading*******");
		
		//called the method using object
		aplc.sendRequest();
		
		//Method overloaded
		aplc.sendRequest("Joanna");
		aplc.sendRequest("Joanna", "Send the Request");
		aplc.sendRequest("Joanna", "Send the Request", true);

	}

}
