// Generate Fibonacci numbers.

import java.io.*;
public class Prgm28 {
	public static void main(String args[])throws IOException
	{
		//Accept how many fibonaccis needed
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many fibonaccis?");
		int n = Integer.parseInt(br.readLine());
		
		//take first two fibonaccis as 0 and 1
		long f1=0, f2=1;
		
		System.out.println(f1);
		System.out.println(f2);
		
		//find next fibonaccis no.
		long f = f1+f2;
		System.out.println(f);
		
		//Already 3 fibonaccis are displayed, So count will start at 3
		int count = 3;
		while(count < n)
		{
			f1=f2;
			f2=f;
			f = f1+f2;
			System.out.println(f);
			count++;	
		}
	}
}