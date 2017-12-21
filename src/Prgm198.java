// WAP to demonstrate the creation of thread groups and some menthods which act on thread group

class Prgm198 {

	public static void main(String args[])throws Exception{
		
//		we should understan that the following statements are executed by the main thread.
		Reservation res= new Reservation();
		Cancellation can= new Cancellation();
		
//		create a thread group with name
		ThreadGroup tg=new ThreadGroup("First Group");
		
//		create two threads and add them to the First group
		Thread t1=new Thread(tg, res, "First Thread");
		Thread t2=new Thread(tg, res, "Second Thread");
		
//		create another thread group tg1 as a child to tg
		ThreadGroup tg1=new ThreadGroup(tg, "Second Group");
		
//		Create 2 threads and add them to second group
		Thread t3=new Thread(tg1, can, "Third Thread");
		Thread t4=new Thread(tg1, can, "Forth Thread");
		
//		Find parent group of tg1
		System.out.println("Parent of tg1"+tg1.getParent());
		
//		Set maximum priority to tg1 as 7
		tg1.setMaxPriority(7);
		
//		Know the thread group of t1 and t3
		System.out.println("Thread Group of t1= "+t1.getThreadGroup());
		System.out.println("Thread Group of t3= "+ t3.getThreadGroup());
		
//		start the thread
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
//		Finds how many threads are actively running.
		System.out.println("No of threads active in tg= "+tg.activeGroupCount());
	}
}

class Reservation extends Thread{
	
	public void run(){
		System.out.println("I am reservation Thread");
	}
}
class Cancellation extends Thread{
	
	public void run(){
		System.out.println("I am Cancellation Thread");
	}
}