package week3.day2.assign;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
	int n=0;
	char[] set={1, 2, 3, 4, 10, 6, 8};
	Arrays.sort(set);
	n= set.length;
	
	for(int i=0;i<=set.length-1;i++) {
		System.out.print(+set[i] +" ");
	}

	
	boolean ischeck;
	int q;
	System.out.print("\nMissing Numbers:");
	for(int i = 0;i<n;i++)
		if(set[i]==i+1)
		{
			ischeck=true;
			continue;
		}
		else
		{
			ischeck=false;
			q=set[i];
			q=q-1;
			System.out.print(+q +" ");
			continue;
		}
	
}
}


