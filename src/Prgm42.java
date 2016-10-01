// WAP which will help us to understand how to create strings and how to use some important methods of String class.

public class Prgm42 {
	public static void main(String args[]){
		//create strong in three ways
		String s1 = "A book on java";
		String s2 = new String("I like it");
		char arr[]={'D','r','e','a','m','t','e','c','h',',','p','r','e','s','s'};
		String s3 = new String(arr);
		
		//display all three strings
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//find length of first string
		System.out.println("Length of s1= "+s1.length());
		
		//concatenate two string
		System.out.println("s1 and s2 joined= "+ s1.concat(s2));
		
		//concatenate three strings with +
		System.out.println(s1+"from"+s2);
		
		//test if string s1 starts with A
		boolean x = s1.startsWith("A");
		if(x) System.out.println("s1 sarts with \'A\'");
		else System.out.println("s1 does not start with \'A\'");
		
		//extract substring from s2, starting from 0th char to 6th char
		String p= s2.substring(0, 7);
		
		//extract substring from s3, starting from 0th char to 8th char
		String q= s3.substring(0, 9);
		
		//concatenate the string p and q
		System.out.println(p+q);
		
		//convert s1 into uppercase and lowercase
		System.out.println("Upper s1= "+s1.toUpperCase());
		System.out.println("Lower s1= "+s1.toLowerCase());
		
	}
}
