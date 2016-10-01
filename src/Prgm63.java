// WAP to test whether a static method can access the instance variable or not.
// No we can't access instance variable via static method.

class Demo13{
	
	//instance var
	int x;
	
	//parameterized constructor
	Demo13(int x){
		this.x = x;
	}
	
	//static method accessing x value
	static void access(){
		
		//static method accessing x value
		
		//uncomment			System.out.println("Value of x= "+x);
	}
}
class Prgm63 {

	public static void main(String args[]){
		Demo13 d=new Demo13(55);
		Demo13.access();
	}
}
