package mk;

public class Maths {
	int a;
	int b;
	void add() {
		System.out.println("The addition of a and b is: "+(a+b));
	}
	void sub() {
		System.out.println("The Subtraction of a and b is: "+ (a-b));
	}
	void mul () {
		System.out.println("The Multiplication of a and b is: "+(a*b));
	}
	void div () {
		System.out.println("The Division of a and b is: "+(a/b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m1=new Maths();
		m1.a=10;
		m1.b=5;
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();       
	}

}
