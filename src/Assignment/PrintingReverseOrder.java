package Assignment;

import java.util.Arrays;

public class PrintingReverseOrder {
	void reverse(int a[]) {
		for (int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		//Printing Reverse order
		int a[]= {10,20,30,40,50};
		PrintingReverseOrder ro=new PrintingReverseOrder();
		ro.reverse(a);
		
	}

}
