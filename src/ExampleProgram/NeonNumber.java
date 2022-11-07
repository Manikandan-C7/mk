package ExampleProgram;

public class NeonNumber {
	 
	void findNeon(int num,int num2) {
		int sum=0;
		int neon=num*num;
		
		while(neon>0) {
			sum=sum+neon%10;
			neon=neon/10;
		}
		System.out.println(sum);

		if(num2==sum) {
			System.out.println("neon");
		}
		else {
			System.out.println("not neon");
		}
		
	
	}
	public static void main(String[] args) {
		NeonNumber n=new NeonNumber();
		n.findNeon(9,9);	
		}
	
	}




