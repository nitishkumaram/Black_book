//Write a program for creating super class reference to refer to sub class object.

class One_103{
	void show1(){
		System.out.println("Super class method");
	}
}
class Two_103 extends One_103{
	void show2(){
		System.out.println("Sub class method");
	}
}
class Prgm103 {

	public static void main(String args[])
	{
		One_103 o;
		o = new Two_103();			//super class reference to refer to sub class object
		Two_103 t= (Two_103)o;			//this is narrowing - convert class One's reference type as Class Two's type
		t.show1();
		t.show2();
	}
}