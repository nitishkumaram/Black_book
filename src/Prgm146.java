//WAP which shows the use of Byte class Object

import java.io.*;
class Prgm146{
	
	public static void main(String args[])throws IOException{
		
		//to accept data from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));{
		
		// accept a byte number as String s1
			System.out.println("Enter a byte number= ");
			String s1= br.readLine();
			
		//create Byte object b1 using s1
			Byte b1= new Byte(s1);
			
			//accept another byte number as String s2
			System.out.println("Enter a byte number= ");
			String s2=br.readLine();
			
			//create Byte object b2 using s2
			Byte b2= new Byte(s2);
			
			//compare both the byte object contents
			int n= b1.compareTo(b2);
			
			if(n==0) System.out.println("Both bytes are same");
			else if(n<0) System.out.println(b1+" is less");
			else if(n>0) System.out.println(b2+" is less");
		}
	}
}