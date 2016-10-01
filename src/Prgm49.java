//WAP to learn how to use some of the StringBuffer class methods.

import java.io.*;
public class Prgm49 {
	public static void main(String args[])throws IOException{
		
		//create empty string buffer object
		StringBuffer sb= new StringBuffer();
		
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//accept surname
		System.out.println("Enter surname: ");
		String sur = br.readLine();
		
		//accept middlename
		System.out.println("Enter midname: ");
		String mid = br.readLine();
		
		//accept lastname
		System.out.println("Enter lastname: ");
		String last = br.readLine();
		
		//append sur to sb
		sb.append(sur);
		
		//append last to sb
		sb.append(last);
		
		//display the name till now
		System.out.println("Name= "+ sb);
		
		//insert mid after sur name in sb
		int n= sur.length();				// n represents no. of chars in sur name
		
		sb.insert(n, mid);					// insert mid name after nth character 
		
		//display full name
		System.out.println("Full name: "+ sb);
		
		//reverse and display the name
		System.out.println("In reverse: "+ sb.reverse());
	}
}
