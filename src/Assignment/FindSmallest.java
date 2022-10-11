package Assignment;

public class FindSmallest {
	
	int smallest(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<max) {
				max=a[i];
				
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		// FINDING SMALLEST NUMBER IN GIVEN ARRAY
		int a[]= {10,3,7,20};
		FindSmallest small=new FindSmallest();
		int store=small.smallest(a);
		System.out.println(store);
		

	}

}
