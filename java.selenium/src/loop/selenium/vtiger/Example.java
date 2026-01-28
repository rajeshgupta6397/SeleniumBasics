package selenium.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		
	ChromeDriver driver =new ChromeDriver();
	String url="http://localhost:8888/";
	driver.get(url);
	
	
	By username= By.name("user_name");
	WebElement weusername=
	driver.findElement(username);
	weusername.sendKeys("admin");
	 
	 WebElement wepassword=driver.findElement(By.name("user_password"));
	 wepassword.sendKeys("admin");
	 
	WebElement weSubmitButton= driver.findElement(By.name("submitButton"));
	weSubmitButton.click();
	 
 

	}

}
