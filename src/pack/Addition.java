//WAP to create a package with the name pack and store Addition class in it.

package pack;		//pack is the package name

public class Addition {

	//instance variable
	private double d1,d2;
	
	public Addition(double a, double b){
		d1=a;
		d2=b;
	}
	
	//method to find sum of two number
	public void sum(){
		System.out.println("Sum= "+(d1+d2));
	}
}
