// WAP to accept an integer from the keyboard
import java.io.*;
public class Prgm21 {
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer number= ");
		int i= Integer.parseInt(br.readLine());
		System.out.println("You entered= "+i);
	}
}
