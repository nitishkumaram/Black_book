//Write a program to create a push button and add it to a frame /page 174/ Prgrm86


import java.awt.*; //for button
import java.awt.event.*; //for ActionListener

class But extends Frame {
	But(){
		
		//create a push button
		Button b=new Button("OK");
		//add push button to frame
		add(b);
		
		//add action listener to button
		//Myclass is implementation class of ActionListener interface
		b.addActionListener(new Myclass());
	}
		public static void main(String args[]){
			
			//create a frame by creating But class object
			But obj= new But();
			
			//set the size of frame to width: 400px and height : 300px
			obj.setSize(400,300);
			
			//display the frame
			obj.setVisible(true);
		}
}

//Myclass should implement the method of ActionListener

class Myclass implements ActionListener{
	
	//this method is executed when button is clicked
	public void actionPerformed(ActionEvent ae){
		
		//exit the application
		System.exit(0);
	}
}
