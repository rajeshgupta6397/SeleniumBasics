package interviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPework {

	public static void main(String[] args) throws InterruptedException {
	WebDriver chrome_driver=	new ChromeDriver();
	chrome_driver.manage().window().maximize();
	chrome_driver.get(" https://www.amazon.in");
	Thread.sleep(2000);
	WebElement web_find= chrome_driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	web_find.sendKeys("Mobiles");
	Thread.sleep(2000);
	WebElement web= chrome_driver.findElement(By.xpath("//span[text()=' under 15000 5g phones']"));
	web.click();
	}

}
