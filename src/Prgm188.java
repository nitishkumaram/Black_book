// WAP to create MyThread class with run() mentod and then attach a thread to run this MyThread class object

// To create thread and run it
// let the class extends Threads or implements Runnable

class MyThread extends Thread{
	
//	write run mentod inside
	public void run(){
		
//		only this code is executed by the thread
		for(int i=1; i<10000;i++){
			System.out.println(i);
		}
	}
}

//Another class
public class Prgm188 {

	public static void main(String args[]){
		
//		create and object to MyThread class
		MyThread obj = new MyThread();
		
//		create a thread and attach it to the object of MyThread class
		Thread t = new Thread(obj);
		
//		now run the thread on the object
		t.start(); // This thread will execute the code inside run() method of MyThrad object
	}
	
}
