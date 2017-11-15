// WAP which is used to read data from any text file

import java.io.*;
class Prgm166 {
	
	public static void main(String args[])throws IOException{
		
		//to accept filename from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File name= ");
		String fname = br.readLine();
		
		//attach the file to FileInputStream
		FileInputStream fis = null;
		
		//check if file exist or not
		try{
			fis= new FileInputStream(fname);
		}
		catch(FileNotFoundException fe){
			System.out.println("File not found");
			return;
		}
		
		//attach FileInputStream object to BufferedInputStream
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		System.out.println("File Contents:- ");
		
		//read character from BufferedInputStream and write them to monitor.
		//Repeat this till the end of file
		
		int ch;
		while((ch = bis.read()) != -1)
			System.out.print((char)ch);
		
		//close the file
		bis.close();
	}

}
