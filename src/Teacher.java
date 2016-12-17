//Teacher class for prgm 88 and 89

public class Teacher {

	//instance variable
	int id;
	String name;
	String address;
	Float sal;
	
	//Setter method to store id
	void setId(int id){
		this.id=id;
	}
	
	//getter method to get id
	int getId(){
		return id;
	}
	
	//Setter name
	void name(String name){
		this.name=name;
	}
	
	//getter method to get name
	String name(){
		return name;
	}
	
	//Setter Address
	void setAddress(String address){
		this.address=address;
	}
	
	//getter method to get address
	String getAddress(){
		return address;
	}
	
	//Settter Sal
	void setSalary(float sal){
		this.sal=sal;
	}
	
	//Getter method to get Salary
	float getSalary(){
		return sal;
	}
}
