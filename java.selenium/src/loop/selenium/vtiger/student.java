package selenium.vtiger;



public class student {
	static String Schoolname="Eva";
	String StudentName;
	
	
	
    public static void main(String[] args) {
    	student stu1=new student();
    	stu1.StudentName="ram";
    	stu1.display();
    	
    	student stu2=new student();
    	stu2.StudentName="rajesh";
    	stu2.display();
    	
    	student stu3=new student();
    	stu3.StudentName="shyam";
    	stu3.display();
      
	}

	public void display() {
		
		System.out.println("Name "+StudentName+" School "+Schoolname);
	}
	 
}
	

