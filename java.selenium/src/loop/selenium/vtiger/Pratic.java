package selenium.vtiger;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pratic {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(10);
		driver.get("https://www.facebook.com/");
		Thread.sleep(20);
		driver.get("https://www.google.com/");
		Thread.sleep(30);
		driver.get("https://www.google.com/intl/hi/chrome");

	}

}








 
