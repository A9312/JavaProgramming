package day6;

public class SingleDimensionalArray {
	
	public static void main(String[] args) {
		
		
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		int b[] = {100,30,200,304};
		
		System.out.println(a.length);
		
		System.out.println(a[0]);
		
		
		for (int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
