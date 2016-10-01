// WAP to demonstrate that the return statement in main() method terminate the applications. (Pg 64)

public class Prgm18 {
	public static void main(String args[]){
		int i=1;
		System.out.println("before return");
		if (i==1) return;
		System.out.println("after return");
	}
}