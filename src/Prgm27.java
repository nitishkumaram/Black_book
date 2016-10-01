// To accept a year number from the keyboard and test if it is a leap or not

import java.io.*;
class Prgm27
{
	public static void main(String args[]) throws IOException
	{
		//accept year
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter year number: ");
		int year = Integer.parseInt(br.readLine());
		
		//if it is century year and divisible by 400
		if(year % 100 == 0 && year % 400==0)
			System.out.println("It is leap");
		
		//if it is not a century year and divisible  by 4
		else if(year % 100 !=0 && year % 4==0)
			System.out.println("It is leap");
		
		//other wise, it is not leap year
		else System.out.println("It is not leap");
	}
}