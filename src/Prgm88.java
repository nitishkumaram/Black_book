// WAP to create an object to Student class, then store data into it and then retrieve and display the data.
//Using Student class


class Prgm88 {

	public static void main(String args[]){
		
		//create an object to Student class
		Student s= new Student();
		
		//Store data into object- for this use Setter methods.
		s.setId(1001);
		s.setName("Chandra Sekhar");
		s.setAdress("MIG-12, kukatpally, Hyderabad");
		s.setMarks(950);
		
		//Retrieve data using getter method and display
		System.out.println("ID= "+s.getId());
		System.out.println("Name= "+s.getName());
		System.out.println("Address= "+s.getAddress());
		System.out.println("Marks= "+s.getMarks());
	}
}
