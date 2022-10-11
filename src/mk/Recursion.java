package mk;

public class Recursion {
	
	
	
	void m1(int n) {
		System.out.println(n);
		n++;
		if(n<=5) {
			m1(n);// Calling the same method in that method..
		}
		System.out.println(n);//it is in pending 
	   }
	public static void main(String[] args) {
		// RECURSION
		Recursion r=new Recursion();
		r.m1(1);

	}

}
