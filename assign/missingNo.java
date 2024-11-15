package week1.assign; 
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

public class missingNo {

	public static void main(String[] args) {
		int p,i,q=0;
		boolean ischeck=true;
		int[] num= {1,4,3,2,8,7,6};
		
		
		p= num.length-1;
		
		Arrays.sort(num);
		for(i=0;i<p;i++)
			if(num[i]==i+1)
			{
				ischeck=true;
				continue;
			}
			else
			{
				ischeck=false;
				q=num[i];
				q=q-1;
				break;
			}
	if(ischeck) {
		System.out.println("All Numbers are Correct");
	}
	else {
		
		System.out.println("Missing Number is=" +q);
		
	}
		
		
		

	}

}
