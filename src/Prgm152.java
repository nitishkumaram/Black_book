// WAP that shows the use of LinkedList class. 

import java.io.*;
import java.util.*;
class Prgm152 {

	public static void main(String args[])throws IOException{
		
//		create an empty linked list to store strings
		LinkedList<String> ll= new LinkedList<String>();
		
//		Add some name to linked list 
		ll.add("America");
		ll.add("India");
		ll.add("Japan");
		
//		Display the elements in the linked list
		System.out.println("List= "+ll);
		
//		vars
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String element;
		int position,choice=0;
		
//		Menu
		
		while(choice<4){
			System.out.println("\n LINKEDLIST OPERATION");
			System.out.println("1 Add an element");
			System.out.println("2 Remove an element");
			System.out.println("3 Change an element");
			System.out.println("4 Exit");
			
			System.out.println("Your choice= ");
			choice=Integer.parseInt(br.readLine());
			
//			perform a task depending on user choice
			switch(choice){
			
			case 1:	System.out.println("Enter element");
			 		element=br.readLine();
			 		
			 		System.out.println("At what position? ");
			 		position=Integer.parseInt(br.readLine());
			 		ll.add(position-1,element);
			 		break;
			 		
			case 2:	System.out.println("At what position");
			 		position=Integer.parseInt(br.readLine());
			 		
			 		ll.remove(position-1);
			 		break;
			 		
			case 3:	System.out.println("Enter position= ");
			 		position=Integer.parseInt(br.readLine());
			 		System.out.println("Enter new element");
			 		element=br.readLine();
			 		ll.set(position-1, element);
			 		break;
			 		
			case 4: System.exit(0);
			
			default: return;	
			}
			
//			Use Iterator to retrieve the elements
			System.out.println("List= ");
			Iterator it= ll.iterator();
			while(it.hasNext())
				System.out.println(it.next());
		}
	}
}
