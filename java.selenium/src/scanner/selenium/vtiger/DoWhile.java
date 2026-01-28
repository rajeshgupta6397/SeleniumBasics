package selenium.vtiger;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoWhile {

	//	public static void main(String[] args) {
	//	Scanner sc=	new Scanner(System.in);
	//  System.out.println("please enter you name !!");
	//  sc.nextLine();
	//	}
	//
	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		WebElement	username=driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		WebElement	password=driver.findElement(By.xpath("//input[@name='user_password']"));
		password.sendKeys("admin");
		WebElement	login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();
		List<WebElement>link=driver.findElements(By.xpath("//a"));
	for(int i=0;i<link.size();i++) {
	WebElement	weget=link.get(i);
		System.out.println(weget);
	}
	}

	








}
