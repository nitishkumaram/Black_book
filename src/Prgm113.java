// Let us make a program to write abstract class with an instance variable: rate; 
// a concrete method: getRate() and an abstract method: calculateBill().

abstract class Plan{
	
	//take rate as protected to access it in sub classes
	protected double rate;
	
	//accept rate into rate variable. since rate will change
	// depending on plan, we declare abstract method
	
	public abstract void getRate();
	
	//calculate the electricity bill by taking units
	public void calculateBill(int units){
		System.out.println("Bill amount for "+units+" units: ");
		System.out.println(rate*units);
	}
}

class CommercialPlan extends Plan{
	
	//store commercial rate as 5.0 per unit
	public void getRate(){
		rate= 5.00;
	}
}

class DomesticPlan extends Plan{
	//store domestic rate as 2.60 per unit
	public void getRate(){
		rate= 2.60;
	}
}
class Prgm113{
	public static void main(String args[]){
		//create reference p to abstract class
		Plan p;
		
		//calculate commercial bill for 250 units
		System.out.println("Commercial connection: ");
		p= new CommercialPlan();		//use reference to refer to sub class object
		p.getRate();
		p.calculateBill(250);
		
		//calculate domestic bill for 150 units
		System.out.println("Domestic connection: ");
		p= new DomesticPlan();			//use reference to refer to sub class object
		p.getRate();
		p.calculateBill(150);
	}
}