package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weUserName=driver.findElement(By.xpath("//input[@name='user_name']"));
		weUserName.sendKeys("admin");
		Point pointLocation= weUserName.getLocation();
		int Xcordinate= pointLocation.getX();
		int Ycordinate= pointLocation.getY();
		System.out.println("X Cordinate of Username intput box== "+Xcordinate);
		System.out.println("Y Cordinate of Username input box =="+Ycordinate);
		String StrObj= weUserName.getAttribute("type");
		System.out.println(StrObj);
		String StrValue=  weUserName.getAttribute("value");
		System.out.println(StrValue);
		String expectedTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String actualTitle= driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("actualTitle and expectedTitle should be same---passed");
		}else {
			System.out.println("actualTitle and expectedTitle does not matched----failed");
		}
		String StrCurrentUrl= driver.getCurrentUrl();
		System.out.println(StrCurrentUrl);
		
		

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		weUserPassword.sendKeys("admin");
		WebElement weLoginBt=driver.findElement(By.id("submitButton"));
		
		Dimension dimSize= weLoginBt.getSize();
		int dimheight= dimSize.height;
		int dimwidth=dimSize.width;
		System.out.println(dimheight);
		System.out.println(dimwidth);


		weLoginBt.click();
		WebElement weHomePage= driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']"));
		weHomePage.click();
		WebElement weLead=  driver.findElement(By.xpath("//a[text()='Leads']"));

		String strtext= weLead.getText();
		System.out.println(strtext);
		weLead.click();
	}

}
