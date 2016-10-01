// let us make a program to access an instance variable 'x' and a local variable 'a' from the method access()

class Demo17{
	
	//x is instance variable
	private int x;
	
	//a is a local variable as it is defined within a method, will be called as local variable if stored in constructor as well
	void modify(int a){
		x=a;
	}
	//we can access x, but not a.
	void access(){
		System.out.println("x= "+x);
		//uncomment		System.out.println("a= "+a);		//we can't access a as it is local variable which is declared in some other method
	}
}

public class Prgm70 {

	public static void main(String args[]){
		
		Demo17 d= new Demo17();
		d.modify(10);
		d.access();
	}
}