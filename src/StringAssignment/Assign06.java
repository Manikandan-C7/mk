package StringAssignment;

public class Assign06 {

	public static void main(String[] args) {
		// PRINTING ONLY THE NUMBERS PRESENT IN A STRING
		
		//Ascii values for 0-9 is 48 ---57
		
		String pincode="Chennai600028";
		
		char []printnum=pincode.toCharArray();
		
		int count=0;
		for(int i=0;i<printnum.length;i++) {
			
			if(printnum[i]>=48 && printnum[i]<=57) {
				count++;
				System.out.println(printnum[i]);
			}
			
		}
		
		if(count>0) {
			System.out.println("String has num");
		}
		else {
			System.out.println("string has no num");
		}

			}
			
		}
		

	


