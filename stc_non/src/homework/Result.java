package homework;

public class Result {

	public static void main(String[] args) {
     
	 Student ra =new Student();
     ra.studentName="Rajesh Gupta";
     ra.marks=85;
     Student.totalStudent++;
     Student.schoolName="EVA";
     ra.display();

     Student.changeSchool("OM");
     
     Student r= new Student();
     r.studentName="Rakesh Gupta";
     r.marks=75;
     Student.totalStudent++;
     r.display();
     
     Student.changeSchool("Expert Viev Automation");
     Student raj=new Student();
     raj.studentName="Rupesh";
     raj.marks=78;
     Student.totalStudent++;
     raj.display();
     System.out.println("Total student  ="+Student.totalStudent); 
	}
  
}
