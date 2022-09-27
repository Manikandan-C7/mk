package mk;

public class PrintingAssign14 {

	public static void main(String[] args) {
		// Finding Prime Number
		int num=11;
		int c = 0;
		for( int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==1 || c==2) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("NOT PRIME");
		}
		
			
		
		}

	}


