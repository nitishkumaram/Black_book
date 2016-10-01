//WAP to accept a float number
import java.io.*;
public class Prgm22 {
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a float number: ");
		float f= Float.parseFloat(br.readLine());
		System.out.println("Value of float is: "+ f);
	}
}
