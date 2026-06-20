package day9;

public class StringComparison {
	
	public static void main(String[] args) {
		
		String s1 = new String("welcome");
		String s2 = new String("welcome");
		
		System.out.println(s1==s2);//false to compare objects
		
		System.out.println(s1.equals(s2));//true to compare values of objects
	}

}
