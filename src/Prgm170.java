//WAP to uncompress data from a compressed file by using InflaterInputStream.

import java.io.*;
import java.util.zip.InflaterInputStream;
class Prgm170 {
	
	public static void main(String args[])throws IOException{
		
//		Attach input file: file2 to FileInputStream for reading data
		
		FileInputStream fis = new FileInputStream("file2");
		
//		Attach output file: file3 to FileOutputStream for writing data into it
		
		FileOutputStream fos = new FileOutputStream("file3");
		
//		Attach InflaterInputStream to FileInputStream for uncompressing the data
		
		InflaterInputStream iis = new InflaterInputStream(fis);
		
//		Read data from InflaterInputStream and write it into FileOutputStream
		
		int data;
		
		while((data = iis.read()) != -1)
			fos.write(data);
		
//		close the files
		fos.close();
		iis.close();
		
	}

}
