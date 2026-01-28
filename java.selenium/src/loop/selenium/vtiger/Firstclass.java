package selenium.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass {

	public static void main(String[] args)  {
		VerifytLeadCreationFuncelity();
		//  equalmethad();
		//eqalsizeCase();

	}

	public static void VerifytLeadCreationFuncelity()  {

		ChromeDriver driver=	new ChromeDriver();
		driver.get("http://localhost:8888/");
		String exceptedTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exceptedTitle)) {
			System.out.println("exceptedTitle and actualtitle should be same---pass");	
		}
		else {
			System.out.println("exceptedTitle and actealtitle should not be same---fail");
		}
		WebElement wename =driver.findElement(By.xpath("//input[@name='user_name']"));
		//Thread.sleep(1000);
		//if(wename.isDisplayed() && wename.isEnabled()){
		if(wename.isDisplayed()) {
			System.out.println("Username is visible and enable Passed");
		}else {
			System.out.println("Username is not visible and enable Failed");
	    if(wename.isEnabled()) {
	     System.out.println("username should be enable in textbox---passed");
	    }else {
	    	 System.out.println("username should not be enable in textbox---failed");
	    }
		String stringval=	wename.getAttribute("value");
		if(stringval.equals("")) {
			System.out.println("user name text box is blank---pass");
		}
		else {
			System.out.println("user name text box is field with blank --faild");
		}
		wename.sendKeys("admin");

		String actualusername= wename.getAttribute("value");
		String expectedusername="admin";
		if(actualusername.equalsIgnoreCase(expectedusername)) {
			System.out.println("actualusername and expectedusername are mathed ...passed");
		}else {
			System.out.println("actualusername and expectedusername are not mathed ...passed");
		}

		WebElement password =driver.findElement(By.xpath("//input[@name='user_password']"));

		if(password.isDisplayed() && password.isEnabled()) {
			System.out.println("Password box is visible and enabled Passed");
		}else {
			System.out.println("Password box is not visible and enabled Failed");
		}
		password.sendKeys("admin");
		WebElement weSumitButton =  driver.findElement(By.xpath("//input[@id='submitButton']"));

		if(weSumitButton.isDisplayed()&& weSumitButton.isEnabled()) {
			System.out.println("SubmitButton box is visible and enable Clecked");
		}else {
			System.out.println("SubmitButton box is not visible and enable Clecked");
		}
		weSumitButton.click();



		WebElement weHomePage= driver.findElement(By.xpath("//a[@href='index.php?action=index&module=Home']"));

		if(weHomePage.isDisplayed()) {
			System.out.println("HomePage is visiable");
		}else {
			System.out.println("HomePage is not visiable");
		}
		//			  
		//				 public static void equalmethad() {
		//					 
		//					 String name1 ="Rajesh";
		//					 String name2 ="RAJESH";
		//					 
		//					 if(name1.equalsIgnoreCase(name2)) {
		//						 System.out.println("matched");
		//					 }
		//					 else {
		//						 System.out.println("Not matched");
		//					 }

		//			 public static void eqalsizeCase(){
		//				 
		//				 String name="Rajesh";
		//				 String name1="Kumar";
		//				 
		//				 if (name.equals(name1)) {
		//					 System.out.println("matched");
		//				
		//				 }
		//				 else {
		//					 System.out.println("Not Matched");
		//					 
		//				 }

		}


	}
}
