package Assignment;

public class MovingElement15 {
	
	void movingleft(int a[]) {
		int change=a[5];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
			}
		a[0]=change;
		
}
	public static void main(String[] args) {
		// 15.MOVING ALL ELEMENTS TOWARDS LEFT IN AN ARRAY  (&&)left twice
		int a[]= {10,20,30,40,50,60};   // 60 10 20 30 40 50
		MovingElement15 left=new MovingElement15();
		left.movingleft(a);
		left.movingleft(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(i+"--->"+a[i]);
		}

	}

}
