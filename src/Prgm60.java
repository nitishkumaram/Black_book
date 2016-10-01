// WAP for a method without parameters but with return type.

class Demo10{
	
	//instance variable
	private double num1,num2;
	
	//parameterized constructor
	Demo10(double x, double y){
		
		num1=x;
		num2=y;
	}


//method to calculate sum of num1, num2
//this method does not accept any values

		double sum(){
			
			double res= num1+num2;
			return res;
	}
		
}

class Prgm60 {

	public static void main(String args[]){
		
		Demo10 s= new Demo10(10, 22.5);
		
		double x= s.sum();
		System.out.println("Sum= "+x);
	}
}