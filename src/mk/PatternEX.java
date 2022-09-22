package mk;

public class PatternEX {
	public static void main (String args[]) {
		
		for(int row=1;row<4;row++) {
		for(int coloumn=1;coloumn<=5;coloumn++) {
			int b=coloumn%2;
			if(b==0) {
				System.out.print("2");	
			}
			else {
				System.out.print("1");
			}
                              
		}
		System.out.println();
}
		
		
}
}