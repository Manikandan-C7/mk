package mk;

public class MaxFinding {
	    int max(int a,int b,int c) {
	    	if((a>b) && (a>c) ) {
	    		return a;
	    	}
	    	else if(b>c) {
	    		return b;
	    	}
	    	else{
	    		return c;
	    	}
			
	    }

	public static void main(String[] args) {
		// MAXFINDING VALUE PASSING  IN PARAMETERIZIED..
		MaxFinding mf=new MaxFinding();
		int store=
	mf.max(10,20,30);
		System.out.println("The max number is :"+store);
		
	}

}
