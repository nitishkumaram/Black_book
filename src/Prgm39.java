// WAP which performs addition of two number using command line argument

public class Prgm39 {
	public static void main(String args[]){
		
		//take the number from args
		//they would be in string form
		String s1 = args[0];
		String s2 = args[1];
		
		//Convert them into numerics
		double d1= Double.parseDouble(s1);
		double d2= Double.parseDouble(s2);
		
		//add them and display
		double sum= d1+d2;
		System.out.println("Sum of two number= "+ sum);
		
	}
}