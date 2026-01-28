package myPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class googlepage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/imghp?hl=en-GB&tab=ri&ogbl");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("salenium");
		Thread.sleep(2000);
		List<WebElement>  Returnlist =driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		WebElement	rss= Returnlist.get(4);
		String	we=rss.getText();
		System.out.println(we);
		rss.click();
	}

}
