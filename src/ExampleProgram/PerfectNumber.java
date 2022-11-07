package ExampleProgram;

public class PerfectNumber {
	
	void findPerfect(int num) {
		int div=1;
		int sum=0;
		while(div<num) {
			if(num%div==0) {
				sum=sum+div;
			}
			div=div+1;
		}
		if(num==sum) 
		{
			System.out.println("Perfect");
		}
		else
		
		{
			System.out.println("Not perfect");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumber pn=new PerfectNumber();
		pn.findPerfect(6);
	}
}
