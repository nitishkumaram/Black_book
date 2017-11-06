// WAP that shows the use of Arrays.

import java.io.*;
import java.util.*;

class Prgm157 {

	public static void main(String args[])throws IOException{
//		to accept data from keyboard
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
//		create an array
		int arr[]= new int[5];
		
//		store element into array
		for(int i=0; i<5; i++){
			System.out.println("Enter an integer: ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
//		Display the arr[] contents
		System.out.println("Content of the array: ");
		display(arr);
		
//		sort the array arr[] into ascending order
		Arrays.sort(arr);
		
//		Display the sorted contents
		System.out.println("The sorted arrays: ");
		display(arr);
		
//		Now search for an element
		System.out.println("Which element to search");
		int element=Integer.parseInt(br.readLine());
		int index= Arrays.binarySearch(arr,element);
		if(index<0)
			System.out.println("Element not found");
		else System.out.println("Element found at location: "+(index+1));
	}
//		Display method-uses for each loop
	static void display(int arr[]){
		for(int i: arr)
			System.out.println(i);
	}
}
