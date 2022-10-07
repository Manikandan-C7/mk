package Assignment;

public class ElementPresent {
	void display(int a[]) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==a[0]) {
				count++;
			}
			
		}
		System.out.println("The count is : "+count);
	}

	public static void main(String[] args) {
		// HOW MANY TIMES A GIVEN ELEMENT IS PRESENT
		
		int a[]= {2,4,7,2,3,2 };
		ElementPresent ep=new ElementPresent();
		ep.display(a);
		

	}

}
