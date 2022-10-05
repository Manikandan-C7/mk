package mk;

public class LargestArray {
	  
	   
	  int largest(int a[]) {
		  int max=a[0];
		  for(int i=0;i<a.length;i++) {
			  if(a[i]>max) {
				  max=a[i];
			  }
		  }
		return max;
		
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,50,40,10};
		LargestArray la=new LargestArray();
		int store=la.largest(a);
		System.out.println(store);

	}

}
