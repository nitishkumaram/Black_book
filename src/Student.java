//Student Class - version 1	Prgm88.java

class Student {

	//instance variable
	int id;
	String name;
	String address;
	int marks;
	
	//setter method to store id
	void setId(int id){
		this.id=id;
	}
	
	//getter method to retrieve id
	int getId(){
		return id;
	}
	
	//to store name
	void setName(String name){
		this.name=name;
	}
	
	//getter method to retrieve name
	String getName(){
		return name;
	}
	
	//to store address
	void setAdress(String address){
		this.address=address;
	}
	
	//getter method to retrieve address
	String getAddress(){
		return address;
	}
	
	//to store marks
	void setMarks(int marks){
		this.marks=marks;
	}
	
	//getter method to get marks
	int getMarks(){
		return marks;
	}
}
