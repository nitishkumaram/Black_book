// WAP to understand the thread priorities. The thread with higher priority number will complete its execution first.

public class Prgm197 extends Thread {

	int count=0; //this count numbers
	
	public void run(){
		
		for(int i=1; i<=10000;  i++)
			count++;
		
//		display which thread has completed counting and its priority
		System.out.println("Completed Thread: "+ Thread.currentThread().getName());
		
		System.out.println("Its priority: "+ Thread.currentThread().getPriority());
	}
}

class Prior{
	public static void main(String args[]){
		
		Prgm197 obj= new Prgm197();
		
//		Create two threads
		Thread t1= new Thread(obj, "One");
		Thread t2= new Thread(obj, "two");
		
//		set priority for them
		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY); //This means priority no. 5
		
//		start first t1 and then t2
		t1.start();
		t2.start();
	}
}