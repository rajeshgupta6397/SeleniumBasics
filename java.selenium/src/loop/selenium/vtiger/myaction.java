package selenium.vtiger;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myaction {



	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		String ExpectedTitl="vtiger CRM 5 - Commercial Open Source CRM";
		String ActualTitle=driver.getTitle();

		if(ActualTitle.equalsIgnoreCase(ExpectedTitl)) {
			System.out.println("ActualTitle and ExpectedTitl should be same------ passed");
		}else {
			System.out.println("ActualTitle and ExpectedTitl are not matched ---------failed");
		}

		WebElement weuser_name =	driver.findElement(By.xpath("//input[@name='user_name']"));
		if(weuser_name.isDisplayed()) {
			System.out.println("User name should be show----passed");
		}else {
			System.out.println("User name does not show-----failed");
		}
		if(weuser_name.isEnabled()) {
			System.out.println("User name should be enabled----passed");
		}else {
			System.out.println("User name does not enable----failed");
		}weuser_name.sendKeys("admin");
		String strobj= weuser_name.getAttribute("name");
		System.out.println(strobj);

		/////////////////////////////USER NAME//////////////////////////////////////////////////

		WebElement weuserPassword=	driver.findElement(By.xpath("//input[@name='user_password']"));
		if(weuserPassword.isDisplayed()) {
			System.out.println("User password should be show----passed");
		}else {
			System.out.println("User password does not show-----failed");
		}
		if(weuserPassword.isEnabled()) {
			System.out.println("User password should be enabled----passed");
		}else {
			System.out.println("User password does not enable----failed");
		}	weuserPassword.sendKeys("admin");

		///////////////////////////////USER PASSWORD////////////////////////////////////////////

		WebElement wesubmitButton= driver.findElement(By.xpath("//input[@id='submitButton']"));
		if(wesubmitButton.isDisplayed()) {
			System.out.println("Login_Button should be show----passed");
		}else {
			System.out.println("Login_Button does not show-----failed");
		}
		if(wesubmitButton.isEnabled()) {
			System.out.println("Login_Button should be enabled----passed");
		}else {
			System.out.println("Login_ButtonUser password does not enable----failed");
		}wesubmitButton.click();

        ///////////////////////////////////SUBMIT BUTTON//////////////////////////////////////////


		WebElement we_SignOught	=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		if(we_SignOught.isDisplayed()) {
			System.out.println("Sign Ought should be show------passed");
		}else {
			System.out.println("Sign Ought does not show------failed");
		}
		if(we_SignOught.isEnabled()) {
			System.out.println("Sign Ought should be enabled------passed");
		}else {
			System.out.println("Sign Ought does not enabled----failed");
		}
		we_SignOught.click();


		//////////////////////////////////////////////////MyPrefinces///////////////////////////////////////////////////
		WebElement we_MyPrefinces=  driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=DetailView&record=1&modechk=prefview']"));
		if(we_MyPrefinces.isDisplayed()) {
			System.out.println("Myprefinces should be show------passed");
		}else {
			System.out.println("Myprefinces does not show------failed");
		}
		if(we_MyPrefinces.isEnabled()) {
			System.out.println("Myprefinces should be enabled------passed");
		}else {
			System.out.println("Myprefinces does not enabled------failed");
		}
		we_MyPrefinces.click();

		Thread.sleep(2000);
		/////////////////////////////////////SignOut_fron_loginButton/////////////////////////////////////

		WebElement we_SignOut_fron_loginButton=driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']"));
		if (we_SignOut_fron_loginButton.isDisplayed()) {
			System.out.println("SignOut_fron_loginButton should be come back loginButton-----passed");
		}else {
			System.out.println("SignOut_fron_loginButton does not come back loginButton------failed ");
		}
		if(we_SignOut_fron_loginButton.isEnabled()) {
			System.out.println("SignOut_fron_loginButton should be come back loginButton enabled-----passed");
		}else {
			System.out.println("SignOut_fron_loginButton does not come back loginButton enabled-----failed"); 
		}
		we_SignOut_fron_loginButton.click();

	}
       
        
	   
	

}
