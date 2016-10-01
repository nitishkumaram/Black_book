//	WAP for a method with two parameters and return type.

class Demo11{
	
	//method to calculate sum of num1, num2
	//and also return the double type result
	
	double sum(double num1, double num2){
		
		double res = num1+num2;
		return res;
	}
}
public class Prgm61 {
	
	public static void main(String args[]){
		
		//create an object of demo class
		Demo11 d= new Demo11();
		
		//call the method and pass two values to
		//the method. Store the return result in x.
		double x=(d.sum(10, 22.5));
		System.out.println("Sum= "+x);
	}
}
