package myPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sneriopractic {

	public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	// driver.get("https://www.yatra.com/");
//	 
//	 List<WebElement> weLinkList= driver.findElements(By.xpath("//a"));
//   int LinksCount= weLinkList.size();
//   int blankCount=0;
//   int textCount=0;
//   for(int i=0;i<LinksCount;i++) {
//   WebElement we= weLinkList.get(i); 
//   String strText=  we.getText();
//   if(strText.equalsIgnoreCase("")==true) {
//	   blankCount=blankCount+1;
//   }else {
//	   System.out.println(i+1+"-"+strText); 
//	   textCount=textCount+1;
//   }
//   System.out.println(blankCount);
//   System.out.println(textCount);
//	 
//	 List<WebElement>welist= driver.findElements(By.xpath("//k"));
//	 welist.get(0);
//	}
	 driver.get("http://localhost:8888/");
	 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	 
 
	 driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	 
    driver.findElement(By.id("submitButton")).click();
   
    WebElement weLead= driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
    weLead.click();
    
//     List<WebElement>listCheckboxes= driver.findElements(By.xpath("//a[@class='HotelCard_stretchedLink__sbaKZ']"));
//     int CheckBoxesCount= listCheckboxes.size();
//     for(int i=0;i<CheckBoxesCount;i++) {
//    	WebElement weChekBox= listCheckboxes.get(i);
//    	weChekBox.click();
     }
    	 
     }
	



