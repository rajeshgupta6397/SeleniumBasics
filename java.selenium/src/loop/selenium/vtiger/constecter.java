package selenium.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class constecter {

	public static void main(String[] args) {
//		ChromeDriver driver=	new	ChromeDriver();
//		driver.get("file:///C:/Users/Rajesh/Desktop/rajesh.html");
//		
//		WebElement drop= driver.findElement(By.xpath("//select[@id='cars']"));
//		Select down=new Select(drop);
//		down.selectByIndex(1);
//		down.selectByIndex(3);
	ChromeDriver driver=	new ChromeDriver();
	driver.get("file:///C:/Users/Rajesh/Desktop/constecter.html");
WebElement wemalti=	driver.findElement(By.xpath("//select[@id='cars']"));
     Select wpc= new Select(wemalti);
     wpc.selectByIndex(1);
     wpc.selectByIndex(3);
     wpc.selectByIndex(0);
     wpc.selectByIndex(2);


	}

}
