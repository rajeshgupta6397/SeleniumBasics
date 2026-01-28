package selenium.vtiger;

import org.openqa.selenium.By;

public class Condition {

	public static void main(String[] args) {
//		validateUserName();
//		officeSystem();
//		studentMark();
		emailVarification();
	}
	public static void validateUserName() {
		String actualUserName="Admin";
		String expectedUserName="admin";
		if(actualUserName.equalsIgnoreCase(expectedUserName)) {
			System.out.println("User name is Passed!");
			
		}else {
			System.out.println("User name is Failed!");
		}
		if(actualUserName.equals(expectedUserName)) {
			System.out.println("User name is Passed!");
			
		}else {
			System.out.println("User name is Failed!");
		}
	}
	public static void officeSystem() {
		String workingDay="Monday";
		if(workingDay.equals("Monday")) {
			System.out.println("Weekday- Work Hard");
		}else {
			System.out.println("Holiday - Relax");
		}
		if(workingDay.equals("Sunday")) {
			System.out.println("Weekday- Work Hard");
		}else {
			System.out.println("Holiday - Relax");
		}
	}
	public static void studentMark() {
		int passingMark=40;
		if(passingMark<=39) {
			System.out.println("Student is Passed!");
			
		}else {
			System.out.println("Student is Failed!");
		}
	}
 public static void emailVarification() {
	 String actualgmail="Test@Gmail.com";
	 String expectedGmail="test@gmail.com";
	 if(actualgmail.equalsIgnoreCase(expectedGmail)) {
		 System.out.println("mail is metched");
	 }else {
		 System.out.println("mail is not metched");
	 }
	 if (actualgmail.equals(expectedGmail)) {
		 System.out.println("mail is pass");
	 
 }else {
	 System.out.println("mail is fail");
 }
      
}
}