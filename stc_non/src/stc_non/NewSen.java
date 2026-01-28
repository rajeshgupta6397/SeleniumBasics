package stc_non;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewSen {
	public static void main(String []args) {
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.w3schools.com/");
//		Actions act=new Actions(driver);
//		act.scrollByAmount(0, 12300).build().perform();
//		WebElement frame=driver.findElement(By.xpath("//img[@src='img_nature_wide.jpg']"));
//	    driver.switchTo().frame(frame);
//	     WebElement text=driver.findElement(By.xpath(""));
//	    String innertext=text.getText();
//	    System.out.println(innertext);
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0,12300).build().perform();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[@class='next']")).click();
		driver.switchTo().defaultContent();
		WebElement LernMoreClick= driver.findElement(By.xpath("//a[@class='w3-button ga-fp tut-button ws-black w3-padding-16 w3-mobile vl-howtobtn']"));
		LernMoreClick.click();
		
		
		
	}

}
