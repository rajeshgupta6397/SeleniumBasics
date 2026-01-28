package interviewQuestion;

public class RegultInterview {

	public static void main(String[] args) {
		marks(45);

	}
     public static void marks(int marks) {
    	 if(marks>=80) {
    		 System.out.println("Grate a"+marks);
    	 }else if(marks>=75) {
    		 System.out.println("Grate B"+marks);
    	 }else if(marks>=45) {
    		System.out.println("Grade C"+marks); 
    	 }else {
    		 System.out.println("Fail");
    	 }
     }
}
