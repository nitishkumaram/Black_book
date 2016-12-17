//WAP to create Sample class which contains two methods with the same name but with different signature.

class Sample96{
	
	//method to add two values
	void add(int a, int b){
		System.out.println("Sum of two: "+(a+b));
	}
	
	//method to add three values
	void add(int a, int b, int c){
		System.out.println("Sum of three: "+(a+b+c));
	}
}
public class Prgm96 {

	public static void main(String args[]){
		
		//Create sample class object
		Sample96 s=new Sample96();
		
		//call add() and pass two values
		s.add(10,15);
		
		//call add() and pass three values
		s.add(10,15,20);
	}
}
