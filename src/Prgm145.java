//WAP that accept the character from the keyboard and display its type

import java.io.*;
class Prgm145 {
	public static void main(String args[])throws IOException{
		
		//to accept a char from keyboard
		char ch;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true){	//execute repeteadly
			System.out.println("Enter a character: ");
			ch= (char)br.read();
			
			//test and display the type of charater
			System.out.println("You Entered= ");
			if(Character.isDigit(ch))
				System.out.println("a digit");
			else if(Character.isUpperCase(ch))
				System.out.println("is upper case");
			else if(Character.isLowerCase(ch))
				System.out.println("is lower case");
			else if(Character.isSpaceChar(ch))
				System.out.println("a space character");
			
			else if(Character.isWhitespace(ch)){
				System.out.println("a white space character");
				return;
			}
			else System.out.println("Sorry I don't know that");
			br.skip(2);
		}
	}
}