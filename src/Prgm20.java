//Accepting a name from the keyboard (pg 68)
import java.io.*;
public class Prgm20 {
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		String name = br.readLine();
		System.out.println("Your Name is: "+ name);
	}
}