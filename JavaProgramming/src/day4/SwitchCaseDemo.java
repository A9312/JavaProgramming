package day4;

public class SwitchCaseDemo {
	
	public static void main(String [] args)
	{
		int weekno=6;
		
		switch(weekno)
		{
		case 1: System.out.println("monday");
		break;
		case 2: System.out.println("tuesday");
		break;
		case 3: System.out.println("wednesday");
		break;
		case 4: System.out.println("thursday");
		break;
		case 5: System.out.println("friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("sunday");
		break;
		default : System.out.println("Invalid week no");
		}
	}

}
