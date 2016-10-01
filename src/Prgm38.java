// WAP to display the command line arguments.

public class Prgm38 {
	public static void main(String args[]){
		
		//find number of arguments
		int n = args.length;
		System.out.println("Number of args= "+ n);
		
		//display all the arguments
		System.out.println("The args are= ");
		for(int i=0; i<n; i++)
			System.out.println(args[i]);
	}
}