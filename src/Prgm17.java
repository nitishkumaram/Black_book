//WAP to return a value from a method (page 63)
public class Prgm17 {
	public static void main(String args[]){		//step 1- create main method
		int res = Prgm17.myMethod(10);			//step 4- Class_name.method(value) and store the value
		System.out.println("Result= "+res);		//step 5- Print the result
	}
	static int myMethod(int num){				//step2- Create method with return type
		return num*num;							//step3- Write what you want from method
	}
}
