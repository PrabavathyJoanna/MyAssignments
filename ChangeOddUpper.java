package week3.day1.assign;

public class ChangeOddUpper {

	public static void main(String[] args) {
		
		//declared test and assigned value
		String test ="changeme";
		
		//stored value in array
		char[] ch = test.toCharArray();
		char[] ch1 = new char[ch.length];
		System.out.println("****Change Odd Index To Uppercase****");
		 
		//checking the odd values
		for(int i =0;i<=ch.length-1;i++)
		{
			
			if(i%2==0)
			{
				ch1[i]=ch[i];
				System.out.print(ch1[i]);
			
			}
			//odd values transfered to Uppercase
			else
			{
				
				ch1[i] = Character.toUpperCase(ch[i]);	
				System.out.print(ch1[i]);
			}
			
		}
		

	}

}
