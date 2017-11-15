// WAP to find currently running thread in this program

public class Prgm187 {

	public static void main(String args[]){
		
		System.out.println("Let us find current threads");
		Thread t = Thread.currentThread();
		System.out.println("Current threads= "+t);
		System.out.println("Its name= "+t.getName());
		
	}
}
