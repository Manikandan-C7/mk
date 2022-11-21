package ExampleProgram;
public class ArrayProgram {
	
	void LinearSearch(int marks[]) {
		//int marks[]= {50,30,70,20};
		int mark=40;
		boolean present=false;
		for(int i=0;i<marks.length;i++)
		{
			if(mark==marks[i]) {
				present =true;
				System.out.println("The Value is present :"+i);
				break;
			}
		}
		if(present==false) {
			System.out.println("The value is not present");
		}
		
	}
	
	void Count(int values[]) {
		int num=40;
		int count=0;
		for(int i=0;i<values.length;i++) {
			if(values[i]==num) {
				count++;
			}
			
		}
		System.out.println("The "+num +" is present at "+count+" times in values");
	}
	
	void findmax(int marks[]) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>max1) 
			{
			max2=max1;
			max1=marks[i];
			}
			else if(marks[i]>max2)
			{
				max2=marks[i];
			}	
		}
		System.out.println("The two highest numbers are "+max1+" and "+max2);
		
	}
	
	void reverseorder(int marks[]) {
		int len=marks.length;
		int students[]=new int[len];
		int i=0,j=len-1;
		while(i<marks.length) {
			students[i]=marks[j];
			i++;
			j--;
		}
		for( i=0;i<students.length;i++) {
			System.out.print(students[i]+",");
		}	
	}
	
	void Arr(int a[]) {
		
		for(int  i=0;i<a.length-1;i++)
		{
		int small=a[i]<a[i+1] ? a[i]:a[i+1];
		int big=a[i]>a[i+1] ? a[i]:a[i+1];
		for(i=small;i<=big;i++) 
		{
		System.out.println(i);
		}
		}	
	}
	
	void Repeated_Char(char name[]) {
		    for(int j=0;j<name.length;j++) {
			char ch=name[j];
			int count=0;
			for(int i=0;i<name.length;i++)
			{
				if(name[i]==ch)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("The First Repeated char is : "+ch);
				break;
			}
		    }
            }
		
		 void remove_Element(int Remove[]) {
		    	int num=Remove[2];
		     
		    	for( int i=0;i<Remove.length;i++) 
		    	{
		    		if(Remove[i]==num) {
		    			continue;
		    		}
		    		System.out.println(Remove[i]);
		    	}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ArrayProgram ap=new ArrayProgram();
		int marks[]= {50,30,70,20};
		int values[]= {40,40,10,50,40,30,60,40};
		int a[]= {9,5,13,10};
		char name[]= {'d','a','v','i','d'};
		int Remove[]= {10,20,30,40,50};

	    ap.LinearSearch(marks);
		ap.Count(values);
		ap.findmax(marks);
		ap.reverseorder(marks);
		ap.Arr(a);
		ap.Repeated_Char(name);
		ap.remove_Element(Remove);
		
		
		
}
}
