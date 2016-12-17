//WAP in which Marutisub class implements the abstract method of the super class, Car. Compile this code to get Maruti.class

class Prgm110 extends Prgm109 { //Assume Prgm109 as Car, and Prgm110 as Maruti

	//store regno in super class var
	Prgm110(int regno){
		super(regno);
	}
	
	//Maruti uses ordinary steering 
	void steering(int direction, int angle){
		System.out.println("Take a turn");
		System.out.println("This is ordinary steering");
	}
	
	//Maruti uses hydraulic braks
	void braking(int force){
		System.out.println("Brakes applied");
		System.out.println("these are hydraulic brakes");
	}
}