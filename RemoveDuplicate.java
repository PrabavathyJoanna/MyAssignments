package week3.day1.assign;

public class RemoveDuplicate {


	public static void main(String[] args) {
		
		//Declared and assigned values to the string
		String value="We learn Java basics as part of java sessions in java week1";
	
		//printed the values
		System.out.println(value);
		
		//split the value
		String[] split=value.split(" ");
		System.out.println("String Split:");
	
		//splitted value printed in loop
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]); // Print each word on a new line
        }
        
        //comparing the splitted value
        for(int i=0;i<split.length;i++)
		{
  
			for(int j=i+1;j<split.length;j++)
				
			{
				//split matched then replacing with space
				if(split[i].equals(split[j]) && !split[i].equals(""))
				{
				System.out.println(split[i]);
				String replace=value.replace(split[i]," ");
				System.out.println("\nString Replace:"+replace);
				}
				
				
			}
		
		}
	}
}
