// Re-write Program 2 showing how to terminate the thread by pressing the Enter button.

import java.io.*;
class MyThread1 extends Thread{
	
	boolean stop= false;
	public void run(){
		
		for (int i=1; i<100;i++){
			System.out.println(i);
			if(stop)
				return;			//come out of run			
		}
			
	}
}
public class Prgm189 {
	
	public static void main(String args[])throws IOException{
		
		MyThread1 obj= new MyThread1();
		Thread t=new Thread(obj);
		t.start();
//		stop the thread when enter is pressed
		System.in.read();	//wait till Enter key is pressed
		obj.stop =true;
	}

}
