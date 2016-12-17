//WAP to by taking Myclass as an anonymous inner class whose name is not mentioned in the But class's addActionListener() method.

import java.awt.*;
import java.awt.event.*;
class Prgm87 {

	static class But extends Frame{
		
		But(){
			//create a push button b
			Button b= new Button("OK");
			
			//add push button to frame
			add(b);
			
			//add action listener to button.
			//Myclass is hidden inner class of ActionListener interface,
			//whose name is not written but an object to it created
			b.addActionListener(new ActionListener() {
				
				//this method is executed when button is clicked
				public void actionPerformed(ActionEvent ae) {
					
					//exit the application
					System.exit(0);
					
				}
			});
		}
		public static void main(String args[]){
			
			//create frame by creating But class object
			But obj= new But();
			
			//set the size of frame to width: 400px and height: 300px
			obj.setSize(400,300);
			//display the frame
			obj.setVisible(true);
		}
	}
}

		
