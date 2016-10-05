//Let us make a program to create the outer class BankAccnt and the inner class Interest in it. page 171
//Program85

import java.io.*;
class BankAcct {
	
	//balance amount is the variable
	private double bal;

	//initialize the bal
	BankAcct(double b){
		bal = b;
	}
	
	//in this method, inner class object is created after verifying the authentication of user.
	//r is rate of interest r
	
	void contact(double r) throws IOException{
		
		//accept the password from keyboard and verify
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter password= ");
		String passwd=br.readLine();
		
		if(passwd.equals("zx78iopl"));
		{
			//if password is correct then calculate interest
			Interest in = new Interest(r);
			in.calculateInterest();
		}
		else{
			System.out.println("Sorry, you are not an authorize person !!");
			return;
		}
	}
	
	//inner class
	private class Interest{
		//rate of interest
		private double rate;
		//initialize the rate
		Interest(double r){
			rate = r;
		}
		
		//calculate interest amount and update balance
		void calculateInterest(){
			double interest= bal*rate/100;
			bal += interest;
			System.out.println("updated balance= "+bal);
		}
	}
}

//Using inner class
class InnerClass{
	public static void main(String args[]) throws IOException{
		
		//bank account is holding a balance of 10000
		BankAcct account= new BankAcct(10000);
		//update balance amount by adding interest at 9.5%
		account.contact(9.5);
	}
}
