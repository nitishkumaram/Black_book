//WAP to understand that the parameterized constructor of the super class can be called from sub class using super()

class One93{
	
	//super class var
	int i;
	
	//super class parameterized constructor
	One93(int i){
		this.i=i;
	}
}

class Two93 extends One93{
	
	//sub class var
	int i;
	
	//sub class para constructor
	Two93(int a, int b){
		
		super(a); //call super class constructor and pass a.
		i=b;	  //initialize sub class var
	}
	
	void show(){
		System.out.println("Sub class i= "+i);
		System.out.println("Super class i= "+super.i);
	}
}
public class Prgm93 {

	public static void main(String args[]){
		
		//create sub class object
		Two93 t=new Two93(11,22);
		
		//call sub class method
		t.show();
	}
}
