// WAP that shows the use of Vector class

import java.util.*;
class Prgm154 {

	public static void main(String args[]){
		
//		take a vector to store Integer objects
		Vector<Integer> v= new Vector<Integer>();
		
//		take an int type array
		int x[]={22, 20,10,40,15,60};

//		when x[i] is stored into v value. x[i] values are converted into Integer objects and stored into v. This is auto boxing.
		for(int i=0; i<x.length; i++){
			v.add(x[i]);
		}
		
//		retrieve the element using get()
		System.out.println("Vector elements= ");
		for(int i=0; i<v.size(); i++){
			System.out.println(v.get(i));
		}
		
//		retrieve using ListIterator
		System.out.println("Element using Listiterator: ");
		ListIterator lit=v.listIterator();
		
		System.out.println("In forward direction: ");
		while(lit.hasNext())
			System.out.println(lit.next()+"\t");
		
		System.out.println("\n In backward direction: ");
		while(lit.hasPrevious());
		System.out.println(lit.previous()+"\t");
	}
}
