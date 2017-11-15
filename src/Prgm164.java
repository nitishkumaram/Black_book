//WAP to improve the efficiency of writing data into a file using BufferedOutputStream. 

//Here we are re-writing Prgm 163 using BufferedOutputStream where the file is opened for appending data


import java.io.*;
class Prgm164 {
	
	public static void main(String args[])throws IOException{
		
		//attach keyboard to DataInputStream- in the below statement we are attaching the keyboard to
		//DataInputStream object, Now, the DataInputStream Object can read data coming from the keyboard.
		
		DataInputStream dis = new DataInputStream(System.in);
		
		//attach myfile to FileOutputStream in append mode- attach a file where the data is to be stored
		// true -> even though the program is run several time - all previous data will be preserved
		
		FileOutputStream fout = new FileOutputStream("myfile.txt", true);
		
		//attach FileOutputStream to BufferdOutputStream
		
		BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
		
		System.out.println("Enter text (@ at the end): ");
		char ch;
		
		//read characters from dis into ch. Then write them into bout.
		//repeat this as long as the read character is not @
		while((ch=(char)dis.read()) != '@')
			bout.write(ch);
			
		//close the file
		bout.close();
		
	}
}