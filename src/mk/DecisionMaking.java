package mk;

public class DecisionMaking {

	public static void main(String[] args) {
		//Check the age limit to vote
		int ageOfperson = 17;
		
		
		if(ageOfperson>=18) {
		System.out.println("your age is eligible to vote");
		}
		else
			System.out.println("your age is not eliglible to vote,it must be more than or equal to 18 ..");
	
	
	
	//Check the age limit to bought the loan
	int age= 50;
	
	
	if(age>=18 && age<=60) {
	System.out.println("Loan is eligible ");
	}
	else
		System.out.println("your age is not eliglible to take loan.");

    
    //Check Add or EVEN
	int a = 10;
	
	if(a%2==0) {
		System.out.println("Its even ");
	}
	else
		System.out.println("Its odd.");

	//Check positive or negative
	int num =-10;
	
	if(num>=0 ) {
		System.out.println("Its positive ");
	}
	else
		System.out.println("Its negative.");
	
	
	
	
	
}


}
