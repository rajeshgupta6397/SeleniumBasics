package myPractice;

public class StudentClass {
	String StudentName;
	int StudentAge =17;
	
	String StudentName1; 
    int StudentAge1=21;
    
	public static void main(String[] args) {
		StudentClass stu1=new StudentClass();
		StudentClass stu2=new StudentClass();
		
	stu1.StudentName="Aman";
	stu1.StudentAge=17;
	System.out.println("Student Name ="+stu1.StudentName+"  Student age=="+stu1.StudentAge);
	
	stu2.StudentName1="Riya";
	stu2.StudentAge1=21;
	
	System.out.println("Student Name ="+stu2.StudentName1+"  Student age ="+stu2.StudentAge1);
	}
}
	
		
	
 

