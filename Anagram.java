package week3.day1.assign;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println("***************ANAGARAM*****************");
		
		//Declaration Part
		String str1="stops";
		String str2="potss";
		int a=0;
		Boolean isEqual=true;
		char[] ch = null;
		char[] ch1 = null;
		
		//compare both string length are equal
		if(str1.length()==str2.length()) //if equal
		{
			a=str1.length();
			System.out.println("\nString-1 and String-2 length are Equal");
			//Print the Length of String
			System.out.println("\nlength of the String ="+a);
			//store the string-1 in array
			ch = str1.toCharArray();
			//sort the String-1
			Arrays.sort(ch);
			//store the string-2 in array
			ch1 = str2.toCharArray();
			//sort the String-2
			Arrays.sort(ch1);
		
		//comparing the two string (String-1 and String-2)
		for(int i =0;i<a-1;i++)
		{
			if(ch[i]==ch1[i])
			{
				isEqual =true;
				continue;
			}
		}
		System.out.println(isEqual);
		}
		
		//Length of two string mismatch
		else //if not equal
		{   
			System.out.println("String-1 and String-2 Lenght Mismatch");
			System.out.println("String-1 and String-2 are not equal");
		}
		}
}

