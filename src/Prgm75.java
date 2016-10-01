//WAP to interchange the values inside an object, since the same object data is modified, we can see the data has
//been interchanged

class Demo22{
	
	//instance variable
	int id1,id2;
	
	//to initialize id values
	
	Demo22(int id1, int id2){
		this.id1 = id1;
		this.id2 = id2;
	}
}

class CheckDemo1{
	
	//to interchange id values in the same Employee object
	
	void doswap(Demo22 obj){
		
		int temp;
		temp = obj.id1;
		obj.id1 = obj.id2;
		obj.id2 = temp;
	}
}
class Prgm75 {
	public static void main(String args[]){
		
		//take Demo22 class object with id values
		Demo22 obj1 = new Demo22(10, 20);
		
		//create check class object
		CheckDemo obj = new CheckDemo();
		
		//display data before calling
		System.out.println(obj1.id1+ "\t"+obj1.id2);
		
		//call swap and pass Demo22 class object
		//uncomment it 								obj.doswap(obj1);
		
		//display data after calling
		System.out.println(obj1.id1+"\t"+obj1.id2);
	}

}
