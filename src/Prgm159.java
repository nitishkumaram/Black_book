// WAP that shows the use of StringTokenizer object.

import java.util.*;
class Prgm159 {

	public static void main(String args[]){
		
//		take a string
		String str= "He is a gentle man";
		
//		break into tokens at spaces. Here delimeter is a space
		StringTokenizer st= new StringTokenizer(str," ");
		
//		retrieve tokens from st and display
		System.out.println("The tokens are: ");
		
		while(st.hasMoreTokens()){
			
			String one=st.nextToken();
			System.out.println(one);
		}
	}
}
