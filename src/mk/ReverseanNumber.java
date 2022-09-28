package mk;

public class ReverseanNumber {

	public static void main(String[] args) {
		// REVERSE A NUMBER
		int Num=7891;
		int reverse=0;
		while(Num!=0) {
			int Rem=Num%10;
			 reverse=reverse*10+Rem;
			 Num=Num/10;
			 
		}
		System.out.println(reverse);
		
		
		
		

	}

}
