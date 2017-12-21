// WAP to create a server with 2 threads to communicate with several clients.


import java.io.*;
import java.net.*;

class Prgm199 implements Runnable {

	static ServerSocket ss;
	static Socket s;
	
	public void run(){
		
//		find thread name
		String name= Thread.currentThread().getName();
		for(;;){
			try{
				System.out.println("Thread"+name+"ready to accept...");
				s= ss.accept();
				System.out.println("Thread"+name+"accepted a connection");
//				for sending message
				PrintStream ps = new PrintStream(s.getOutputStream());
				ps.println("Thread"+name+ "Contacted you");
				
//				close connection
				ps.close();
				s.close();
			}catch(Exception e){}
		}
	}
	
	public static void main(String args[])throws Exception{
		
		Prgm199 ms= new Prgm199();
		
//		create server socket with 999 as port number
		Thread t1= new Thread(ms, "one");
		Thread t2=new Thread(ms,"Two");
		
		t1.start();
		t2.start();
	}
}
