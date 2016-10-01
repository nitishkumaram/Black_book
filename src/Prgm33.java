//WAP which accepts the marks of a student into a 1D array from the keyboard and find total marks and percentage.

import java.io.*;

public class Prgm33 
{
	public static void main(String args[])throws IOException
	{
		//to accept data from the keyword
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//ask how many subject
		System.out.println("Enter number of subject: ");
		int n=Integer.parseInt(br.readLine());
		
		//create 1D array with size n
		int marks[]= new int[n];
		
		//store elements into the array
		for(int i=0;i<n;i++){
			System.out.println("Enetr marks: ");
			marks[i]=Integer.parseInt(br.readLine());
		}
		//find total marks
		int tot=0;
		for(int i=0;i<n;i++)
		tot=tot+marks[i];
		
		//display total marks
		System.out.println("Total marks= "+tot);
		
		//find percentage
		float percentage=(float)tot/n;
		System.out.println("Percentage= "+percentage);
	}
}
