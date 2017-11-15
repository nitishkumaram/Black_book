// WAP that shows the use of Hashtable class.

import java.io.*;
import java.util.*;
class Prgm156 {

	public static void main(String args[])throws IOException{
//		create hashtable with names and scores
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		ht.put("Ajay", 50);
		ht.put("Sachin", 77);
		ht.put("Gavaskar", 44);
		ht.put("Kapil", 60);
		ht.put("Dhoni", 88);
		
//		Display all player names using enumerator
		System.out.println("The player names: ");
		Enumeration e= ht.keys();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
			
//		Accept player name from keyboard
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter player name: ");
			String name= br.readLine();
			name=name.trim();	//remove unnecessary spaces
			
//			get score to the player
			Integer score=ht.get(name);
			if(score !=null){
//				coverts score from Integer object to int value
				int sc=score.intValue();
				System.out.println(name+"Scorecard: "+sc);
			}
			else	System.out.println("Player not found");
		
	}
}
