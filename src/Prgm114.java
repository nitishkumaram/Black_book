// WAP to create an interface MyInter that connets to a database retrieves the data from the database.

interface MyInter114{
	void connect();
	void disconnect();
}

class OracleDB114 implements MyInter114{
	public void connect(){
		System.out.println("Connecting to Oracle database...");
	}
	public void disconnect(){
		System.out.println("Disconnected from Oracle...");
	}
}

class Prgm114 {

	public static void main(String args[])throws Exception{
		//accept the implementation classname from Commandline argument
		//and store it in the object c
		Class c= Class.forName(args[0]);
		//create an object to the class whose name is in c.
		MyInter114 mi=(MyInter114)c.newInstance();
		//call methods of the object using mi
		mi.connect();
		mi.disconnect();
	}
}
