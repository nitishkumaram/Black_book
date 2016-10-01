// WAP to test whether a static method can access the static variable or not

class Demo14{
	
	//static var
	static int x= 55;
	
	//static method accessing x value
	static void access(){
		System.out.println("x= "+ x);
	}
}
public class Prgm64 {

	public static void main(String args[])
	{
		Demo14.access();
	}
}