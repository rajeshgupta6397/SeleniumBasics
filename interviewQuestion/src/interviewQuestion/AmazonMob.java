package interviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMob {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone apple 15");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(1000);
	
  String get_text= driver.findElement(By.xpath("//div[@class='rush-component']//span[text()='iPhone 15 (128 GB) - Blue']"))
  .getText();
//     System.out.println(get_text);
//     
//     String str= driver.findElement(By.xpath("//div[@aria-hidden='M.R.P: ₹69,900']")).getText();
//     System.out.println(str);
	}

}
