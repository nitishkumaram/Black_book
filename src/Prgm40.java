// WAP which calls the main method of class1 from class2. In this we pass names[] array to main method at the time of call. This names[ ]
// is copied into args[] and hence we can display the contents of names[ ] in the main method of Class1. Since we are calling Class1
// from Class2, first of all Class2 should be executed by JVM, so we give this program name as Class2.java

class Prgm40p1{
	public static void main(String args[]){
		//args contains names,display them
		
		for(String s: args) 		//we are using for-each loop here
			System.out.println(s);
	}
}

public class Prgm40 {
	public static void main(String args[]){
		
		//take a string type array
		String names[] = {"Gopi","Kamal","vinay","Neeta"};
		
		//call main() of class1 and pass the names array
		Prgm40p1.main(names);
	}

}

// Can we call the main() method of a class from another class?
// Yes. We can call the main() method from another class using Classname.main().
// At the time of calling the main() method, we should pass a string type array to it. e.g Classname.main(arrayname)