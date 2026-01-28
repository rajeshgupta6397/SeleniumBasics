package myPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertHendinh {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php\r\n");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Alert alertreturn= driver.switchTo().alert();
	System.out.println(alertreturn.getText());
	Thread.sleep(3000);
	alertreturn.accept();
	System.out.println(alertreturn.getText());
    
	Thread.sleep(3000);
	alertreturn.accept();
	}

}
