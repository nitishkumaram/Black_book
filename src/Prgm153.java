// WAP to create an ArrayList with strings and perform various operation on it


import java.util.*;
class Prgm153 {

	public static void main(String args[]){
//		create ArrayList
		ArrayList<String> arl=new ArrayList<String>();
		
//		Add four object
		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		
//		display contents
		System.out.println("Contents: "+arl);
		
//		remove two objects
		arl.remove(3);
		arl.remove("Apple");
		
//		Display again
		System.out.println("Contents after removing"+arl);
		
//		display its size
		System.out.println("Size of ArrayList: "+arl.size());
		
//		extract element using Iterator
		System.out.println("Extracting using Iterator: ");
		
//		add an iterator to ArrayList to retrieve elements
		Iterator it=arl.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
