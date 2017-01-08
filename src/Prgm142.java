//WAP that shows the use of throw clause for throwing the NullPointerException.

class Sample_142{
	static void demo(){
		
		try{
			System.out.println("Inside demo()");
			throw new NullPointerException("Exception data");
		}
		
		catch(NullPointerException ne){
			System.out.println(ne);
		}
	}
}
class Prgm142 {
	public static void main(String args[]){
		Sample_142.demo();
	}
}
