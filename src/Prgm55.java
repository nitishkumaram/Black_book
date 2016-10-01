//Rewrite the previous program by using a default constructor to initialize the instance variable of person class

//CONSTRUCTOR CONCEPT
//1. The sole purpose of a constructor is to initialize the instance variable.
//2. The constructor's name and class name should be same.
//3. A constructor does not return any value, not even 'void'.
//4. A constructor is called concurrently when the object creation is going on. JVM first allocates memory for the object and then
//		executes the constructor to initialize the instance variable. By the time, object creation is completed, the construction
//		execution is also completed.
//5. A constructor is called and executed only once per object.

class Demo5{
	
	//instance variable
	private String name;
	private int age;
	
	//default constructor
	Demo5(){
		
		name = "Raju";
		age = 22;
	}
	
	//method talk
	void talk(){
		
		System.out.println("Hello I am "+name);
		System.out.println("My age is "+age);
	}
}

class Prgm55 {
	public static void main(String[] args){
		
		//create Demo5 class object: Raju
		Demo5 Raju= new Demo5();
		
		//call the talk method
		Raju.talk();
		
		//create another class object: Sita
		Demo5 Sita= new Demo5();
		
		//call the talk method
		Sita.talk();							//this program still print the same result as the previous one
	}
}
