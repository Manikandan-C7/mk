package mk;

public class Student {
	String studentName;
	int rollNo;
	int Mark;
	char grade;
	
	void setGrade() {
		if(Mark>=91) {
		    grade='A';
		}
		else if(Mark>=81){
			grade='B';
		}
		else if(Mark>=71) {
			grade='C';
		}
		else if (Mark>=61) {
			grade='D';
		}
		else if(Mark>=51) {
			grade='E';
		}
		else if (Mark<50) {
			grade='F';
		}
	}
	public static void main(String[] args) {
		//FINDING GRADE FOR MARK...
		Student Abdul=new Student();
		Abdul.studentName="Abdul Rahuman";
		Abdul.rollNo=01;
		Abdul.Mark=100;
		Abdul.setGrade();
		System.out.println("The Grade of Abdul is :"+Abdul.grade);
		
		
		System.out.println(" ");
		
		Student Bharath=new Student();
		Bharath.studentName="Bharath Vaj";
		Bharath.rollNo=02;
		Bharath.Mark=40;
		Bharath.setGrade();
		System.out.println("The Grade of Bharath is :"+Bharath.grade);
		
		

	}

}
