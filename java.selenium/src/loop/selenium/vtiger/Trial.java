package selenium.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) {
		ChromeDriver driver=	new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://localhost:8888");


		WebElement weuser_name=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuser_name.sendKeys("rajesh");
		weuser_name.clear();
		weuser_name.sendKeys("admin");
		String attributeval= weuser_name.getAttribute("value");
		System.out.println("attributeval---"+attributeval);
		

		WebElement weuser_password= driver.findElement(By.xpath("//input[@name='user_password']"));
		String attributepwd=  weuser_password.getAttribute("name");
		System.out.println("attributepwd---"+attributepwd);
		weuser_password.sendKeys("admin");

		WebElement wesummitBT= driver.findElement(By.xpath("//input[@id='submitButton']"));
		String attributeBT=	wesummitBT.getAttribute("id");
		System.out.println("attribute---"+attributeBT);
		wesummitBT.click();

		WebElement weleads= driver.findElement (By.xpath("(//a[text()='Leads'])[1]"));
		String attributeleads= weleads.getAttribute("text");
		System.out.println("attribute---"+attributeleads);
		weleads.click();

		WebElement wepluse= driver.findElement (By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		String attributepluse= wepluse.getAttribute("src");
		System.out.println("attribute---"+attributepluse);
		wepluse.click();

		WebElement wemr= driver .findElement  (By.xpath("//select[@name='salutationtype']"));
		String attributeMr= wemr.getAttribute("name");
		System.out.println("attribute---"+attributeMr);
		wemr.sendKeys("Mr");

		WebElement wefirstname= driver.findElement (By.xpath("//input[@name='firstname']"));
		String attributfirstname=  wefirstname.getAttribute("name");
		System.out.println("attribute---"+attributfirstname);
		wefirstname.sendKeys("Rajesh");

		WebElement welastname=  driver.findElement (By.xpath("//input[@name='lastname']"));
		String attributelastname= welastname.getAttribute("name");
		System.out.println("attribute---"+attributelastname);
		welastname.sendKeys("Gupta");

		WebElement wecompany= driver.findElement  (By.xpath("//input[@name='company']"));
		String attributecompany= wecompany.getAttribute("name");
		System.out.println("attribute---"+attributecompany);
		wecompany.sendKeys("Rajesh Overseas");

		WebElement wetitle=  driver.findElement (By.xpath("//input[@name='designation']"));
		String attributeTitle= wetitle.getAttribute("name");
		System.out.println("attribute---"+attributeTitle);
		wetitle.sendKeys("EVA");

		WebElement weEmployee= driver.findElement (By.xpath("//select[@name='leadsource']"));
		String attributEmployee= weEmployee.getAttribute("name");
		System.out.println("attribut---"+attributEmployee);
		weEmployee.sendKeys("Employee");

		WebElement weindustry= driver.findElement(By.xpath("//select[@name='industry']"));
		String attributIndustry= weindustry.getAttribute("name");
		System.out.println("attribut---"+attributIndustry);
		weindustry.sendKeys("Banking");

		WebElement weRupesh= driver.findElement (By.xpath("//input[@name='annualrevenue']"));
		String atributRup=  weRupesh.getAttribute("name");
		System.out.println("attribut---"+atributRup);
		weRupesh.sendKeys("10000000");

		WebElement weEmployeesNo= driver.findElement(By.xpath("//input[@name='noofemployees']"));
		String atributeNo=weEmployeesNo.getAttribute("name");
		System.out.println("attribute---"+atributeNo);
		weEmployeesNo.sendKeys("120");

		WebElement weemail= driver.findElement (By.xpath("//input[@name='secondaryemail']"));
		String attributEmai= weemail.getAttribute("name");
		System.out.println("attribut---"+attributEmai);
		weemail.sendKeys("rajeshgupta6397@gmail.com");

		WebElement wepipari= driver.findElement (By.xpath("//textarea[@name='lane']"));
		String attribute= wepipari.getAttribute("name");
		System.out.println("attribute---"+attribute);
		wepipari.sendKeys("Pipari Raya Bhadohi");

		WebElement weBox= driver.findElement(By.xpath("//input[@class='searchBox']"));
		String attribut=  weBox.getAttribute("class");
		System.out.println("attribut---"+attribut);
		weBox.sendKeys("BhadohiBox");

		WebElement weCode= driver.findElement (By.xpath("//input[@name='code']"));
		String attributCode= weCode.getAttribute("name");
		System.out.println("attribut---"+attributCode);
		weCode.sendKeys("221401");

		WebElement weCountry= driver.findElement (By.xpath("//input[@name='country']"));
		String attributCountry= weCountry.getAttribute("name");
		System.out.println("attribut---"+attributCountry);
		weCountry.sendKeys("India");

		WebElement wePhone= driver.findElement (By.xpath("//input[@id='phone']"));
		String attributPhone= wePhone.getAttribute("id");
		System.out.println("attribut---"+attributPhone);
		wePhone.sendKeys("9324550982");

		WebElement weMob= driver.findElement (By.xpath ("//input[@name='mobile']"));
		String attributMob= weMob.getAttribute("name");
		System.out.println("attribute---"+attributMob);
		weMob.sendKeys("8174892032");

		WebElement wefax=  driver.findElement (By.xpath("//input[@name='fax']"));
		String attributfax= wefax.getAttribute("name");
		System.out.println("attribute---"+attributfax);
		wefax.sendKeys("Good");

		WebElement weEmail= driver.findElement (By.xpath ("//input[@name='email']"));
		String attributeEmail= weEmail.getAttribute("name");
		System.out.println("attribute---"+attributeEmail);
		weEmail.sendKeys("RajeshGupta6397@gmail.com");

		WebElement weWebside= driver.findElement (By.xpath ("//input[@name='website']"));
		String attributeWebside=  weWebside.getAttribute("name");
		System.out.println("attribute---"+attributeWebside);
		weWebside.sendKeys("Jio");

       WebElement wesave= driver.findElement(By.xpath("//input[@name='button']"));
       wesave.click();







































	}

}
