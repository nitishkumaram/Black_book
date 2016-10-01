//Wap to test which one is executed first by JVM, the static block or the static method

class Prgm67 {

	static  {
		System.out.println("Static block");
	}
	public static void main(String args[]){
		System.out.println("Static method");
	}
}
