//Let us write a program to compare two strings using '==' operator, and see the result.

public class Prgm45 {
	public static void main(String args[]){
		String s1="Hello";
		String s2= new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1==s2)
			System.out.println("s1 and s2 are equal");
		else System.out.println("s1 and s2 are not equal");
		
		if(s1.equals(s2))
			System.out.println("Both are equal");
		else System.out.println("Not same");
		
	}
}
