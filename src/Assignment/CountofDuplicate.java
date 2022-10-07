package Assignment;

public class CountofDuplicate {
	  void duplicate(int a[]) {
		  int count=-1;
		  
		  for(int i=0;i<a.length;i++) {
			  if(a[i]==a[0]) {
				  count++;
			  }
			  
		  }
		  System.out.println("The count is : "+count);
		 
		  
		  
	  }
	

	public static void main(String[] args) {
		// FINDING COUNT OF DUPLICATE ELEMENTS IN AN ARRAY
		int a[]= {10,40,10,40,10};
       CountofDuplicate  cd=new CountofDuplicate();
       cd.duplicate(a);
	}

}
