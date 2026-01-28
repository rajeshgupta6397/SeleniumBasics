package stc_non;

public class TestCode {

	public static void main(String[] args) {
	
	Student1 obj1=	new Student1();
	obj1.studentName="Rajesh";
	obj1.marks=80;
	Student1.totalStudent++;

	obj1.display();
	Student1.changeSchool("eva");
	Student1 obj2=new Student1();
    obj2.studentName="Shiv";
    obj2.marks=76;
	Student1.totalStudent++;
	
	obj2.display();
	
	
	
	
	}
   
}
