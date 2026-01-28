package selenium.vtiger;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;


public class MultipalSelected {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weUsername=	driver.findElement(By.xpath("//input[@name='user_name']"));
		weUsername.sendKeys("admin");
		
		WebElement wePassword= driver.findElement(By.xpath("//input[@name='user_password']"));
		wePassword .sendKeys("admin");
		Thread.sleep(2000);
		
		WebElement weSubmitButton=  driver.findElement(By.id("submitButton"));
		weSubmitButton.click();
		
		List<WebElement>weLink= driver.findElements(By.xpath("//a"));
		int link= weLink.size();
		System.out.println("Total link number: "+link);
		
		List<WebElement>weButton= driver.findElements(By.tagName("//button"));
		int ButtonCount= weButton.size();
		System.out.println("All button count="+ButtonCount);
		
		 
		WebElement weLeads= driver.findElement(By.xpath("//a[text()='Leads']"));
		weLeads.click();
		
		List<WebElement> weChakbox= driver.findElements(By.xpath("//input[@name='selected_id']"));
		int sizeCheckbox= weChakbox.size();
		
		for (int i = 0; i < sizeCheckbox; i++) {
		WebElement leadCheckBox=	weChakbox.get(i);
		leadCheckBox.click();
		}
		List<WebElement>Countimg=  driver.findElements(By.xpath("//img"));
		int imgCount= Countimg.size();
		System.out.println("Total Immages ="+imgCount);
		
		List<WebElement> alloption=driver.findElements(By.xpath(""));
		 
//		Actions act=   new  Actions(driver);
//		WebElement weMore= driver.findElement(By.xpath("//a[text()='More']"));
//		act.moveToElement(weMore).build().perform();
//
//		act.doubleClick(weMore).build().perform();
//		
//		act.contextClick(weMore).build().perform();
//		
//		act.click().build().perform();
//		
//	    WebElement weSearchInputbox=driver.findElement(By.xpath("//input[@value='Search...']"));
//	    act.sendKeys(weSearchInputbox,"Rajesh").build().perform();
//	    
//	    driver.navigate().back();
//		//span[contains(text(),' -  Lead Information')]
	}

}
