// Let us make a program by taking an instance variable x in the Demo15 class

class Demo15{
	
	//instance var
	int x=10;
	
	//display the variable
	void display(){
		System.out.println(x);
	}
}
public class Prgm65 {

	public static void main(String args[]){
		
		//create two reference
		Demo15 obj1=new Demo15();
		Demo15 obj2=new Demo15();
		
		//increment x in obj1
		++obj1.x;
		System.out.println("x in obj1= ");
		obj1.display();
		
		//display x in obj2
		System.out.println("x in obj2= ");
		obj2.display();
	}
}
