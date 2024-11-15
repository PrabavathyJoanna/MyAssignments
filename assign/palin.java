package week1.assign;
import java.util.Scanner;


public class palin {
	public static void main(String[] args) {
		int p, i, j, q;
		Boolean isPalindrome=true;
		System.out.println("***************Plaindrom**************");
		System.out.println("Enter the number of input Number:");
		Scanner p1 = new Scanner(System.in);
		p = p1.nextInt();
		q=p;
		System.out.println("Enter the list  of " + p + " Number:");
		int[] number=new int[p];
		for( i =0;i<p;i++)
		{
			number[i] = p1.nextInt();
		}
		System.out.println();
		for(j=1;j<=p;j++){
			
	
				System.out.print(number[p-j] + " ");
		}
		q=p-1;
		
		for(i=0;i<p;i++)
		{
		if(number[i]==number[q-i])
		{
		isPalindrome = true;
		continue;
		}
		else {
			isPalindrome = false;
			break;
		}
		}
		
		if(isPalindrome)
		{
			System.out.println(" is a Palindrome");
		}
		else
		{
			System.out.println(" is Not a Palindrome");
		}
	}
	}
	

