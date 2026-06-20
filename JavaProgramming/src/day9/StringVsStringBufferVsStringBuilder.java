package day9;

public class StringVsStringBufferVsStringBuilder {
	
	public static void main(String[] args) {
		
		String s="welcome";
		
		s.concat("to java");
		
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("welcome");
		
		s1.append("to java");
		
		System.out.println(s1);
	}

}
