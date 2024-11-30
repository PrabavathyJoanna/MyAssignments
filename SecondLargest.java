package week3.day2.assign;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
	int[] set=  {3, 2, 11, 4, 6, 7};
	System.out.println("\nBefore the Elements Sorted:");
	for(int i=0;i<set.length;i++)
	{
		System.out.print(" " +set[i]);
	}
		
	Arrays.sort(set);
	System.out.println("\nAfter the Elements Sorted:");
	for(int i=0;i<set.length;i++)
	{
		System.out.print(" " +set[i]);
	}
	int j=set.length-2;
	System.out.print("\nThe Second Largest Number:");
	System.out.print(set[j]);

	}
	
}
