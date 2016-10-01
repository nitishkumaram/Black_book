//WAP to use this to refer the current class parameterized constructor as 'this()', its method as 'this.method()' and its instance
// variable as 'this.variable'

class Demo18{
	
	//x is instance variable
	private int x;
	
	//default constructor
	Demo18(){
		this(55);
		this.access();
}

	Demo18(int x){
		this.x= x;
	}
	
	void access(){
		System.out.println("x= "+x);
	}
}
class Prgm71 {
	public static void main(String args[]){
		Demo18 obj= new Demo18();
	}

}
