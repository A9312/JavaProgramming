package day9;

public class ReverseAString {

	public static void main(String[] args) {
		
		String s = "welcome";
		
		String rev="";
		
		for(int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		String s1 ="welcome";
		
		String reversed="";
		
		char a[]=s1.toCharArray();
		
		
		for(int b=a.length-1;b>=0;b--)
		{
			reversed = reversed + a[b];
		}
			
		System.out.println(reversed);
		
		StringBuffer s2 = new StringBuffer("welcome");
		
		System.out.println(s2.reverse());
		
		
	}
}
