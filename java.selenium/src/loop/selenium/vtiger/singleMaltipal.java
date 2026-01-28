package selenium.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class singleMaltipal {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://localhost:8888/");
	
	WebElement weUserName= driver.findElement(By.xpath("//input[@name='user_name']"));
	weUserName.sendKeys("admin");
	String obj= weUserName.getAttribute("type");
	System.out.println(obj);

	//driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	
	//driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	
	
//	WebElement lead=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
//	lead.click();
//	
//	
//  WebElement selectionStatus=	driver.findElement(By.xpath("//input[@name='selectall']"));
//  boolean selectChakbox= selectionStatus.isSelected();
//  System.out.println("Chakbox should be validation ---passed"+selectChakbox);





//	WebElement dropdown=driver.findElement(By.xpath("(//select[@id='bas_searchfield'])[1]"));
//	Select selobj=new Select(dropdown);
//	WebElement we=selobj.getFirstSelectedOption();
//	
//	
//	
//	String Expected_text="Lead No";
//	
//	String Acutaltext=we.getText();
//	System.out.println(Acutaltext);
//	
//	if(Acutaltext.equals(Expected_text)) {
//		System.out.println("Expected_text and Acutaltext are matched..... validation is passed");
//	}else {
//		System.out.println("Expected_text and Acutaltext are not matched..... validation is Failed");
//	}
//	
//	selobj.selectByIndex(3);
//  
//   WebElement dropDown= driver.findElement(By.xpath("(//select[@name='search_field'])[1]"));
//  Select selobjD= new Select(dropDown);
// WebElement we_getFirst_SelOpt= selobjD.getFirstSelectedOption();
// 
// String expectedText="Lead No";
// String Actualtext= we_getFirst_SelOpt.getText();
//   System.out.println(Actualtext);
// 
//  if(Actualtext.equalsIgnoreCase(expectedText)) {
//	  System.out.println("Actualtext and expectedText dropdown should be same ----passed");
//  }else {
//	  System.out.println("Actualtext and expectedText are not same ----failed");
//  }
//  selobjD.selectByIndex(4);
//  
	}

}
