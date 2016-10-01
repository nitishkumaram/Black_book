/* WAP to use a break statement (page 58) */
public class Prgm14
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		boolean x = true;
		bl1: {
			bl2:{
				bl3:{
					System.out.println("Block 3");
					if(x) break bl2;	//got to end of bl2
					}
			System.out.println("Block 2");
				}
		System.out.println("Block 1");
		}
	System.out.println("Out of all bolocks");
	}
}

//if(x) break b12;  This represent going to end of the block, named b12.