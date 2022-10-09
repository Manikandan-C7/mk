package Assignment;

public class PlacingNumber {
	      
	  void givenNumber(int a[]) {
		  int store=50;
		  int pos=a[4];
		  for(int i=0;i<a.length;i++) {
			  if(a[i]==pos) {
				  System.out.println(store);
			  }
			  System.out.println(a[i]);
		  }
	
		 
	  }

	public static void main(String[] args) {
		// PLACING GIVEN NUMBER IN LAST INDEX OF GIVEN ARRAY
		int a[]= {10,20,30,40,60};
		
		PlacingNumber pn=new PlacingNumber();
		pn.givenNumber(a);
		
		
	}

	}


