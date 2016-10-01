//WAP to initialize the instance variables directly within the Prgm54 class

class Demo4 {
	
	//instance variable are initialized here
	private String name = "Raju";
	private int age = 30;
	
	//methods
	void talk(){
		System.out.println("Hello I am "+name);
		System.out.println("My age is "+age);
	}
}

class Prgm54{
	public static void main(String args[]){
		
		//create Prgm54 class object Raju
		Demo4 Raju = new Demo4();
		
		//call the talk method
		Raju.talk();
		
		//create another class object Sita
		Demo4 Sita = new Demo4();
		
		//call the talk method
		Sita.talk();
	}
}