// WAP for using nested loop to display i and j value

//public class Prgm16 {
//	public static void main(String args[])
//	{
//		for(int i=1;i<11;i++)
//		{
//			for (int j=10;j>0;j--){
//				System.out.println("Value of i= "+i+"\tValue of j= "+j);
//			}
//		}
//	}
//}

public class Prgm16{
	public static void main(String args[]){
		int i=1,j;
		
		 while(i<=3){
			System.out.println(i);
			
		 for(j=1;j<=5;j++){
			System.out.println("\t"+j);
		}
			i++;
			System.out.println("----------------");
		}
	}
}