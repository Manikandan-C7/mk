package Assignment;

public class FindBiggest {
	  
	     int Largest(int a[]) {
	    	 int max=a[0];
	    	 for(int i=0;i<a.length;i++) {
	    		 if(a[i]>max) {
	    			 max=a[i];
	    		 }
	    	 }
			return max;
	    	 
	    	 
	     }

	public static void main(String[] args) {
		//FINDING BIGGEST NUMBER IN GIVEN ARRAY
		int a[]= {10,20,60,30,50};
		FindBiggest large=new  FindBiggest();
		 int store =large.Largest(a);	
		 System.out.println(store);
		
		
		
		
	}

}
