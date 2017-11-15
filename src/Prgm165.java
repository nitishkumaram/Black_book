// WAP to read data from myfile.txt ussing FileInputStream and display it.

import java.io.*;
class Prgm165 {

	public static void main(String args[])throws IOException{
		
		// attach the file to FileInputStream
		FileInputStream fin = new FileInputStream("myfile.txt");
		
		//read charcters from the FileInputStream and write them to monitor.
		//Repeat this till the end of file
		int ch;
		
		while((ch= fin.read()) != -1)
			System.out.print((char)ch);
		
		//close the file
		fin.close();
	}
	
}
