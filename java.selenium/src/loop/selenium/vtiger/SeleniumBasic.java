
package selenium.vtiger ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasic {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
        String stringTitle=  driver.getTitle();
         System.err.println(stringTitle);
		WebElement weuser_name=driver.findElement(By.xpath("//input[@name='user_name']"));
		String attributeval= weuser_name.getAttribute("value");

		weuser_name.sendKeys("rajesh");
     	weuser_name.clear();
	    weuser_name.sendKeys("admin");
		System.out.println("attributeval---"+attributeval);
	

//		WebElement weuser_password= driver.findElement(By.xpath("//input[@name='user_password']"));
//		String attributepwd=  weuser_password.getAttribute("name");
//		System.out.println("attributepwd---"+attributepwd);
//		weuser_password.sendKeys("admin");
//
//		WebElement wesummitBT= driver.findElement(By.xpath("//input[@id='submitButton']"));
//		String attributeBT=	wesummitBT.getAttribute("id");
//		System.out.println("attribute---"+attributeBT);
//		wesummitBT.click();
//
//
//		WebElement weleads= driver.findElement (By.xpath("(//a[text()='Leads'])[1]"));
//		String attributeleads= weleads.getAttribute("text");
//		System.out.println("attribute---"+attributeleads);
//		weleads.click();
//
//		WebElement wepluse= driver.findElement (By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
//		String attributepluse= wepluse.getAttribute("src");
//		System.out.println("attribute---"+attributepluse);
//		wepluse.click();
//
//		WebElement weFname= driver.findElement (By.xpath ("//input[@name='firstname']"));
//		weFname.sendKeys("Rajesh Gupta");
//		String AttributFname= weFname.getAttribute("value");
//		System.out.println("Before enter value-----  "+AttributFname);
//		weFname.clear();
//		String clear= weFname.getAttribute("value");
//		System.out.println("Before enter value-----  "+clear);
//		weFname.sendKeys("Rakesh");
//		String AttributFnames= weFname.getAttribute("value");
//		System.out.println("After enter value-----  "+AttributFnames);
//		
//		WebElement welastname= driver.findElement(By.xpath("//input[@name='lastname']"));
//		welastname.sendKeys("Yadav");
//		String AttributeLname= welastname.getAttribute("value");
//		System.out.println("Before enter value---"+AttributeLname);
//		welastname.clear();
//		String clear1= welastname.getAttribute("value");
//		System.out.println("Before enter value----"+clear1);
//		welastname.sendKeys("Gupta");
//		String AttributLName=  welastname.getAttribute("value");
//		System.out.println("After enter value---"+AttributLName);
//		
//		WebElement weCompany=  driver.findElement(By.xpath("//input[@name='company']"));
//		weCompany.sendKeys("EVA");
//		String AttributeEva= weCompany.getAttribute("value");
//		System.out.println("Before enter value---"+AttributeEva);
//		weCompany.clear();
//		String clear2= weCompany.getAttribute("value");
//		System.out.println("Before enter value--"+clear2);
//		weCompany.sendKeys("Expert View Automation");
//		String AttributeCompany= weCompany.getAttribute("value");
//		System.out.println("After enter value---"+AttributeCompany);
//		
//		WebElement wegup= driver.findElement (By.xpath("//input[@name='designation']"));
//		wegup.sendKeys("gupta");
//		String Attributgup= wegup.getAttribute("value");
//		System.out.println("Before enter value---"+Attributgup);
//		wegup.clear();
//		String clear3= wegup.getAttribute("value");
//		System.out.println("Before enter value---"+clear3);
//		wegup.sendKeys("Rajesh Gupta");
//		String AttributGup= wegup.getAttribute("value");
//		System.out.println("After enter value---"+AttributGup);
//		
//		WebElement weEmp= driver.findElement(By.xpath("//select[@name='leadsource']"));
//		Select	sel		=new Select(weEmp);
//		sel.selectByIndex(5);
//		String AttributEmp= weEmp.getAttribute("value");
//		System.out.println("Before enter value---"+AttributEmp);
//		weEmp.clear();
//		String Clear4= weEmp.getAttribute("value");
//		System.out.println("Before enter value---"+Clear4);
//		Select selnew= new Select (weEmp);
//		selnew.selectByIndex(7);
//		String AttributBA= weEmp.getAttribute("value");
//		System.out.println("After enter value--"+AttributBA);
//		
//		WebElement weind= driver.findElement(By.xpath("//select[@name='industry']"));
//		Select sele= new Select(weEmp);
//		sele.selectByIndex(7);
//		String Attributval= weind.getAttribute("value");
//		System.out.println("Before enter value--"+Attributval);
//	//.clear();
//	//	String Attributcl=  weind.getAttribute("value");
//	//.out.println("Before enter value---"+Attributcl);
//	//	Select sele= new Select(weind);
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		



	}

}
