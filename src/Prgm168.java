//WAP to show how to read data from the 'text' file using FileReader

import java.io.*;
class Prgm168 {
	
	public static void main(String args[])throws IOException{
		
//		check if file exist or not
		FileReader fr = null;
		
		try{
			fr = new FileReader("text");
		}
		catch(FileNotFoundException fe){
			System.out.println("File not found");
			return;
		}
		
//		read from FileReader till the end of file
		int ch;
		while((ch = fr.read()) != -1)
		System.out.print((char)ch);
		
//		close file
		fr.close();
	}

}
