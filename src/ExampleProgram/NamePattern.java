package ExampleProgram;

public class NamePattern {
	   
	 void PatternM() {
	     	for(int row=1;row<=7;row++)
	     	{
	     	for(int col=1;col<=7;col++) {
	     		if( (col==1 || col==7)||(row==1 && col==1)||(row==3 && col==2) ||(row==5 && col==3)||(row==7 && col==4)||(col==5 && row==5)||(col==6 && row==3)||(col==7 &&row==1)) {
	     			System.out.print("* ");
	     		}
	     		else {
	     			System.out.print("  ");
	     		}
	     		
	     	}
	     	System.out.println();
	     }}
	 
	 void PatternA() {
		 
		 for(int row=1;row<=7;row++) {
		 for(int col=1;col<=7;col++) {
			 if((row==1 || row==4||(col==1 || col==7))) {
				 System.out.print("* ");
			 }
			 else {
				 System.out.print("  ");
			 } 
		 }
		 System.out.println();
	 }
	 }
	
	 
	 void PatternN() {
		 for(int row=1;row<=7;row++){
		 for(int col=1;col<=7;col++) {
			 if((col==1 || col==7)||(row==col)) {
				 System.out.print("* ");
			 }
			 else {
				 System.out.print("  ");
			 }
		 }
		 System.out.println();
	 }
	 }
	 
	 void PatternI() {
		 
		 for(int row=1;row<=7;row++){
		 for(int col=1;col<=7;col++) {
			 if((row==1 || row==7)||(col==4)) {
				 System.out.print("* ");
			 }
			 else {
				 System.out.print("  ");
			 }
		 }
		 
		 System.out.println();
	 }}

	public static void main(String[] args) {
      
		NamePattern Mani=new NamePattern();
		Mani.PatternM();
		System.out.println();
		System.out.println();
		Mani.PatternA();
		System.out.println();
		System.out.println();
		Mani.PatternN();
		System.out.println();
		System.out.println();
		Mani.PatternI();
		
		

		
		
		
		
	}

}
