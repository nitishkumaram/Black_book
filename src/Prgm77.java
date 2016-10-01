//WAP to generate required number of primes using methods.

import java.io.*;
class Primes{
	//to test and return true if num is prime
	static boolean prime(long num){
		
		//initially isPrime is true, it becomes false if num is not prime
		boolean isPrime = true;
		
		//from 2 to num-1, if any number divides num, it is not prime
		for(int i=2; i<=num-1; i++)
			if(num % i ==0)
				isPrime = false;
		return isPrime;
	}
	
	//accept how many primes required into max.
	//c is counter for no. of primes generated.
	
	static void generate(long max){
		{
			long c=1, num=2;
			while(c<= max){
				if(prime(num))		//call prime() method directly
					++c;
			}
			++num;
		}
	}
}
class Prgm77 {

	public static void main(String args[])throws IOException
	{
		//accept the number of primes are needed
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many primes?");
		int max=Integer.parseInt(br.readLine());
		
		//generate max number of primes
		Primes.generate(max);
	}
}
