// WAP showing two tasks at a time - Theater example

class MyThread3 implements Runnable{
	
//	declare a string to represent the task
	
	String str;
	
	public MyThread3(String str) {
		
		this.str = str;
		
	}
	
	public void run(){
		
		for(int i=1; i<=10; i++){
			System.out.println(str+" : "+i);
			try{
				Thread.sleep(2000);	     //ceases thread execution for 2000 milliseconds
			} catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}

public class Prgm191 {

	public static void main(String args[]){
		
//		create 2 object to represent two tasks
		
		MyThread3 obj1=new MyThread3("Cut the tkt: ");
		MyThread3 obj2=new MyThread3("Show the seat: ");
		
//		Create 2 threads and attach them to the two objects
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
//		start the threads
		
		t1.start();
		t2.start();
	}
}
