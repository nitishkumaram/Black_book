// WAP which shows how to read data from the keyboard and write to the 'myfile.txt' file.

import java.io.*;
public class Prgm163 {

	public static void main(String args[])throws IOException
	{
		
		//attach keyboard to DataInputStream
		DataInputStream dis = new DataInputStream(System.in);
		
		//attach myFile to FileOutputStream
		FileOutputStream fout = new FileOutputStream("myfile.txt");
		
		System.out.println("Enter text(@ at the end)= ");
		char ch;
		
		//read characters from dis into ch. Then write it into fout.
		//repeat this as long as the read Character is not @
		while((ch =(char) dis.read()) != '@')
			fout.write(ch);
		
		//close the file
		fout.close();
	}
}
