//WAP to find factorial value without using recursion.

public class Prgm78 {

	static long factorial(int num){
		
		long fact = 1;
		while(num>0)
			fact *= num--;
		return fact;
	}
	public static void main(String args[]){
		System.out.println("Factorial of 5 is: ");
		System.out.println(Prgm78.factorial(5));
	}
}
