package day6;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		int a[][] = {{100,200},{300,400},{500,600}};
		
		System.out.println(a.length);
		
		System.out.println(a[0].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int[] x:a)
		{
			for(int y:x)
			{
				System.out.println(y);
			}
		}
	}

}
