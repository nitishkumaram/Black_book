// Write a program to show serialization of objects

import java.io.*;
import java.util.*;
public class Prgm172 {

	public static void main(String args[])throws IOException{
		
//		to accept data from keyboard
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		to store obj into object file
		FileOutputStream fos = new FileOutputStream("objFile");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
//		ask how many objects to be stored
		System.out.println("How many objects to store?");
		int n = Integer.parseInt(br.readLine());
		
//		store n object into objFile
		for(int i=0; i<=n; i++){
			
//			create Employee(Prgm171) object with data from keyboard
			Prgm171 e1= Prgm171.getData();
			
//			store Employee object into ObjectOutputStream
			oos.writeObject(e1);
		}
		
//		close the objFile
		oos.close();
	}
}
