package mk;

public class FinonacciSeries2 {

	public static void main(String[] args) {
		// FINONACCI SERIES WITHOUT USING THIRD VARIABLE
		int n1=-1;
		int n2=1;
		for(int i=1;i<=8;i++) {
			
			System.out.println(n1+n2);
			 n2=n1+n2;
			 n1=n2-n1;
		}
		
		
		

	}

}
