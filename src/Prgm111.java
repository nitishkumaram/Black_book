// Write a program in which Santro sub class implements the abstract methods of the super class, Prgm109 (Car). Compile this code to get
// Prgm111.class (Santro.java)

class Prgm111 extends Prgm109{	//Assume Prgm109 as Car, and Prgm110 as Santro
	
	//store reg no at Super class
	Prgm111(int regno){
		super(regno);
	}

	//Santro uses power steering
	void steering(int direction, int angle){
		System.out.println("Take a turn");
		System.out.println("This car uses power steering");
	}
	
	//Santro uses gas breaks
	void braking(int force){
		System.out.println("Brake applied");
		System.out.println("This cars uses gas brakes");
	}
	
}
