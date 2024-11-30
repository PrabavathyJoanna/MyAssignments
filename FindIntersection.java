package week3.day2.assign;

public class FindIntersection {

	public static void main(String[] args) {
		int[] set=  {3, 2, 11, 4, 6, 7};
		System.out.println("The First Set of Number:");
		for(int i=0;i<=set.length-1;i++)
		{
			System.out.print(" " +set[i]);
		}
		int[] set1= {1, 2, 8, 4, 9, 7};
		System.out.println("\nThe Second Set of Number:");
		for(int i=0;i<=set1.length-1;i++)
		{
			System.out.print(" "+set1[i]);
		}
		System.out.println("\nIntersection Sets:");
		for(int i=0;i<=set.length-1;i++)
		{
			for(int j=0;j<=set1.length-1;j++)
			{
				if(set[i]==set1[j])
				{
					System.out.print(" "+set1[j]);
					
				}
			}
		}

	}

}
