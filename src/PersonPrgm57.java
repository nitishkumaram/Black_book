// To accept a person's name and age using constructor and display if he is young, middle aged or old

import java.io.*;
class  Demo8{

	//instance variable
	private String name;
	private int age;
	
	//parameterized constructor
	Demo8(String p,int a){
		
		name = p;
		age = a;
		
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

class PersonPrgm57{
	public static void main(String args[])throws IOException{
		
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	//accept person name and age from command line arguments
	//name and age are stored in args[0] and args[1] as Strings
	String p= args[0];
	int a= Integer.parseInt(args[1]);
	
	//create a person class object and pass name and age to the constructor
	Demo8 per= new Demo8(p,a);
	
	//check the age
	per.check();
	}
}
