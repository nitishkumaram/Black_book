// WAP that generates random numbers repeatedly between '0' and '10'. You need to also ensure that if the 
// generated number is '0' then programs gets terminated

import java.io.*;
class Prgm148 {

	public static void main(String args[])throws Exception{
		System.out.println("Random numbers between 0 and 10: ");
		
		while(true){
			/* random()  returns double type between 0 and 1. But we want the number as integer
			 * and between 0 and 10. So multiply it by 10 and convert into int.
			 */
			
			double d= 10*Math.random();
			int i= (int)d;
			System.out.println(i);
			
//			Let the execution wait till 2000 milli seconds = 2 second
			Thread.sleep(2000);
			
			if(i==0) System.exit(0);		//come out
		}
	}
}
