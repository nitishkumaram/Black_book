// WAP where Myclass's calculate() method is available to all the objects and hence 
// every object can calculate the square value.

class Myclass_107{
	
	//method to calculate square value
	void calculate(double x){
		System.out.println("Square= "+(x*x));
	}
}
class Prgm107 {

	public static void main(String args[]){
		Myclass_107 obj1 = new Myclass_107();
		Myclass_107 obj2 = new Myclass_107();
		Myclass_107 obj3 = new Myclass_107();
		
		//call calculate() method from the object
		obj1.calculate(3);
		obj2.calculate(4);
		obj3.calculate(5);
	}
}
