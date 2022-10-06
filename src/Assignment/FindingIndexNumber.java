package Assignment;

public class FindingIndexNumber {
	void indexFind(int a[]) {
		int num=40;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==num) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// FINDING INDEX OF GIVEN NUMBER IN ARRAY
		int a[]= {10,20,30,40,50};
		FindingIndexNumber fn=new FindingIndexNumber();
		fn.indexFind(a);
		
	}

}
