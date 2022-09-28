package mk;

public class EBBillCalculator {
	public static void main(String[] args) {
		int unit=530;	
		double cost;
		float rem;
		double total;
	
		if(unit<=100) {
			System.out.println("The EB Bill is :0");
		}
		else if(unit<=200) {
			unit=unit-100;
			System.out.println("The EB Bill is :"+unit*1.5);
		}
		else if(unit<=500) {  //100*0 ,100*2=200(constant)
			rem=unit-200;
			cost=rem*3;
			total= (cost+200);
			System.out.println("The EB Bill is :"+total);
		}
		else if (unit>500){ //100*0,100*3.5=350,300*4.6=1380, total=1750(constant);
			rem=unit-500;
			cost= (rem*6.6);
			total= (cost+1730);
			System.out.println("The EB Bill is :"+total);
		}

	}

}
