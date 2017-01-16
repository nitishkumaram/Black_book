//WAP to accept an integer number from keyboard and convert it into other number system.

import java.io.*;
class Prgm147 {

	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		String str= br.readLine();
		
		//convert string into int
		int i= Integer.parseInt(str);
		System.out.println("In decimal= "+i);
		
		//conver int into other system
		str= Integer.toBinaryString(i);
		System.out.println("In binary= "+str);
		
		str= Integer.toHexString(i);
		System.out.println("In hexadecimal= "+str);
		
		str= Integer.toOctalString(i);
		System.out.println("In Hexadecimal= "+str);
	}
}

