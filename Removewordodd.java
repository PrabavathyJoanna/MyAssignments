package week3.day1.assign;

public class Removewordodd {

	public static void main(String[] args) {
		//declared and assigned values
		String test = "I am a software tester"; 
		
		//splitted the value
		String[] split=test.split(" ");
		
		//splitted value printed
		for(int i=0;i<split.length-1;i++)
		{
			System.out.print(split[i]+ " ");
		}
		System.out.print("\n");
		
		//checking the odd place string
		for(int i=0;i<split.length;i++)
		{
		if(i%2==0)
		{
			System.out.print(split[i]+ " ");	
			
		}
		
		//now reversing the odd place string
		else 
		{
			System.out.print("");
			String reversedWord = "";
			
            for (int j = split[i].length() - 1; j >= 0; j--) {
                reversedWord += split[i].charAt(j);
            }
            System.out.print(reversedWord+ " " );
		}
		

			}
	}
		
	}
	

