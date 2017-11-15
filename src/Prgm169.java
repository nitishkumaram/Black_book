//WAP to compress the data contained in a file using DeflaterOutputStream

import java.io.*;
import java.util.zip.DeflaterOutputStream;
class Prgm169 {

	public static void main(String args[])throws IOException{
		
//		Attach the original file: file1 to FileInputStream for reading data
		
		FileInputStream fis = new FileInputStream("file1.txt");
		
//		Attach compressed file: file2 to FileOutputStream
		
		FileOutputStream fos = new FileOutputStream("file2");
		
//		Attach FileOutputStream to DflaterOutputStream
		
		DeflaterOutputStream dos = new DeflaterOutputStream(fos);
		
//		read data from FileInputStream and write it into DeflaterOutputStream
//		and write it into DeflaterOutputStream
		
		int data;
		
		while((data = fis.read()) != -1)
			dos.write(data);
		
//		close the file
		fis.close();
		dos.close();
	}
}
