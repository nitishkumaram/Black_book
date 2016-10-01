//WAP to take a 2D array and display its elements in the form of a matrix.

import java.io.*;
import java.util.Scanner;
public class Prgm36 {
	public static void main(String args[])throws IOException
	{
		//use scanner to access data from keyboard
		Scanner sc = new Scanner(System.in);
		
		//accept rows and column of a matrix
		System.out.println("Enter rows and coulmn separated by single space:");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		//create an array with size [r][c]
		int arr[][] = new int [r][c];
		
		//Create a matrix from keyboard
		System.out.println("Enter element of matrix: ");
		
		for(int i=0; i<r; i++)
		for(int j=0; j<c; j++)
		arr[i][j] = sc.nextInt();
		
		//Print matrix
		for(int i=0; i<r; i++){
			for (int j=0; j<c; j++){
				System.out.println(arr[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}
