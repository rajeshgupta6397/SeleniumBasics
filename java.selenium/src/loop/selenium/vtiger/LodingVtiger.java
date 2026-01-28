package selenium.vtiger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LodingVtiger {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://localhost:8888/");

		By Byusername= By.xpath("//input[@name='user_name']");
		WebElement weusername =driver.findElement(By.name("user_name"));
		weusername.sendKeys("admin");

		By Bypassword =By.xpath("//input[@name='user_name']");
		WebElement wepassword =driver.findElement(By.name("user_password"));
		wepassword.sendKeys("admin");

		By ByLogin= By.xpath("//input[@id='submitButton']");
		WebElement  weLogin=driver.findElement(ByLogin);
		weLogin.click();

		By leadsLink =By.xpath("//a[@href='index.php?module=Leads&action=index']");
		WebElement weleadslenk= driver.findElement(leadsLink);
		weleadslenk.click();

		By bypluse= By.xpath("//img[@alt='Create Lead...']");
		WebElement wepluse= driver.findElement(bypluse);
		wepluse.click();

		By bymr=	By.xpath("//select[@name='salutationtype']");
		WebElement wemr=  driver.findElement(bymr);
		wemr.sendKeys("Mr");


		By byfirstname= By.xpath("//input[@name='firstname']");
		WebElement wefirstname= driver.findElement(byfirstname);
		wefirstname.sendKeys("Rajesh");

		By bylastname=  By.xpath("//input[@name='lastname']");
		WebElement welastname =driver.findElement(bylastname);
		welastname.sendKeys("Gupta");

		By bycompany= By.xpath("//input[@name='company']");
		WebElement wecompany=  driver.findElement(bycompany);
		wecompany.sendKeys("Rajesh Overseas");
		
	By bytitle=	By.xpath("//input[@name='designation']");
    WebElement wetitle= driver.findElement(bytitle);
    wetitle.sendKeys("Eva");
    
   By byemployee =By.xpath("//select[@name='leadsource']");
   WebElement weEmployee= driver.findElement(byemployee);
   weEmployee.sendKeys("Employee");
   
  By byindustry= By.xpath("//select[@name='industry']");
  WebElement weinsurance =driver.findElement(byindustry);
  weinsurance.sendKeys("Insurance");
  
  
  
  
		By bystreat= By.xpath("lane");
		WebElement westreat= driver.findElement(bystreat);
		westreat.sendKeys("PipariRayanBhadohi");

				By bycode= By.xpath("//input[@name='code']");
				WebElement wecode= driver.findElement(bycode);
				wecode.sendKeys("221401");
		
				By bycountry= By.xpath("//input[@name='country']");
				WebElement wecountry= driver.findElement(bycountry);
				wecountry.sendKeys("India");
		
				By byphone= By.xpath("//input[@name='phone']");
				WebElement wephone=  driver.findElement(byphone);
				wephone.sendKeys("8174892032");
		
				By bymobile= By.xpath("mobile");
				WebElement wemobile=  driver.findElement(bymobile);
				wemobile.sendKeys("9324550982");
		
				By byemail= By.xpath("//input[@name='email']");
				WebElement weEmail= driver.findElement(byemail);
				weEmail.sendKeys("rajeshgupta6397");
		
				By bywebside= By.xpath("//input[@name='website']");
				WebElement wewebside=driver.findElement(bywebside);
				wewebside.sendKeys("jio");
		
				By bypostBox=  By.xpath("//input[@name='pobox']");
				WebElement wePostBox= driver.findElement(bypostBox);
				wePostBox.sendKeys("Bhadohi");
		
				By bycity= By.xpath("//input[@name='city']");
				WebElement wecity= driver.findElement(bycity);
				wecity.sendKeys("Bhadohi");
		
				By bystate= By.xpath("//input[@name='state']");
				WebElement westate= driver.findElement(bystate);
				westate.sendKeys("UtterPardesh");



	}

}
