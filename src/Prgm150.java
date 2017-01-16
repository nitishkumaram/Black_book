//WAP which shows the use of Hashset and Iterator.

import java.util.*;
class Prgm150 {

	public static void main(String args[]){
		
//		create a HashSet to store strings
		HashSet<String> hs= new HashSet<String>();
		
//		Store some strings elements
		hs.add("India");
		hs.add("America");
		hs.add("Japan");
		hs.add("China");
		hs.add("China");
		hs.add("America");
		
//		view the HashSet
		System.out.println("Hashset= "+hs);
		
//		add an Iterator to hs
		Iterator it=  hs.iterator();
		
//		display element by element using Iterator
		System.out.println("Element using Iterator= ");
		while(it.hasNext()){
			String s= (String)it.next();
			System.out.println(s);
		}
	}
}
