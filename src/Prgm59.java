// WAP to for a method without parameter and without return type.

class Demo9 {

	//instance variable
	private double num1,num2;
	
	//parameterized constructor
	Demo9(double x, double y){
		num1 = x;
		num2 = y;
	}
	
	//method to calculate sum of num1 and num2
	//this method does not accept any values and
	//does not return result
	
	void sum(){
		double res= num1+num2;
		System.out.println("Sum= " + res);
	}
}

class Prgm59{
	public static void main(String args[]){
		
		//create the object and pass values 10 and 22.5 to constructor
		//they will be stored into num1, num2
		Demo9 s= new Demo9(10,22.5);
		
		//call the method and find sum of num1 and num2
		s.sum();
	}
}
