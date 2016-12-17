//Let us make a program to show how to override the calculateBill() method of Commercial class inside the Domestic class.

class Commercial{
	//take customer name
	private String name;
	//store customer name into name
	void setName(String name){
		this.name=name;
	}
	//retrieve name
	String getName(){
		return name;
	}
	//to calculate bill taking @Rs 5.00 per unit
	void calculateBill(int units){
		System.out.println("Customer: "+getName());
		System.out.println("Bill amount: "+units*5.00);
	}
}
//Electricity bill for domestic connection
class Domestic extends Commercial{
	//override the calculateBill() of commercial class, to calculate bill @Rs 2.50 per unit
	void calculateBill(int units){
		System.out.println("Customer: "+getName());
		System.out.println("Bill amount: "+units*2.50);
	}
}
//Calculate electricity bill for commercial and domestic users
public class Prgm99 {
	public static void main(String args[]){
		//call calculateBill() using the commercial object
		Commercial c=new Commercial();
		c.setName("Raj Kumar");
		c.calculateBill(100);
		//call domesticBill() using the domestic object
		Domestic d=new Domestic();
		d.calculateBill(100);
	}

}
