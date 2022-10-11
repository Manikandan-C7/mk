package Assignment;

public class MovingRight {
	void MoveRight(int a[]) {
		int change=a[0];
		int i;
		for( i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[4]=change;
		
		
	}

	public static void main(String[] args) {
		//17,18. MOVING ALL ELEMENTS TOWARDS RIGHT(TWICE) IN AN GIVEN ARRAY
		
		
		int a[]= {10,20,30,40,50}; // 20 30 40 50 10
		MovingRight right=new MovingRight();
		right.MoveRight(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(i+"--->"+a[i]);
		}
		
		
		
		

	}

}
