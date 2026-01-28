package selenium.vtiger;

import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
//driver.get("https://amozon.in/");
//WebElement serachbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

//List<WebElement>weTotalPrice= driver.findElements(By.xpath("//span[@class='a-price-whole']"));

//serachbox.sendKeys("men T_shirt");

//WebElement serachbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//
//serachbutton.click();
//
//List<WebElement> weprice= driver.findElements(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']/ancestor::div[@class='a-section a-spacing-base desktop-grid-content-view']//span[@class='a-price-whole']"));
//
//List<WebElement> totalcount_T_shirt=driver.findElements(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']"));
//for(int i=0;i<totalcount_T_shirt.size();i++) {
//	WebElement gettshirt=totalcount_T_shirt.get(i);
//	 String gettext=gettshirt.getText();
//	 WebElement weget= weprice.get(i);
//	 String tshirtAndPrce= weget.getText();
//	 
//	 System.out.println(i+1+" "+tshirtAndPrce+" "+gettext);
//	 
	 
		driver.get("https://www.amazon.com/");
		WebElement weSearchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
List<WebElement>weProductName=  driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		weSearchBox.sendKeys("Shoes");
		WebElement wesubmitButton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		wesubmitButton.click();
		List<WebElement>wePrice= driver.findElements(By.xpath("//span[@class='a-price-symbol']"));
		
		
}
	}

//div[text()='DELL 15 AMD Ryzen 5 Hexa Core 7530U - (16 GB/512 GB SSD/Windows 11 Home) 3535 Thin and Light Laptop']/ancestor::div[@class='col col-5-12 BfVC2z']/following-sibling::div//div[@class='Nx9bqj _4b5DiR']