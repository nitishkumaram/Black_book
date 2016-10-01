// Let us try to make a program to interchange two employee objects by passing them to swap() method.
class Demo21{
	
	//instance variable
	int id;
	
	//to initialize id value
	Demo21(int id){
		this.id = id;
	}
}

class CheckDemo{
	
	//to interchange Employee class objects
	void swap(Demo21 obj1, Demo21 obj2){
		Demo21 temp;		//take a temporary reference
		temp = obj1;
		obj1 = obj2;
		obj2 = temp;
	}
}
class Prgm74 {

	public static void main(String args[]){
		
		//take two Demo21 class objects
		Demo21 obj1= new Demo21(10);
		Demo21 obj2= new Demo21(20);
		
		//create Check class object
		CheckDemo obj=new CheckDemo();
		
		//display data before calling
		System.out.println(obj1.id+"\t"+obj2.id);
		
		//call swap and pass Employee class objects
		obj.swap(obj1, obj2);
		
		//display data after calling
		System.out.println(obj1.id+"\t"+obj2.id);
	}
}
