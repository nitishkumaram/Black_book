// WAP to store a group of objects into an array and retrieve the object data and display.

import java.io.*;
class Employee149{
	
	//instance vars
	int id;
	String name;
	
	//to store data
	Employee149(int i, String n){
		id = i;
		 name = n;
	}
	
	//a method to display data
	void displaydata(){
		System.out.println(id+"\t"+name);
	}
}
class Prgm149 {

	public static void main(String args[])throws IOException{
		
		//to accept data from keyboard
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		//create Employee type array with size 5
		Employee149 arr[]= new Employee149[5];
		
		//store 5 employees data into the array
		for(int i=0;i<5;i++){
			System.out.println("Enter id: ");
			int id=Integer.parseInt(br.readLine());
			
			System.out.println("Enter name: ");
			String n= br.readLine();
			
			arr[i]= new Employee149(id, n);
		}
		
		System.out.println("\n The employee data is: ");
		
		//display the Employee data from the array
		for(int i=0; i<arr.length;i++){
			arr[i].displaydata();
		}
	}
}
