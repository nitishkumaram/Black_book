//WAP for calculating and displaying area of a circle. The area is formatted to have 7 maximum integer digits and 2 minimum fraction
// digits.

import java.text.*;
class Prgm81 {

	public static void main(String args[]){
		final double PI = (double)22/7;
		double r= 15.5;
		double area= PI*r*r;
		System.out.println("Area= "+area);
		
		//create NumberFormat class object
		NumberFormat obj = NumberFormat.getNumberInstance();
		
		//store the format information into obj
		obj.setMaximumFractionDigits(2);
		obj.setMaximumIntegerDigits(7);
		
		//apply the format to area value
		String str= obj.format(area);
		
		//display formated area value
		System.out.println("Formatted area= "+ str);
	}
}
