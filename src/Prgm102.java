//Write a program for creating sub class reference which is used to refer to the super class object.

class One_102{
	void show1(){
		System.out.println("Super class method");
	}
}
class Two_102 extends One_102{
	void show2(){
		System.out.println("Sub class method");
	}
}
class Prgm102 {
	public static void main(String args[]){
		Two_102 t;			//t is sub class reference
		t= (Two_102)new One_102();			//t is referring to super class object NARROWING
		t.show1();
	}
}