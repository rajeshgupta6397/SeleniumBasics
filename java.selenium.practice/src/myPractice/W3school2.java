package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school2 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		WebElement wefullpage= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(wefullpage);

		String weuser= driver.findElement(By.xpath("//h2[text()='HTML Iframes']")).getText();
	
		//String we= weuser.getText();
		System.out.println(weuser);
		driver.switchTo().defaultContent();
		driver.quit();




	}

}
