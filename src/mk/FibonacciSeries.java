package mk;

public class FibonacciSeries {

	public static void main(String[] args) {
		//FINONACCI SERIES
		int n1=-1;
		int n2=1;
		for(int i=1;i<=8;i++) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			
		}
		

	}

}
