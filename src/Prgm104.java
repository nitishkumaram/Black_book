//Write a program where eaquals() method compares Myclass objects references. The same equals() method is 
// used to compare Integer class objects contents.

class Myclass_104{
	int x;
	
	Myclass_104(int x){
		this.x=x;
	}
}
class Prgm104 {

	public static void main(String args[]){
		
		//create two Myclass objects with same content.
		//In this case, references of objects will be different.
		Myclass_104 obj1= new Myclass_104(15);
		Myclass_104 obj2= new Myclass_104(15);
		
		//create two wrapper class objects and store same content.
		//In this case, references of objects will be different.
		Integer obj3= new Integer(15);
		Integer obj4= new Integer(15);
		
		if(obj1.equals(obj2)){
			System.out.println("Obj1 and Obj2 are same");
		}
		else{
			System.out.println("Obj1 and Obj2 are not same");
		}
		
		if(obj3.equals(obj4)){
			System.out.println("Obj3 and Obj4 are same");
		}
		else{
			System.out.println("Obj3 and Obj4 are not same");
		}
	}
}
