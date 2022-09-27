package mk;

public class FindingFirst20prime {

	public static void main(String[] args) {
		//Finding First 20 Prime number
		int Num=20;
		for(int i=1;i<=Num;i++) {
			int c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(i);
			}
			
		}

	}

}
