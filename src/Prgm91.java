// WAP to access the super class method and instance variable 
// by using super key word from sub class.

//super - to access the super class method and variable

class One91{
	
	//super class var
	int i=10;
	
	//super class method
	void show(){
		 System.out.println("Super class method:i= "+ i);
	}
}
class Two91 extends One91{
	
	//sub class var
	int i=20;
	
	//sub class method
	void show(){
		System.out.println("Sub class method:i= "+ i);
		
		//Using super to call super class method
		super.show();
		
		//Using super to access super class var
		System.out.println("Super i= "+super.i);
	}
}
class Prgm91 {

	public static void main(String args[]){
		
		//create sub class object
		Two91 t=new Two91();
		
		//This will call sub class method only
		t.show();
	}
}
