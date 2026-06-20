package day8;

import java.util.Arrays;

public class StringMethods {
	
	public static void main(String[] args)
	{
//		String s ="welcome";
//		
//		System.out.println(s.length());
		
		String s1 = "welcome";
		String s2 = "to java";
		
		String s3= "to python";
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.concat(s2).concat(s3));

		String s="   welcome   ";
		
		String a="welcome";
		
		System.out.println(s.trim());
		
		System.out.println(a.charAt(5));
		
		System.out.println(s.contains("wel"));
		
		String s4="welcome";
		
		String s5="welcome";
		
		System.out.println(s4==s5);
		
		System.out.println(s4.equals(s5));
		
		System.out.println(s4.equalsIgnoreCase(s5));
		
		String c = "welcome to selenium";
		
//		System.out.println(c.replace('e', 'r'));
		
		System.out.println(c.replace("selenium", "playwright"));
		
		System.out.println(c.substring(0, 4));
		
		String d = "abc@gmail.com";
		
		String e[] = d.split("@");
		
		System.out.println(Arrays.toString(e));
		
		
		
		
	}

}
