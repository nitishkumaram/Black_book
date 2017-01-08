// WAP to that open the files in the beginning. Then the number of command line arguments is accepted into n.
// This n divides a number 45 and the result is stored into a. Finally the files are closed.

class Prgm137 {
	
	public static void main(String args[]){
		
		//open the files
		System.out.println("File opened");
		
		//do some processing
		int n= args.length;
		System.out.println("n= "+n);
		int a= 45/n;
		System.out.println("a= "+a);
		
		//close the file
		System.out.println("Close file");
		
	}

}
