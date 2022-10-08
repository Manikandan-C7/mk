package mk;

public class MethodCalling {
	int n=1;
	
	void m1() {
		System.out.println(n);
		n++;
		m2();
		System.out.println("kumarvell");
	}
	void m2() {
		System.out.println(n);
		n++;
		m3();
	}
	void m3() {
		System.out.println(n);
		n++;
		m4();
	}
	void m4() {
		System.out.println(n);
		n++;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCalling mc =new MethodCalling();
		mc.m1();
	

	}

}
