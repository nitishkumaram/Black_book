// An array list handling a group of Employee class object

import java.io.*;
import java.util.*;
class Employee162{
	
//	take variable
	int id;
	String name;
	String address;
	
//	initialize them
	Employee162(int i, String n, String a){
		id= i;
		name= n;
		address= a;
	}
	
//	display employee details
	void display(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
class Prgm162 {

	public static void main(String args[])throws IOException{
		
//		vars
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int id;
		String name;
		String address;
		
//		create an ArrayList arl tostore Employees object
		ArrayList<Employee162> arl= new ArrayList<Employee162>();
		
		for(int i=0; i<5; i++){
			
//			Accept 5 employees details
			System.out.println("Enter ID: ");
			id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Name: ");
			name= br.readLine();
			
			System.out.println("Enter Address: ");
			address= br.readLine();
			
//			create employee object with accepted data
			Employee162 obj= new Employee162(id, name, address);
			
//			store Employee object into arl
			arl.add(obj);
		}

//		Now search for an employee id
		System.out.println("Enter ID to search=");
		id= Integer.parseInt(br.readLine());
		
//		found becomes true if employee id is found in arl
		boolean found=false;
		
//		search all element in arl
		for(int i=0; i<arl.size(); i++){

//			get()methods of ArrayList will return i-th Employee object
			Employee162 obj= arl.get(i);
			
//			check if given id is eqqual to id of Employee object
			if(id == obj.id){
				obj.display();
				found = true;
			}
		}
		if(!found){
			System.out.println("Employee not found");
		}
	}
}