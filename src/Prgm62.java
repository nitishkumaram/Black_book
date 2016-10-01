// WAP for a static method that accepts data and returns the result.

class Demo12{
	
	//static method should be declared as static
	
	static double sum(double num1, double num2){
		
		double res= num1+num2;
		return res;
	}
}
class Prgm62 {

	public static void main(String args[]){
		
		//call the static method using Classname.methodname()
		double x= Demo12.sum(10, 22.5);
		System.out.println("Sum= "+ x);
	}
}
