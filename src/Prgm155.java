//WAP that shows the use of Hashmap class

import java.io.*;
import java.util.*;
class Prgm155 {
	public static void main(String args[])throws IOException{
		
		//create Hashmap
		HashMap<String,Long> hm= new HashMap<String,Long>();
		
//		Vars
		String name,str;
		Long phno;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
//		Menu
		while(true)
		{
			
			System.out.println("1 Enter phone entries");
			System.out.println("2 Look in the book");
			System.out.println("3 Display in the book");
			System.out.println("4 EXIT");
			
			System.out.println("Your choice");
			int n=Integer.parseInt(br.readLine());
			
			switch(n){
			
			case 1: System.out.println("Enter name: ");
					name=br.readLine();
					System.out.println("Enter phno");
					str=br.readLine();
					phno=new Long(str);
//					store name and phone number into Hashmap
					hm.put(name, phno);
					break;
					
			case 2: System.out.println("Enter name: ");
			 		name=br.readLine();
			 		name=name.trim();	//remove unecessary spaces
//			 		pass name and get phno
			 		phno= hm.get(name);
			 		System.out.println("Phone: "+phno);
			 		break;
			 		
			case 3: //use Keyset() to display the names
				 	//create Hashset object to store names and refer it by set reference
					Set<String> set= new HashSet<String>();
					set = hm.keySet();
					System.out.println(set);
					break;
					
			case 4: return;
			}
		}
	}
}
