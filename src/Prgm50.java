//WAP for testing a string whether it is a palindrome or not

import java.io.*;
public class Prgm50 {
public static void main(String args[])throws IOException{
	
	//accept the string from keyboard
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a string: ");
	String str = br.readLine();
	
	//store a copy of original string in temp
	String tmp = str;
	
	//convert the string into StringBuffer
	StringBuffer sb = new StringBuffer(str);
	
	//now reverse the string in StringBuffer
	sb.reverse();
	
	//convert the StringBuffer into a string
	str = sb.toString();
	
	//compare the original string available in temp with this reversed string
	if(tmp.equalsIgnoreCase(str))
		System.out.println(tmp+ " is Palindrome");
	else System.out.println(tmp+" is not Palindrome");
}
}