//WAP to perform different arithmetic operations on a given number {Concept-StringTokenizer} (pg- 74)

import java.io.*;
import java.util.*;
public class Prgm26 {
	public static void main(String args[])throws IOException{
		
		//Accept input from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Take two input from user in same line separated by comma
		System.out.println("Enter two number separated by comma: ");
		
		//Store the value in string
		String str=br.readLine();
		
		//Apply StringTokenizer concept
		StringTokenizer st=new StringTokenizer(str,",");
		
		//Store strings into separate token
		String s1= st.nextToken();
		String s2= st.nextToken();
		
		//Trim the token;
		s1 = s1.trim();
		s2 = s2.trim();
		
		//Convert s1 string into string, s2 into an int and s3 into a float
		String name = s1;
		int age = Integer.parseInt(s2);
		
		
		//display the entered data
		System.out.println("Name= "+ name);
		System.out.println("Age= "+ age);
		
	}
}
