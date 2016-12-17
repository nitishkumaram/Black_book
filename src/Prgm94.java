//WAP to understand private members are not accessible in sub class, but protected members are available in sub class.

class Access94{
	private int a;
	protected int b;
}

class Sub94 extends Access94{
	public void get(){
		//error-a is private		System.out.println(a);	
		System.out.println(b);
	}
}
class Prgm94 {
	public static void main(String args[]){
		
		Sub94 s=new Sub94();
		s.get();
	}

}
