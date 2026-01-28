package stc_non;

public class Student1 {

	static String schoolName="Expert view Automation";
	static int totalStudent;
	 
	String studentName;
	int marks;
	
	public void display() {
		System.out.println("SchoolName  -"+schoolName);
		System.out.println("StudentName ="+studentName );
		System.out.println(" Marks ="+marks);
		System.out.println("totalStudent  "+totalStudent);
		
		 System.out.println("------------------------------");
		
		
		}
		
			static void changeSchool(String newSchool) {
			schoolName=newSchool;
		}

	}


