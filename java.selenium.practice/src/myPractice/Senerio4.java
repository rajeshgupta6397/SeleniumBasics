package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senerio4 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.switchTo().frame("iframeResult");
		
		WebElement iframe= driver.findElement(By.xpath("//iframe")); 
		driver.switchTo().frame(iframe);
		
	    WebElement TextIframe=	driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
	    boolean VisibleText= TextIframe.isDisplayed(); 
	    System.out.println(VisibleText);
	    
	    

	}

}
