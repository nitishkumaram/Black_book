// WAP to create Person class and an object Raju to Person class. Let us display the hash code number of the object, using hashcode()

class Demo{
	//Properties - variables
	String name;
	int age;
	
	//action- methods
	void talk(){
		System.out.println("Hello I am "+ name);
		System.out.println("My age is "+ age);
	}
}

class Prgm51 {
	public static void main(String args[]){
		
		//create Person class object: Raju
		Demo Raju= new Demo();
		
		//find the hash code of object
		System.out.println("Hash code= "+Raju.hashCode());
	}
	
}
