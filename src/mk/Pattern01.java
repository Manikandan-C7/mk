package mk;

public class Pattern01 {
	public static void main(String args[]) {
		int row, coloumn = 1;
		for (row = 1; row <= 4; row++) 
		{
			for (coloumn = 1; coloumn <= 4; coloumn++) 
			{
				if (row == 1 || row == 4 || coloumn == 1 || coloumn == 4)
				{
					System.out.print(" * ");

				}
				else
				{
				System.out.print("   ");
				}
			}
			System.out.println(" ");
		}
		
	}
}
/*
 
 
* * * * 
*     * 
*     *
* * * *
 
 

*/