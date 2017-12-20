// WAP such that the Consumer thread is informed immediately when the data production is over.

public class Prgm196 {
	public static void main(String args[]) throws Exception{
		
//		Producer produces some data which consumer consumes
		Producer_196 obj1= new Producer_196();
		
//		Pass Producer object to Consumer so that it is then available to consumer
		Consumer_196 obj2= new Consumer_196(obj1);
		
//		Create 2 threads and attach to Producer and Consumer
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		
//		Run the thread
		t1.start();
		t2.start();
	}

}

class Producer_196 extends Thread{
	
//	To add data, we use string buffer object
	StringBuffer sb;
	
	Producer_196(){
		sb = new StringBuffer(); //allot memory
	}
	
	public void run(){
		synchronized (sb) {
			
//			go on appending data (numbers) to string buffer
			for(int i= 1; i<=10; i++){
				try{
					sb.append(i+":");
					Thread.sleep(100);
					System.out.println("appending");
				}catch(Exception e){}
			}
			sb.notify();
		}
	}
}

class Consumer_196 extends Thread{

//	create Producer reference to refer to Producer object from Consumer class
	Producer_196 prod;
	
	Consumer_196(Producer_196 prod){
		this.prod = prod;
	}
	
	public void run(){
		
//		wait till a notification is received from producer thread
//		Here, there is no wastage of time of even a single millisecond
		
		try{
			prod.sb.wait();
		}catch(Exception e){}
		
//		When data production is over, display data of stringbuffer
		System.out.println(prod.sb);
		
	}
}

