//WAP to use 'extends' keyword to create Student class by reusing Teacher class code.
//We should write only additional members in Student class which are not available in Teacher class


class Prgm89 extends Teacher {
 
	//Since id, name, address are available from Teacher class, we omit
	// those instance variable and the coressponding methods.
	
	int marks;
	
	//to store marks
	void setMarks(int marks){
		this.marks=marks;
	}
	
	//to retrieve marks
	int getMarks(){
		return marks;
	}
}
