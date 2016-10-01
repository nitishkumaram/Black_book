//Let us re-write the earlier program with a slight change in creation of strings

//Concept- String constant pool

public class Prgm46 {
	public static void main(String args[]){
		
		String s1= "Hello";
		String s2= "Hello";
		
		if(s1==s2)
			System.out.println("Both are same");
		else System.out.println("Not same");
	}
}
