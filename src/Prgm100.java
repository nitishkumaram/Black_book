//Write a program to see the widenining effect where super class reference is used to refer to sub class object.


class One_100{
	void show1(){
		System.out.println("Super class method");
	}
}
class Two_100{
	void show2(){
		System.out.println("Sub class method");
	}
}
class Prgm100 {

	public static void main(String args[]){
		One_100 o;			//o is super class reference
//		o = (One_100)new Two_100();			//o is referring to sub class object WIDENING
//		o.show1();
		
	}
}

//ERROR
