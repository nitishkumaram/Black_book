// Let us make a program by taking a static variable x in the Demo16

class Demo16{
	
	//class var
	static int x = 10;
	
	//display the variable
	static void display(){
		System.out.println(x);
	}
}
public class Prgm66 {

	public static void main(String args[]){
		
		//create two reference
		Demo16 obj1= new Demo16();
		
		++obj1.x;
		
		System.out.println("x in obj1= ");
		obj1.display();
		
		Demo16 obj2= new Demo16();
		System.out.println("x in obj2= ");
		obj2.display();
	}
}