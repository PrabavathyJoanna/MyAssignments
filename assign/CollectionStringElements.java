package week3.day2.assign;

import java.util.ArrayList;
import java.util.List;

public class CollectionStringElements {

	//main function
	public static void main(String[] args) {
		
	//declaring list
	List<String> str=new ArrayList<String>();
	

	
	//HCL, Wipro, Aspire Systems, CTS} Inserting list values
	str.add("HCL");
	str.add("Wipro");
	str.add("Aspire System");
	str.add("CTS");
	
	//sorting the list
	str.sort(String.CASE_INSENSITIVE_ORDER);
	
	//iterate the list in reverse order
	for(int i=str.size()-1;i>=0;i--)
	{
		System.out.print(" " +str.get(i));
		
	}

	}

}
