//WAP to create a text file using FileWriter

import java.io.*;
class Prgm167 {

	public static void main(String args[])throws IOException{
		
//		take a string
		
		String st = "This is a book on java"+"\nI am a learner of java";
		
//		attach file to filewriter
		
		FileWriter fw = new FileWriter("text");
		
//		Buffer the filewriter
		BufferedWriter bw = new BufferedWriter(fw);
		
//		read charcter wise form string and write into FileWriter
		
		for(int i=0; i<st.length();i++){
			bw.write(st.charAt(i));
		}

//		close the file
		
		bw.close();
	}
}
