// Write a program where an object is passed to printName() method and the class name of the object is displayed by the method.

class Myclass_105{
	int x;
	
	Myclass_105(int x){
		this.x=x;
	}
}

//This class contains method to receive an object and display the classname

class KnowName{
	static void printName(Object obj){
		
		//get the class name into an object c of the class Class
		Class c= obj.getClass();
		
		//get the name of the class using getName()
		String name= c.getName();
		System.out.println("The classname= "+name);
	}
}
class Prgm105 {

	public static void main(String args[])
	{
		//create Myclass object obj
		Myclass_105 obj= new Myclass_105(10);
		
		//Know the class name of the object obj by calling printName()
		KnowName.printName(obj);
	}
}
