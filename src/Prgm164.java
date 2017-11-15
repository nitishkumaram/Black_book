// WAP to showing two threds acting on same object.

class Reserve implements Runnable{
	
//	available berth is one
	int available= 1;
	int wanted;
	
//	accept wanted birth at run time
	Reserve(int i){
		wanted = i;
	}
	
	public void run(){
		
//		display available births
		System.out.println("Available births= "+available);
		
//		if available births are more than wanted berths
		
		if(available >= wanted){
			
//			get name of passengers
			String name= Thread.currentThread().getName();
			
//			allot berth to him
			System.out.println(wanted+"Berths reserved for "+name);
			
			try{
				Thread.sleep(1500); //wait for printing the ticket
				available = available - wanted; //update the number of available berths
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
		
//		if available births are less, display sorry
		else
			System.out.println("Sorry, No Births !!");
	}
}
public class Prgm192 {
	
	public static void main(String args[]){
		
//		tell that 1 birth is needed
		Reserve obj = new Reserve(1);
		
//		attach first thread to the object
		Thread t1= new Thread(obj);
		
//		attach second thread to the same object
		Thread t2= new Thread(obj);
		
//		Take the thread names as persons names
		t1.setName("First Person");
		t2.setName("Second person");
		
//		send the request for berth
		t1.start();
		t2.start();
	}

}
