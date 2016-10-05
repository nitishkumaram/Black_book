// Write a program to call cube() method in class one. page167

class One1{
	
	//Obj2 is class Two's reference
	Two2 obj2;
	
	//initialize obj2
	One1(Two2 obj2){
		this.obj2 = obj2;
	}
	
	double cube(double x){
		
		//call class Two's method using obj2
		double result = x*obj2.square(x);
		
		//return result to Relate class
		return result;
	}
}

class Two2{
	
	//object 3 is class Three's reference
	Three obj3;
	
	//initialize obj3
	Two2(Three obj3){
		this.obj3 = obj3;
	}
	
	double square(double x){
		
		//call class Three's method using obj3
		double result = x*obj3.get(x);
		
		//return result to class One
		return result;
	}
}

class Three{
	
	double get(double x){

		//just return x value to class Two
		return x;
	}
	
}

class Prgm84 {
	
	public static void main(String args[]){
		
		//create class Three's object obj3
		Three obj3=new Three();
		
		//create class Two's object obj2 and pass obj3
		Two2 obj2=new Two2(obj3);
		
		//create class one's object and obj1 and pass obj2
		One1 obj1=new One1(obj2);
		
		//call cube() method of class One
		double result1 = obj1.cube(5);
		System.out.println("Cube of 5= "+result1);
		
		//call square() method of class Two
		double result2 = obj2.square(6);
		System.out.println("Cube of 6= "+result2);
		
	}

}
