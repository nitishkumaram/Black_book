//Let us take a string and copy some of the characters of the string into a character array 'arr' using getChars() method.

public class Prgm43 {
	public static void main(String args[]){
		
		String str= "Hello, this is a book on java";
		
		char arr[]= new char[20];
		
		//copy from str into arr starting from 7th character to 20th character
		str.getChars(7, 21, arr, 0);
		
		System.out.println(arr);
	}
}
