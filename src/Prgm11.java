/* WAP to see the use of for-each loop and retrieve the element one by one from an array and
 display it (page-56) */

public class Prgm11 
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
}