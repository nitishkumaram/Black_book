//WAP to add two matrices and display sum matrix


//Matrix addition using methods.
//Passing arrays to methods and returning them.

import java.io.*;
import java.util.*;
class Matrix{
	
	//take a 2D array for matrix and row,cols
	int arr[][];
	int r,c;
	
	//initialize r,c and allot memory for array
	Matrix(int r, int c){
		this.r = r;
		this.c = c;
		arr = new int[r][c];
	}
	
	//accept 2D array from keyboard and return it
	
	int[][] getMatrix() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer is useful to accept each row as a single string and then divide it into tokens.
		//Each token represents an array element.
		
		StringTokenizer st;
		
		for(int i=0; i<r; i++)
		{
			String s = br.readLine();
			st = new StringTokenizer(s," ");
			for(int j=0; j<c; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		return arr;
	}
	
	//accept two 2D arrays and find sum matrix and return it
	
	int[][] findSum(int a[][], int b[][]){
		
		int temp[][]= new int[r][c];
		
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				temp[i][j] = a[i][j]+b[i][j];
		
		return temp;
	}
	
	//display the resultant 2D array as a matrix.
	
	void displayMatrix(int res[][]){
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.println(res[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

//class MatrixSum

public class Prgm76 {

	public static void main(String args[])throws IOException{
		
		//create 2 objects to Matrix class, since each object contains an array.
		
		Matrix obj1 = new Matrix(3,3);		//3*3 matrix
		Matrix obj2 = new Matrix(3,3);		//3*3 matrix
		
		//take 3 references for 2D arrays
		int x[][],y[][],z[][];
		System.out.println("\nEnter element for first matrix: ");
		x= obj1.getMatrix();
		
		System.out.println("\nEnter element for second matrix: ");
		y= obj2.getMatrix();
		
		//add the matrices and return sum matrix into z
		z= obj1.findSum(x, y);
		
		System.out.println("\n The sum matrix is: ");
		obj2.displayMatrix(z);
	}
}
