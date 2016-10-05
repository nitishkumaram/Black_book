// WAP to take class One and class Two, and create the reference of class Two in class One. Using this reference, let us refer to the
// instance variables and method of class Two. page 165


class One{
	
	//instance variable
	int x;
	Two t; //Class two's reference
	
	//Constructor that receives Two's reference
	One(Two t){
		
		//copy two's reference into t
		this.t = t;
		x=10;
	}
	
	//method to display class One and class Two vars
	void display(){
		System.out.println("One's X= "+x);
		
		//call class two's method
		t.display();
		
		//access class two's var
		System.out.println("Two's var= "+t.y);
	}
	
}

class Two{
	
	//instance variable
	int y;
	
	//initialize y
	Two(int y){
		this.y = y;
	}
	
	//method to display y
	
	void display(){
		System.out.println("Two's y= "+y);
	}
}

public class Prgm83 {
	
	public static void main(String args[]){
		
		//create class Two object and store 22 there
		Two obj2= new Two(22);
		
		//create class one object and pass class Two object to it
		One obj1=new One(obj2);
		
		//call class one's method
		obj1.display();
		
	}

}
