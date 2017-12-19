// WAP depicting a situation in which deadlock can occur

class BookTicket extends Thread{
	
//	we are assuming train, compartment as object
	Object train, comp;
	
	BookTicket(Object train, Object comp){
		this.train = train;
		this.comp = comp;
	}
	
	public void run(){
		
//		lock on train
		synchronized(train){
			
			System.out.println("Book Ticket locked on train");
			try{
				Thread.sleep(150);
			}catch(InterruptedException ie){}
				System.out.println("Book Ticket is now waiting to lock on compartment..");
				
				synchronized(comp){
					System.out.println("Book Ticket locked on compartment");
				}
			}
		}
	}

class CancelTicket extends Thread{
	
//	we are assuming train, compartment as an object
	Object train,comp;
	
	CancelTicket(Object train, Object comp){
		this.train = train;
		this.comp = comp;
	}
	
	public void run(){
		
//		lock on compartment
		synchronized(comp){
			
			System.out.println("Cancel Ticket locked on compartment");
		}
		try{
			Thread.sleep(200);
			}catch(InterruptedException ie){}
			System.out.println("Cancel ticket is now wating to lock on train..");
			
			synchronized(train){
				System.out.println("Cancel ticket locked on train");
			}
		}
	}

class Prgm194 {
	public static void main(String args[])throws Exception{
		
//		take train class of Object class
		Object train= new Object();
		Object comp= new Object();
		
//		create Object to BookTicket, CancelTicket classes
		BookTicket obj1= new BookTicket(train,comp);
		CancelTicket obj2= new CancelTicket(train,comp);

//		attach 2 threads to these object
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
//		run the thread on the object
		t1.start();
		t2.start();
	}
}












