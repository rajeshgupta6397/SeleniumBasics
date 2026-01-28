package selenium.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrailClass {

	public static void main(String[] args) {
		VerifyCreateLeadFuctionality();

	}

	public static void VerifyCreateLeadFuctionality() {
	ChromeDriver driver=	new ChromeDriver();
	driver.get("http://localhost:8888/");
	String expectedTitle="vtiger CRM 5 - Commercial Open Source CRM";
	String actualTitle= driver.getTitle();
	if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		System.out.println("Actual Title is = "+actualTitle+" Matched with = "+expectedTitle);
		
	}else {
		System.out.println("Actual Title is = "+actualTitle+" not Matched with = "+expectedTitle);
	}
	WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
	boolean actualDisplay=weUserName.isDisplayed();
	if(actualDisplay==true) {
		System.out.println("Element is Visible");
		
	}else {
		System.out.println("Element is not Visible");
	}
	
	
	}
}
