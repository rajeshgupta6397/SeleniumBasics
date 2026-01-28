package homework;

public class Student {
  static String schoolName;
  static int totalStudent;
  
  int marks;
  String studentName;
  
  public void display() {
	  System.out.println("schoolName ="+schoolName);
	  System.out.println("studentName ="+studentName);
      System.out.println("marks ="+marks);
      System.out.println("totalStudent ="+totalStudent);
      
       System.out.println("------------------");
  }
     public static void changeSchool(String newSchool) {
    	 schoolName =newSchool;
      
     }
  }  


