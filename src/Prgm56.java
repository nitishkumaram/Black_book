// WAP to initialize variables using a parameterized constructor

class Demo6{
	
	//instance variable
	private String name;
	private int age;
	
	//default constructor
	Demo6(){
		
		name = "Raju";
		age = 22;
	}
	
	//parameterized constructor
	Demo6(String s, int i){
		
		name= s;
		age= i;
	}
	
	//method
	void talk(){
		
		System.out.println("Hello I am "+ name);
		System.out.println("My age is "+ age);
	}
}
class Prgm56 {
	public static void main(String args[]){
		
		//create Raju object. Here default constructor is called
		Demo6 Raju= new Demo6();
		Raju.talk();
		
		//create Sita object. Here parameterized constructor is called
		Demo6 Sita= new Demo6("Sita",20);
		Sita.talk();
	}
}
