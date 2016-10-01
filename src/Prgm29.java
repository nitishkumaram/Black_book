//Let us write a program to read different types of data separated by space, from the keyboard using the Scanner class.(page 78)
import java.util.Scanner;
public class Prgm29 {
	public static void main(String args[])
	{
		System.out.println("Enter id name sal : ");
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		String name= sc.next();
		float sal=sc.nextFloat();
		
		System.out.println("ID= "+id);
		System.out.println("Name= "+name);
		System.out.println("Sal= "+sal);
	}
}

//READING INPUT WITH java.util.Scanner CLASS
//
//We can use Scanner class of java.util package to read input from the keyboard or a text file.abstract
//
//When the Scanner class receive input, it breaks the input into several pieces, called tokens.

//These tokens can be retrieved from the Scanner object using following method:

//next() to read a string       nextByte() to read a byte value  etc