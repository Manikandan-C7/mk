package Assignment;

public class FirsttwoBiggest {
	 void Biggest(int a[]) {
		 int max=0;
		 int max2=0; 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]>max) {
				
				 max2=max;
				 max=a[i];
				 
			 }
			 if((a[i]!=max && a[i]>max2)){
				 max2=a[i];
			 }
			
 
		 }
		 System.out.println("The First Maximum number is : "+max);
		 System.out.println("The Second Maximum number is :"+max2);
		 
	
	 }
		 
	 
	public static void main(String[] args) {
		//11.FINDING FIRST TWO BIGGEST NUMBERS IN GIVEN ARRAY
		int a[]= {770,390,480,100,200,};
		
		FirsttwoBiggest large=new FirsttwoBiggest();
		large.Biggest(a);
		

	}

}
