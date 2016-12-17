// let us make a program where the abstract class Myclass has one abstract method which has got various implementations in sub classes

abstract class Myclass_108{
	
	//this is abstract method
	abstract void calculate(double x);
}
class Sub108 extends Myclass_108{
	//calculate square value
	void calculate(double x){
		System.out.println("Square= "+(x*x));
	}
}
class Sub108_2 extends Myclass_108{
	//calculate square root value
	void calculate(double x){
		System.out.println("Square root= "+ Math.sqrt(x));
	}
}
class Sub108_3 extends Myclass_108{
	//calculate cube value
	void calculate(double x){
		System.out.println("Cube= "+(x*x*x));
	}
}
class Prgm108 {
	
	public static void main(String args[]){
		
		//create sub class objects
		Sub108 obj1= new Sub108();
		Sub108_2 obj2= new Sub108_2();
		Sub108_3 obj3= new Sub108_3();
		
		//let the objects call and use calculate() method
		obj1.calculate(3);
		obj2.calculate(4);
		obj3.calculate(5);
	}

}