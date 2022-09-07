package mk;

public class FindLargest {

	public static void main(String[] args) {
		int a=15;
		int b=10;
		if(a>b) {
			System.out.println("A is largest number");
		}
		else if(a<b) {
			System.out.println("B is largest number");
		}
		else {
			System.out.println("A and B is Equal");
		}
	////
		int a1=15;
		int b1=10;
		int c1 =200;
		if((a1>b1)&&(a1>c1)) // compare a and b  , a and c
		{
			System.out.println("A is the largest number");
		}
		else if(b1>c1){
			System.out.println("B is the largest number");	
		}
		else {
			System.out.println("C is the largest number");	
		}

	}

}
