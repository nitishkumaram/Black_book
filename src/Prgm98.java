//Write a program to use super class reference to call the calculate() method.

class One98{
	
	//static method to calculate square value
	static void calculate(double x){
		System.out.println("Square value= "+(x*x));
	}
}
class Two98 extends One98 {

	//static method to calculate square root value
	static void calculate(double x){
		System.out.println("Square root value= "+Math.sqrt(x));
	}
}
class Prgm98{
	public static void main(String args[]){
		One98 o=new One98();
		
		o.calculate(25);
	}
}