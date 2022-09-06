package mk;

public class SplitThedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5678;
		 if(num>0) {
		  
		  int r=num%10;
          System.out.print(r);   //5678%10=8 
          num=num/10;              //5678/10=567      // int r= Scope of variable only showm in that condtion,then it move to another and it forget the "r".
		 }
		 if(num>0) {
			  
			  int r=num%10;
	          System.out.print(r);   //567%10=7 
	          num=num/10;              //567/10=56
			 }
		 if(num>0) {
			  
			  int r=num%10;
	          System.out.print(r);   //56%10=6 
	          num=num/10;              //56/10=5
			 }
		 if(num>0) {
			  
			  int r=num%10;
	          System.out.print(r);   //5%10=5
	          num=num/10;              //5/10=0
			 }
		 
		 
          
	}

}
