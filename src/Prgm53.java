//WAP to initialize the Demo3 class instance variables in Prgm53 class

class Demo3{
	
	//instance variables are initialized here
	String name = "Venkat";
	int age = 30;
	
	//methods
	void talk(){
		System.out.println("Hello I am "+name);
		System.out.println("My age is "+age);
		
	}
}
class Prgm53 {
	public static void main(String args[]){
		
		Demo3 Raju = new Demo3();
		Raju.name = "Raju";
		Raju.age =22;
		Raju.talk();
	}
}
