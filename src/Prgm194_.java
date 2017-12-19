// Reolution of Prgm194

class BookTicket_ extends Thread{
	
//	Assuming train, compartmaint as Object
	Object train,comp;
	
	BookTicket_(Object train,Object comp){
		this.train = train;
		this.comp = comp;
	}
	
	public void run(){
		
//		lock on train
		synchronized(train){
			System.out.println("BookTicket locked on train");
			try{
				Thread.sleep(150);
			}catch(InterruptedException ie){}
			
			System.out.println("BookTicket is now waiting to lock on compartment..");
		}
		
		synchronized(comp){
			System.out.println("Book ticket locked on compartment");
		}
	}
}

class CancelTicket_ extends Thread{
	
//	Assuming train,compartmaint as Object
	Object train, comp;
	
	CancelTicket_(Object train, Object comp){
		this.train = train;
		this.comp = comp;
	}
	
	public void run(){
//		First lock on train like the BookTicket does
		synchronized(train){
			
			System.out.println("CancelTicket locked on train");
			try{
				Thread.sleep(200);
			}catch(InterruptedException ie){}
			
			synchronized(comp){
				System.out.println("Cancel Ticked locked on compartment");
			}
		}
	}
}
			

public class Prgm194_ {
	public static void main(String args[])throws Exception{
		
//		take train and comp as objects of Object class
		Object train= new Object();
		Object comp= new Object();
		
//		create objects to BookTicket and CancelTicket class
		BookTicket_ obj1= new BookTicket_(train, comp);
		CancelTicket_ obj2= new CancelTicket_(train, comp);
		
//		attach 2 thrads to these object
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
//		run the thread on the object
		t1.start();
		t2.start();
	}
}
