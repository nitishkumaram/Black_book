// WAP that shows the use of calendar class

import java.util.*;
class Prgm160 {

	public static void main(String args[]){
		
//		create Calendar class object. By default it contains system date and time.
		Calendar cl= Calendar.getInstance();
		
//		display date separately
		System.out.println("Current Date: ");
		int dd=cl.get(Calendar.DATE);
		int mm=cl.get(Calendar.MONTH);
		int yy=cl.get(Calendar.YEAR);
		System.out.println(dd+"-"+mm+"-"+yy);
		
//		Display time alone
		System.out.println("Current time");
		int hr=cl.get(Calendar.HOUR);
		int min=cl.get(Calendar.MINUTE);
		int sec=cl.get(Calendar.SECOND);
		System.out.println(hr+":"+min+":"+sec);
		
//		Get AM PM
		int ampm=cl.get(Calendar.AM_PM);
		if(ampm==0){
			System.out.println("Good Morning");
		}
		else	System.out.println("Good Evening");
	}
}
