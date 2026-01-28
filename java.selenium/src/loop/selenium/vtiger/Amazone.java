package selenium.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {

	public static void main(String[] args) {
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.com/");
//		WebElement weSearc=driver.findElement(By.xpath("//input[@type='text']"));
//		weSearch.sendKeys("mobile phone");
//		weSearch.submit();


		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement weSearch=driver.findElement(By.xpath("//input[@type='text']"));
		weSearch.sendKeys("mobile i phone");
		weSearch.submit();
		driver.findElement(By.xpath("//button[@type='submit']"));
		weSearch.clear();
	}

}
