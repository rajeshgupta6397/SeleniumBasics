package selenium.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	//span[text()='Next']

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
//   driver.get("https://workspace.google.com/intl/en-US/gmail/");
//  WebElement weSignIN= driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
//  weSignIN.click();
//  WebElement weEmailTB=driver.findElement(By.xpath("//input[@type='email']"));
//  weEmailTB.sendKeys("rajeshgupta6397@gmail.com");
//  WebElement weNextBT= driver.findElement(By.xpath("//span[text()='Next']"));
//  weNextBT.click();
//	
     
      driver.get("http://localhost:8888/");
   WebElement weuser = driver.findElement(By.xpath("//input[@name='user_name']"));
   weuser.sendKeys("admin");
   
  WebElement wepass= driver.findElement(By.xpath("//input[@name='user_password']"));
  wepass.sendKeys("admin");
  
 WebElement welogin= driver.findElement(By.xpath("//input[@id='submitButton']"));
 welogin.click();
	}

}
