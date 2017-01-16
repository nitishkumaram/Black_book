// WAP to perform different operations on a stack through a menu

//Pushing, popping, searching, elements in a stack


import java.io.*;
import java.util.*;
class Prgm151 {

	public static void main(String args[])throws IOException{

//		create an empty stack to contain Integer objects
		Stack<Integer> st= new Stack<Integer>();
		
//		take vars
		int choice = 0;
		int position,element;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		
//		display the menu as long as user choice <4
		while(choice<4){
			
			System.out.println("Stack Operations");
			System.out.println("1 Push an element");
			System.out.println("2 Pop an element");
			System.out.println("3 Search an element");
			System.out.println("4 Exit");
			System.out.println("Your choice: ");
			choice=Integer.parseInt(br.readLine());
		
//		perform a task depending on user choice
		
		switch(choice){
		
		case 1: System.out.println("Enter element: ");
				element=Integer.parseInt(br.readLine());
//				INT TYPE ELEMENT IS CONVERTED INTO INTEGER OBJECT AND THEN PUSHED INTO THE STACK
				st.push(element);
				break;
				
		case 2: //the top-most Integer object is popped
				Integer obj= st.pop();
				System.out.println("Popped= "+obj);
				break;
				
		case 3:	System.out.println("Which element: ");
		 		element=Integer.parseInt(br.readLine());
//		 		INT TYPE ELEMENT IS CONVERTED INTO INTEGER OBJECT AND THEN SEARCHED IN THE STACK
		 		position = st.search(element);
		 		
		 		if(position== -1)
		 			System.out.println("Element not found");
		 		else
		 			System.out.println("Position= "+position);
		 		break;
		 		
		 		default:	//come out if user choice is other than 1,2 or 3
		 			return;
		}
//		view the content of the stack
		System.out.println("Stack content: "+st);
	}
	}
}
