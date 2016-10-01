/* WAP for using the switch statement to execute a particular task depending on color value 
 (page 57) */

public class Prgm12 
{
	public static void main(String args[])
	{
		char col = 'g';
		
		switch(col)
		{
		case 'r': System.out.println("Red");
				break;
		case 'b': System.out.println("Blue");
				break;
		case 'g': System.out.println("Green");
				break;
		case 'y': System.out.println("Yellow");
				break;
		default : System.out.println("No Color");
		}
	}
}