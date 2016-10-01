// Let us try to interchange two integers 10 and 20 by passing them to swap() method

class Demo20{
	
	//to interchange num1 and num 2 values
	void swap(int num1, int num2){
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
	}
}
class Prgm73 {

	public static void main(String args[]){
		//take two primitive data type
		int num1=10, num2=20;
		
		//create Demo20 class object
		Demo20 obj= new Demo20();
		
		//display data before calling
		System.out.println("Before Calling= "+num1+"\t"+num2);
		
		//call swap and pass primitive data
		obj.swap(num1, num2);
		
		//display data after calling
		System.out.println("After Calling= "+num1+"\t"+num2);
	}
}