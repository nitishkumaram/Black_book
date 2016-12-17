//WAP to where calculate() method of super class is overridden by the calculate() method is dynamically decided.

class One97{
	
	//method to calculate square value
	void cal(double x){
		System.out.println("Value of square value= "+(x*x));
	}
}

class Two97 extends One97{
	
	//method to calculate square root value
	void cal(double x){
		System.out.println("Value of math square root= "+Math.sqrt(x));
	}
}

class Prgm97{

	public static void main(String args[]){
		
		//create sub class object t
		Two97 t=new Two97();
		
		//call calculate() method using t
		t.cal(25);
	}
}