//WAP which tells the use of try, catch and finally block.

class Prgm138 {
	public static void main(String args[]){
		
		try{
			
			//open the file
			System.out.println("Open files");
			
			//do some processing
			int n= args.length;
			System.out.println("n= "+n);
			int a= 45/n;
			System.out.println("a= "+a);
		}
		
		catch(ArithmeticException ae){
			
			//display the exception details
			System.out.println(ae);
			
			//display any msg to the user
			System.out.println("Please pass data while running this program");
		}
		
		finally{
			//close the file
			System.out.println("Close files");
		}
	}

}
