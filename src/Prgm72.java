// WAP to create Person class object

class Demo19 {

	//instance variables
	private String name;
	private int age;
	
	//mutator method to store data
	public void setName(String name){
		this.name=name;
	}
	
	public void setAge(int age){
		this.age= age;
	}
	
	//accessor method to read data
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
}

class Prgm72{
	
	public static void main(String args[]){
		
		//create an empty Demo19 class object
		Demo19 p1= new Demo19();
		
		//store some data into the object
		p1.setName("Raju");
		p1.setAge(20);
		
		//access data from object
		System.out.println("Name= "+p1.getName());
		System.out.println("Age= "+p1.getAge());
	}
}
