// WAP that shows the use of Date class.


import java.util.*;
import java.text.*;
class Prgm161 {
	public static void main(String args[]){
		
//		create date class object- this contains system date and time
		Date d= new Date();
		
//		Format the date to medium format and time to short fromat
		DateFormat fmt= DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,Locale.UK);
		
//		Apply the above format to the date object
		String str = fmt.format(d);
		
//		NOW display the formatted date and time
		System.out.println(str);
		
	}
}
