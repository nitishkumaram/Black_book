// WAP to display number from 1 to 10 using infinite for loop.
public class Prgm9 
{
	public static void main(String args[])
	{
		int x=1;
		for( ; ;)
		{
			System.out.println(x);
			x++;
			if(x>10)
				break;
		}
	}
}