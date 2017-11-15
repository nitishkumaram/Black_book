// WAP showing execution of multiple tasks with a single thread

class MyThread2 implements Runnable{
	
	public void run(){
		
//		execute the tasks one by one calling the methods.
		task1();
		task2();
		task3();
	}
	
	void task1(){
		System.out.println("This is task1");
	}
	
	void task2(){
		System.out.println("This is task2");
	}
	
	void task3(){
		System.out.println("This is task3");
	}
}

public class Prgm190 {

	public static void main(String args[]){
		
//	create an object to MyThread class
		MyThread2 obj= new MyThread2();
		
//		create a thread t1 and attach it to that object
		Thread t1=new Thread(obj);
		
//		execute the thread t1 on that object's run() method
		t1.start();
	}
}
