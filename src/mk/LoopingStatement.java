package mk;

public class LoopingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int num=56789;
             int add=0;
            while(num>0) { // when the loop end? when the num becomes "0".. The loop end..
        	 int remainder=num%10;
        	 add=add+remainder;
        	 System.out.println(remainder);
        	 num=num/10;
        	 
         }
            System.out.println(add);
        
	}
}
