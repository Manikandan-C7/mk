package Assignment;

public class FindingNegative {
	void Negative(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.println("The Negative Numbers is : "+a[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// 21.FINDING ONLY NEGATIVE NUMBERS IN GIVEN ARRAY..
		int a[]= {10,-2,-6,7,-8};
		FindingNegative negative=new FindingNegative();
		negative.Negative(a);
		

	}

}
