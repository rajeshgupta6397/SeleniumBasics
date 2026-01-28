import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewIframe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		//		
		//		WebElement htmlClick= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//		driver.switchTo().frame(htmlClick);
		//		 WebElement frame=driver.findElement(By.xpath("//iframe[@src='https://www.w3schools.com']"));
		//		 driver.switchTo().frame(frame);
		//		 driver.findElement(By.xpath("//a[text()='HTML']")).click();
		//		 driver.switchTo().parentFrame();
		//		 WebElement frampage= driver.findElement(By.xpath("//h1[text()='The iframe element']"));
		//		 String text= frampage.getText();
		//		 System.out.println(text);

		//Thread.sleep(1000);
		//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		//		WebElement htmlpage= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//		driver.switchTo().frame(htmlpage);
		//		WebElement wew3SchoolClick= driver.findElement(By.xpath("//iframe[@src='https://www.w3schools.com']"));
		//		driver.switchTo().frame(wew3SchoolClick);
		//		WebElement htmlpageClick= driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button acctop-link ga-top-drop ga-top-drop-tut-css']/ancestor::div[@id='dropdown-nav-outer-wrapper']"));
		//		htmlpageClick.click();
		//		driver.switchTo().parentFrame();
		//		WebElement weiframeElementClick= driver.findElement(By.xpath("//h1[text()='The iframe element']"));
		//		String iframepageClick= weiframeElementClick.getText();
		//		System.out.println(iframepageClick);



		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");	
		WebElement weheadPage=  driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(weheadPage);
		WebElement	we_demoframe=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(we_demoframe);

		WebElement Text_HTML=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		String ActuleText=Text_HTML.getText();
		System.out.println(ActuleText);

	}

}






