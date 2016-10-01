// let us re write the previous program 1, where we want to call the talk() method.

class Demo1{
	
	//properties - variable
	String name;
	int age;
	
	//action - method
	void talk(){
		System.out.println("Hello I am "+name);
		System.out.println("My age is "+age);
	}
}
class Prgm52 {
	public static void main(String args[]){
		
		//Create Demo1 class object: Raju
		Demo1 Raju = new Demo1();
		
		//call the talk method
		Raju.talk();
	}
}
