// WAP which contains a Printer interface and its implementation classes to send text to any Printer.

//An interface Printer Printer to send text to any Printer.
import java.io.*;

//creating an interface for printing
interface Printer{
	//to print the text sent to printer
	void printit(String text);		//public abstract
	//to diconnect from printer
	void disconnect();
}

//implementing printer interface for IBM printer
class IBMPrinter implements Printer{
	public void printit(String text){
		System.out.println(text);
	}
	public void disconnect(){
		System.out.println("Printing completed");
		System.out.println("Disconnected from IBM printer");
	}
}

//Implementing Printer interface for Epson printer
class EpsonPrinter implements Printer{
	public void printit(String text){
		System.out.println(text);
	}
	public void disconnect(){
		System.out.println("Printing completeted");
		System.out.println("Disconnected from Epson Printer");
	}
}

//Using a printer
class Prgm115 {
	public static void main(String args[])throws Exception{
		
		//Attach FileReader to config.txt to read data from it
		FileReader fr= new FileReader("config.txt");
		
		//connect LineNumberReader to FileReader to read one line at a time
		LineNumberReader lnr= new LineNumberReader(fr);
		
		//read the first line from config.txt file
		String printername= lnr.readLine();
		
		//the read line represents the printer name
		System.out.println("Loading the driver for: "+printername);
		
		//store the printername in an object c
		Class c= Class.forName(printername);
		
		//create an object to that class represented by printname in c
		Printer ref= (Printer)c.newInstance(); 
				
		//send text to printit using printer interface
		ref.printit("Hello, this is printed on the printer");
		
		//disconnect after printing
		ref.disconnect();
	}

}
