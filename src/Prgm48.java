//Searching for a string - Linear search

import java.io.*;
public class Prgm48 {
	public static void main(String args[])throws IOException{
		
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask how many string
		System.out.println("How many strings? ");
		int n=Integer.parseInt(br.readLine());
		
		//create a string type array with size n
		String str[]= new String[n];
		
		//store this string into str []
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter a string: ");
			str[i]=br.readLine();
		}
		
		//Accept the string to search
		System.out.println("Enter string to search: ");
		String search = br.readLine();
		
		//take a boolean var.
		boolean found = false;
		
		//search for the string in str[]
		for(int i=0; i<n; i++){
			if(search.equalsIgnoreCase(str[i])){
				System.out.println("Found at position: "+ (i+1));
				found = true;	//String found
			}	
		}
		//if not found, display message
		if(!found)
			System.out.println("Not found in the group");
	}
}
