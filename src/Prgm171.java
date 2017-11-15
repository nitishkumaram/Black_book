// WAP to create Employee class whose objects are to be stored into a file.


import java.io.*;
import java.util.Date;
class Prgm171 implements Serializable {
	
	public static void main(String args[])throws IOException{
		
//		instance variable
		private int id;
		private String name;
		private float sal;
		private Date doj;
		
//		initialize the var
		Prgm171(int i, String n, float s, Date d){
			
			id = i;
			name = n;
			sal = s;
			doj = d;
		}
		
//		to display employee details
		void display(){
			
			System.out.println(id+"\t"+name+"\t"+sal+"\t"+doj);
			
		}
		
//		to accept data from keyboard and store into Employee object
		
		static Prgm171 getData() throws IOException{
			
//			to accept data form keyboard
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
//			accpet data from keyboard
			
			System.out.println("Enter emp id= ");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter name= ");
			String name = br.readLine();
			
			System.out.println("Enter salary");
			float sal = Float.parseFloat(br.readLine());
			
//			take current system date and time as for joining
			Date d = new Date();
			
//			create Employee object with the accepted data
			Prgm171 e = new Prgm171(id, name, sal, d);
			
//			return the Employee object
			return e;
			
		}
		
	}

}
