// Let us make a program to override the super class show1() method in sub class. Now only the sub class method is executed.

class One_101{
	void show1(){
		System.out.println("Super class method");
	}
}
class Two_101 extends One_101{
	void show1(){			//override the super class method
		System.out.println("Sub class method");
	}
}
class Prgm101 {

	public static void main(String args[])
	{
		One_101 o;
		o = (One_101) new Two_101();			//o is referring to sub class object WIDENING
		o.show1();
	}
}
