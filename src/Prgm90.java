// WAP to where the name of instance variables and methods in super and sub classes are same.
//Hence, by default only sub class members are accessible.

class One123{
	
	//super class var
	int i=10;
	
	//super class method
	void show(){
		System.out.println("Super class method:i= "+i);
	}
}
class Two321 extends One123{
	//sub class var
	int i=20;
	
	//sub class method
	void show(){
		System.out.println("sub class method:i= "+i);
	}
}
class Prgm90 {

	public static void main(String args[]){
		
		//create sub class object
		Two321 t= new Two321();
		
		//This will call sub class method only
		t.show();
	}
}
