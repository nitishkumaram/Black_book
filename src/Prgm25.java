//To accept different types of input in a line at a time from the keyboard, just like one can do using scanf() in C (Pg- 72)

import java.io.*;
import java.util.*;
public class Prgm25 {
	public static void main(String args[])throws IOException{
		
		//to accept data from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//ask for input- separated by commas
		System.out.println("Enter name, age, salary: ");
		
		//accept input into string
		String str=br.readLine();
		
		//use StringTokenizer to split input as commas
		StringTokenizer st=new StringTokenizer(str, ",");
		
		//We will have three tokens as Strings
		//first token represents name, second one age, third one salary
		String s1= st.nextToken();
		String s2= st.nextToken();
		String s3= st.nextToken();
		
		//trim any spaces before and after the token
		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();
		
		//convert s1 into String, s2 into int and s3 into a float
		String name=s1;
		int age= Integer.parseInt(s2);
		float salary= Float.parseFloat(s3);
		
		//Display the entered data
		System.out.println("Employee's name: "+name);
		System.out.println("Employee's age: "+age);
		System.out.println("Employee's salary: "+salary);
	}
}