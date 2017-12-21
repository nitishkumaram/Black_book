// WAP to create a client that receive the message from the server above.

import java.io.*;
import java.net.*;
public class Prgm200 {

	public static void main(String args[])throws IOException{
		
//		create client socket with port number 999
		Socket s= new Socket("localhost", 999);
		
//		to accept data from server
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
//		receive data as long as server does not close client socket
		String str;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
//		close connection
		br.close();
		s.close();
	}
}
