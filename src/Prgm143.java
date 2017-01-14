//WAP to throw a user defined Exception
// to throw whenever balance amount is below Rs.1000

class Prgm143 extends Exception{

	//store account information
	private static int accno[] = {1001,1002,1003,1004,1005};
	
	private static String name[] = {"Raja Rao", "Rama Rao", "Subha Rao", "Appa Rao", "Laxmi Devi"};
	
	private static double bal[] = {10000.00,12000.00, 5600.50, 999.00, 55};
	
	//default constructor
	Prgm143(){
	}
	
	//parameterized constructor
	Prgm143(String str){
		super(str);
	}
	
	//write main()
	public static void main(String args[]){
		try{
			//display the heading for the table
			System.out.println("ACCNO"+"\t"+"CUSTOMER"+"\t"+"BALANCE");
			
			//display actual account information
			for(int i=0; i<5; i++){
				System.out.println(accno[i] +"\t"+name[i]+"\t"+bal[i]);
				
				//Display own exception if balance is < 1000
				if(bal[i]<1000){
					Prgm143 me = new Prgm143("Balance amount is less");
					throw me;
				}
			}
		}
		catch(Prgm143 me){
			me.printStackTrace();
		}
	}
}
