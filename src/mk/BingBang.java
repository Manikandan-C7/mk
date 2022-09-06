package mk;

public class BingBang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		if(n%3==0 && n%5==0) {
			System.out.println("Bing Bang");
		}
		else if(n%3==0) {
			System.out.println("Bing");
			
		}
		else if( n%5==0) {
			System.out.println(" Bang");
		}
		else if(!(n%3==0 && n%5==0) ) {
			System.out.println(n);
		}

	}

}
