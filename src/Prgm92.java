//WAP to prove that the default constructor of the super class is available sub class by default.

class One92{
	
	//super class default constructor
	One92(){
		System.out.println("One");
	}
}

class Two92 extends One92{
	
	//sub class default constructor
	Two92(){
		System.out.println("Two");
	}
}
class Prgm92 {

	public static void main(String args[]){
		//create sub class boject
		Two92 t = new Two92();
	}
}
