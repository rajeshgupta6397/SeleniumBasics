package myPractice;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Alerthading2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/");
		Actions act=new Actions(driver);
	    List <WebElement> we_UserName=driver.findElements(By.xpath("//div[@class='input']"));
		for(int i=0;i<we_UserName.size();i++) {
			WebElement sas=we_UserName.get(i);
			act.sendKeys(sas, "admin").build().perform();
			
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin"+Keys.TAB+"admin"+Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		
//		driver.findElement(By.xpath("//input[@value='  Cancel  ']/preceding-sibling::input[@value='  Save  ']")).click();
//		Alert returnAlert= driver.switchTo().alert();
//		System.out.println(returnAlert.getText());
//		returnAlert.accept();
		
//	driver.get("http://localhost:8888");	
//    Actions returnAction= new Actions(driver);
//	List<WebElement>we_UserName= driver.findElements(By.xpath("//div[@class='input']"));
//	for(int i=0;i<we_UserName.size();i++) {
//	WebElement webeReturn=	we_UserName.get(i);
//	Thread.sleep(2000);
//	returnAction.sendKeys(webeReturn,"admin").build().perform();	
	}
	
		}
	    
	}


