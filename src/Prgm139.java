//WAP which shows how to handle the ArithmeticException and ArrayIndexOutOfBoundException.

class Prgm139 {
	public static void main(String args[]){
		
		try{
			//open the file
			System.out.println("File opened");
			
			//do some processing
			int n=args.length;
			System.out.println("n= "+n);
			
			int a=45/n;
			System.out.println("a= "+a);
			
			int b[]={10,20,30};
			b[50]=100;
		}
		
		catch(ArithmeticException ae){
			//display the exception details
			System.out.println(ae);
			
			//display a message to user
			System.out.println("Please pass data while running this program");
		}
		
		catch(ArrayIndexOutOfBoundsException aie){
			
			//display the exception details
			System.out.println(aie);
			
			//display a mesaage to user
			System.out.println("Please see that the array index is within the range");
		}
		finally{
			//close the file
			System.out.println("File closed");
		}
	}

}
