// WAP where the Consumer thread checks whether the data production is over or not every 10 milliseconds.

class Prgm195{
	
	public static void main(String args[])throws Exception{
		
//		Producer produces some data with Consumer Consumes
		Producer obj1= new Producer();
		
//		Pass Producer object to Consumer so that it is then available to Consumer
		Consumer obj2= new Consumer(obj1);
		
//		create 2 threads and attach to producer and consumer
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		
//		Run the threads
		t1.start();
		t2.start();
	}
}

class Producer extends Thread{
	
//	TO add data we use String Buffer object
	StringBuffer sb;
	
//	dataprodover will be true when data production is over
	boolean dataprodover = false;
	
	Producer(){
		
		sb = new StringBuffer(); //allot memory
	}
	
	public void run(){
		
//		go on appending data (numbers) to String buffer
		for(int i=1; i<=10; i++){
			try{
				sb.append(i+":");
				Thread.sleep(100);
				System.out.println("appending");
			}catch(Exception e){}
		}
//		data production is over, so store true in dataprodover
		dataprodover = true;
	}
}

class Consumer extends Thread{
	
//	create producer reference to refer to Producer object from Consumer class
	Producer prod;
	
	Consumer(Producer prod){
		this.prod = prod;
	}
	
	public void run(){
//		if data production is not over, sleep for 10 milliseconds and check again.
//		Here, there is a time delay of several milliseconds to receive data.
		try{
			while(! prod.dataprodover){
				Thread.sleep(10);
			}
		}catch(Exception e){}
		
//		when data production is over, display data of stringbuffer
		System.out.println(prod.sb);
	}
}

