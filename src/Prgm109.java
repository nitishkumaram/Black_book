// WAP in which abstract class Car contains an instance variable, one concrete method and two abstract methods.
// Compile this code to get Car.class. We can not run it because it does not have a main() method.

abstract class Prgm109{		//Assume Prgm109 as Car
	
	//every car will have a registration number
	int regno;
	
	//initialize the value of regno
	Prgm109(int r){
		
		regno=r;
	}

//all cars will have a fuel tank and same mechanism to open the tank
void openTank(){
	System.out.println("Fill the tank");
}

//all cars will have steering but different cars will have steering but different cars will have different
// steering mechanism.

abstract void steering (int direction, int angle);

//all cars will have brakes but different cars will have different braking mechanisms.
abstract void braking(int force);
}
