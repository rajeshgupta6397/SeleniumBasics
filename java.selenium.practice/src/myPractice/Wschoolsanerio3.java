package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wschoolsanerio3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		WebElement iframepage=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframepage);
		
		WebElement child_i_frame=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(child_i_frame);
		
		
		WebElement weTextprint=driver.findElement(By.xpath("//body[@style='background-color:powderblue']//h1"));
		String textPrint=weTextprint.getText();
		System.out.println(textPrint);
		
		WebElement parentIframe= driver.findElement(By.xpath("//div[@class='w3-bar']"));
		driver.switchTo().parentFrame();
		
		WebElement ChildIframe= driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(ChildIframe);
		
		WebElement displayframe= driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")); 
		String PrintText= displayframe.getText();
		System.out.println(PrintText);
		
		
	}

}
