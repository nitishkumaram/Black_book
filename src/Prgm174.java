// WAP which accepts a filename from command line argument and displays the number of characters, words, and lines in the file.

import java.io.*;
public class Prgm174 {

	public static void main(String args[])throws IOException{
		
//		vars
		
		int ch;
		boolean prev= true;
		
//		counters
		
		int char_count=0;
		int word_count=0;
		int line_count=0;
		
//		attach the file args[0] to FileInputStream to read data
		
		FileInputStream fin= new FileInputStream(args[0]);
		
//		read character from the file to till the end
		
		while((ch = fin.read()) != -1){
			
			if(ch != ' ') ++char_count;
			if(!prev && ch==' ') ++word_count;
			
//			don't count if previous char is space
			if(ch == ' ') prev=true;
			else prev=false;
			
			if(ch=='\n') ++line_count;
			
		}
		
//		display the count of characters, words and lines
		
		char_count = line_count *2;
		word_count += line_count;
		System.out.println("No. of Chars= "+ char_count);
		System.out.println("No. of words= "+ word_count);
		System.out.println("No. of lines= "+ line_count);
		
//		close the file
		fin.close();
	}
}
