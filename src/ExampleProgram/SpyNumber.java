package ExampleProgram;

public class SpyNumber {
	    void Spy(int num,int num2) {
	    	int sum=0;
	    	int product=1;
	    	while(num>0) {
	    		sum=sum+num%10;
	    		product=product*num%10;
	    		num=num/10;
	    	}
	    	System.out.println(sum);
	    	System.out.println(product);
	    	if(sum==product) {
	    		System.out.println("Spy number");
	    	}
	    	else {
	    		System.out.println("Not a Spy");
	    	}
	    	
	    }
 public static void main (String args[]) {
	 SpyNumber sp=new SpyNumber();
	 sp.Spy(132, 132);
 
}
}
