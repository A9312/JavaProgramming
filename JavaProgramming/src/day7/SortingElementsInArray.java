package day7;

import java.util.Arrays;

public class SortingElementsInArray {
	
	public static void main(String[] args)
	{
		int a[]= {3,1,2,5,6,9,7,8,21};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
