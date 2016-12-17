// WAP to understand how to achieve callback mechanism through interfaces in java.

interface Tax{
	double stateTax();
}

//implementation class for AP state tax
class AP implements Tax{
	public double stateTax(){
		System.out.println("According to AP Govt. rules= ");
		return 5000.50;
	}
}

//implement class for Karanataka state tax

class Karnataka implements Tax{
	public double stateTax(){
		System.out.println("According to Karnataka Govt. rules= ");
		return 2000.00;
	}
}

class Prgm117 {

	public static void main(String args[])throws Exception{
		
		//Accept state name through command line arg
		//The state name is stored in an object c
		
		Class c= Class.forName(args[0]);
		
		//create a new object to that class whose name is in c
		//Tax interface reference is referencing that new object
		Tax ref= (Tax)c.newInstance();
		
		//call the method to calculate total tax and pass interface reference- this is call back
		//Here, ref may refer to stateTax() of AP or Karnataka classes depending on the class
		//for which the object is created in the previous step
		
		calculateTax(ref);
	}
	
	static void calculateTax(Tax t){
		
		//calculate central tax
		double ct= 1000.00;
		
		//calculate state tax
		double st= t.stateTax();
		
		//Display total tax
		System.out.println("Total tax= "+(ct+st));
	}
}
