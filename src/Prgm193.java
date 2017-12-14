// WAP to synchronize the threads acting on the same object. The synchronized block in the program
// can be executed by only one thread at a time.

class Reserve193 implements Runnable{
	
//	available births are 1
	int available= 1;
	int wanted;
	
//	accept wanted at run time
	Reserve193(int i){
		wanted = i;
	}
	
	public void run(){
		synchronized(this)  // synchronize the current object
		{
			
			//display available births
			System.out.println("Available births= "+ available);
			
//			if available births are more than wanted births
			if(available >= wanted){
				
//				get the name of the passenger
				String name= Thread.currentThread().getName();
				
//				allot birth to him
				System.out.println(wanted + "Birth reserved for"+name);
				try{
					Thread.sleep(1500); //wait for printing the tkt
					available = available - wanted;		// update the no of available berths
				}catch(InterruptedException ie){
					
				}				
			}
//			if available births are not available, display "Sorry"
			else {
				System.out.println("Sorry!! No berths!!");
			}
		}  //end of synchronized block
	}
}

public class Prgm193 {
	
	public static void main(String args[])
	{
//		tell that 1 birth is needed
		Reserve193 obj = new Reserve193(1);
		
//		attach 1st thread to the object
		Thread t1= new Thread(obj);
		
//		attach 2nd thread to the object
		Thread t2= new Thread(obj);
		
//		take the thread names as persons name
		t1.setName("First Person");
		t2.setName("Second Person");
		
//		send the requests for the birth
		t1.start();
		t2.start();
	}

}
