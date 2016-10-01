//Accepting and displaying employee details

import java.io.*;
public class Prgm23 {
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee ID: ");
		int eID=Integer.parseInt(br.readLine());
		System.out.println("Enter employee Sex(M/F): ");
		char eSex = (char)br.readLine().charAt(0);			//**to accept a char, just write " (char)br.read().charAt(0); pg-71 & 72"
		System.out.println("Enter employee Name: ");
		String eName= br.readLine();
		
		System.out.println("Employee ID: "+eID);
		System.out.println("Employee Sex: "+eSex);
		System.out.println("Employee name: "+eName);
	}
}