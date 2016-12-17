// Let us create a program to use all the features of abstract class by creating a reference to it and referring to the 
// sub class objects. Abstract class reference can be used to call the methods of the sub classes.

public class Prgm112 {	//Assume Prgm112 as useCar

	public static void main(String args[]){
		
		//create sub class object
		Prgm110 m= new Prgm110(1001);	//1001 is regno
		Prgm111 s= new Prgm111(5005);
	
	//create a reference to super class: Prgm109 i.e Car
	Prgm109 ref;
	
	//to use the Maruti car i.e. Prgm 110
	ref=m;
	
	//to use Santro car i.e. Prgm 111
	ref.openTank();
	ref.steering(1,90);
	ref.braking(500);
	
}
}
