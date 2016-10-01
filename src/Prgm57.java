// WAP to understand the use of methods in a class

//To accept a person's name and age and display if he is young, middle aged or old

import java.io.*;
class Demo7 {

	//instance variable
	private String name;
	private int age;
	
	//to accept the name and age
	public void accept()throws IOException{
		
		//to accept data from keyboard
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		//accept name and age
		System.out.println("Enter name ");
		name = br.readLine();
		
		System.out.println("Enter age ");
		age = Integer.parseInt(br.readLine());
	}
	
	//to check the age and display he is young, middle aged or old
	
	public void check(){
		
		if(age<=30)
			System.out.println(name+" is young");
		else if(age<=50)
			System.out.println(name+" is middle aged");
		else	System.out.println(name+" is old");
	}
}

class Prgm57{
	
	public static void main(String args[])throws IOException{
		
		//create Demo7 class object
		Demo7 p= new Demo7();
		
		//accept person data
		p.accept();
		
		//check the age
		p.check();
	}
}
