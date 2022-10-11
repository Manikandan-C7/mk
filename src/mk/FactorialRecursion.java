package mk;

public class FactorialRecursion {
	int sum=1;
	int i=1;
	void Factorial() { //using instance variable
		i++;
		if(i<=5) {
			sum=sum*i;
			Factorial();
		}
		
	}
	int  factoriallv(int n) {
		if(n>1) {
		int f=factoriallv(n-1);	
		return n*f;
		}
		else {
		return 1;
		}	
	}

	public static void main(String[] args) {
		// FACTORIAL RECURSION
		FactorialRecursion fr=new FactorialRecursion();
	    fr.Factorial();
	    System.out.println(fr.sum);
	    
	  int store=fr.factoriallv(6);
	  System.out.println(store);
	   
	    
	   
	    

	}

}
