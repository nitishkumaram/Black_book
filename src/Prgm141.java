// WAP which shows the use of throws clause.

import java.io.*;
class Sample_Prgm141 {

	//instance variable
	private String name;
	
	//method to accept name
	void accept() throws IOException{
		
		//to accept data from keyboard
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name= ");
		name = br.readLine();
	}
	
	//method to display name
	void display(){
		System.out.println("Name: "+name);
	}
}
class Prgm141{
	public static void main(String args[])throws IOException{
		Sample_Prgm141 s= new Sample_Prgm141();
		s.accept();
		s.display();
	}
}