package Assignment;

import java.util.Arrays;

public class Adjacent {
	    int b[]=new int[4];
	    int sum=0;
	    void arr(int a[]) {
	    	for(int i=0;i<a.length-1;i++) {
	    		
	    			sum=a[i]-a[i+1];
	    			b[i]=sum;
	    			System.out.println(b[i]);
	    		}
	    	
	    	}
	    
	    


	public static void main(String[] args) {
		// PRINTING VALUES BETWEEN ADJACENT TWO ELEMENTS IN A GIVEN ARRAY
	  int a[]= {10,20,30,40,50};
	  Adjacent ad=new Adjacent();
	  ad.arr(a);
	  

	}

}
