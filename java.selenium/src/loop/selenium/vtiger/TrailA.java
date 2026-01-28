package selenium.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TrailA {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		String expectedTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("actualTitle and expectedTitle should be same---passed");
		}else {
			System.out.println("actualTitle and expectedTitle is not same---failed");
		}
		WebElement weusername=driver.findElement(By.xpath("//input[@name='user_name']"));
		if(weusername.isDisplayed()) {
			System.out.println("username should be visible in textbox---passed  ");
		}else {
			System.out.println("username should be not visible in textbox "+"---failed");
		}
		if(weusername.isEnabled()) {
			System.out.println("username should be enable in textbox----passed  ");
		}else {
			System.out.println("username should be not visible in textbox ---failed  ");
		}
		String ExpectedFieldval="";
		String Actualinputfieldval=weusername.getAttribute("value");
		if(Actualinputfieldval.equalsIgnoreCase(ExpectedFieldval)==true) {
			System.out.println("input field is blank before entering value----passed");
		}else {
			System.out.println("In input field value is present before entering----failed ");
		}
		weusername.sendKeys("admin");
		String expectedvalue="admin";
		String actualvalue=weusername.getAttribute("value");
		if(actualvalue.equalsIgnoreCase(expectedvalue)==true) {
			System.out.println("expected text value is show---passed");
		}else {
			System.out.println("expected text value is not show---failed");
		}
		WebElement wepassword=  driver.findElement(By.xpath("//input[@type='password']"));
		if(wepassword.isDisplayed()) {
			System.out.println("userpassword should be visible in inputbox----passed");
		}else {
			System.out.println("userpassword should not be visible in inputbox----failed");
		}
		if(wepassword.isEnabled()) {
			System.out.println("password should be enable in textbox---passed");
		}else {
			System.out.println("password should not be enable in textbox---failed");
		}
		String expectedpassword="";
		String actualpassword= wepassword.getAttribute("type");
		System.out.println("userpassword should be actualpassword  ="+actualpassword);
		if(actualpassword.equalsIgnoreCase(expectedpassword)==true) {
			System.out.println("input field is blank before entering value--- passed");
		}else {
			System.out.println("In input field value is present before entering--- failed"); 
			wepassword.sendKeys("admin");
			String expectedpwd="Admin";
			String actualpwd=wepassword.getAttribute("value");
			if(actualpwd.equalsIgnoreCase(expectedpwd)) {
				System.out.println("password masked----passed ");
			}else {
				System.out.println("password is not masked----fieled ");

			}
			WebElement wesummitbutton= driver.findElement(By.xpath("//input[@id='submitButton']"));

			if(wesummitbutton.isDisplayed()) {
				System.out.println("submit button should be displayed...passed");

			}else {
				System.out.println("submit button is not visible...failed");
			}

			if(wesummitbutton.isEnabled()) {
				System.out.println("submit button should be enabled..passed");
			}else {
				System.out.println("submit button is not enabled...failed");
			}
			wesummitbutton.click();
			
			String expectedTitleHomePage =" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		    String actualTitleHomePage= driver.getTitle();
			if(actualTitleHomePage.equalsIgnoreCase(expectedTitleHomePage)) {
				System.out.println("expectedTitleHomePage and actualTitleHomePage  should be same----passed ");
			}else {
				System.out.println("expectedTitleHomePage and actualTitleHomePage does not matched failed");
			}
			
			WebElement welead=	driver.findElement (By.xpath("//a[text()='Leads']"));
			if(welead.isDisplayed()) {
				System.out.println("lead button should be displayed---passed");
			}else {
				System.out.println("lead button is not visible---failed");
			}
			if(welead.isEnabled()) {
				System.out.println("lead button should be enable---passed");
			}else {
				System.out.println("lead button is not enable----failed");
			}
			welead.click();

			WebElement weHotLeads= driver.findElement(By.xpath("//select[@name='viewname']"));
			if(weHotLeads.isDisplayed()) {
				System.out.println("HotLead  should be displayed---passed");
			}else {
				System.out.println("HotLead is not displayed----failed");
			}
			if(weHotLeads.isEnabled()) {
				System.out.println("HotLead  shoule be enabled----passed");
			}else {
				System.out.println("HotLead  is not enable----failed");
			}

			WebElement weHot= driver.findElement(By.xpath("//select[@id='viewname']"));

			Select selobj= new Select(weHot);
			selobj.selectByContainsVisibleText("Hot Leads");	
			
	        WebElement plusbutton=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
			Actions objAction=new Actions(driver);
			
			objAction.contextClick(plusbutton).build().perform();
			
			
			
			

			WebElement weplusebutton= driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
			if(weplusebutton.isDisplayed()) {
				System.out.println("pluse button should be displayed---passed");
			}else {
				System.out.println("pluse button is not displayed----failed");
			}
			if(weplusebutton.isEnabled()) {
				System.out.println("pluse butone shoule be enabled----passed");
			}else {
				System.out.println("pluse button is not enable----failed");
			}
			weplusebutton.click();

			String expectedHomeLeadtitle="  Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM";
			String actualLeadHomeTitle=driver.getTitle();
			if(actualLeadHomeTitle.equals(expectedHomeLeadtitle)) {
				System.out.println("actualLeadHomeTitle and expectedHomeLeadtitle should be same----passed");
			}else {
				System.out.println("actualLeadHomeTitle and expectedHomeLeadtitle is not same----failed");
			}
			WebElement wefirstname= driver.findElement(By.xpath("//input[@name='firstname']"));

			if(wefirstname.isDisplayed()) {
				System.out.println("first name should be visible---passed");
			}else {
				System.out.println("first name is not visible---failed");
			}
			if(wefirstname.isEnabled()) {
				System.out.println("first name should be enable----passed");
			}else {
				System.out.println("first name is not enable----failed");
			}
			String actualfirstname=wefirstname.getAttribute("value");
			if(actualfirstname.equals("")) {
				System.out.println("First Name Text box should be blank-----Passed!");  
			}else {
				System.out.println("First name is not blank value is == "+actualfirstname);
			}
			wefirstname.sendKeys("Rakesh");
			String expectedFNValue="rakesh";
			String actualfirstnameWithValue=wefirstname.getAttribute("value");
			if(actualfirstnameWithValue.equalsIgnoreCase(expectedFNValue)) {
				System.out.println("First Name Text box should be "+expectedFNValue+" Passed!");  
			}else {
				System.out.println("First Name Text box does not matched "+actualfirstnameWithValue+" Failed!");  
			}
			wefirstname.clear();
			String actualfirstnameWithBlank=wefirstname.getAttribute("value");
			if(actualfirstnameWithBlank.equalsIgnoreCase("")){
				System.out.println("First Name Text box should be before blank----passed");

			}else {
				System.out.println("First Name Text box is not before blank----failed");
			}
			wefirstname.sendKeys("EVA");
			String expectedValueinTextBox="eve";
			String ActualvalueInTextBox=  wefirstname.getAttribute("value");
			if(ActualvalueInTextBox.equalsIgnoreCase(expectedValueinTextBox)==true) {
				System.out.println("expect value should be show----passed");
			}else {
				System.out.println("expected value does not show-----failed");
			}

			WebElement weLastname= driver.findElement(By.xpath("//input[@name='lastname']"));
			if(weLastname.isDisplayed()) {
				System.out.println("Last Name should be visible----passed");
			}else {
				System.out.println("Last Name is not visible----failed");
			}
			if(weLastname.isEnabled()) {
				System.out.println("Last Name should be enablesd----passed");
			}else {
				System.out.println("Last Name is not enabled----failed");
			}
			String actualLastNameWithBlanke=weLastname.getAttribute("value");
			if(actualLastNameWithBlanke.equals("")) {
				System.out.println("Last Name Text box should be before blank----passed");
			}else {
				System.out.println("Last Name Text Box is not blank----failed");
			}
			weLastname.sendKeys("Gupta");
			String expectedLastNamevalue="gupta";
			String axpectedLastNameWithvalue=weLastname.getAttribute("value");
			if(axpectedLastNameWithvalue.equalsIgnoreCase(expectedLastNamevalue)) {
				System.out.println("Last Name should be show---- passed!");
			}else {
				System.out.println("First Name Text box does not show----  Failed!");
			}
			weLastname.clear();
			String Actualvalue_WithBlank=  weLastname.getAttribute("value");
			if(Actualvalue_WithBlank.equalsIgnoreCase("")==true) {
				System.out.println("Input Box should be Blank----passed");
			}else {
				System.out.println("Input box does not clear----failed");
			}
			weLastname.sendKeys("Expert View Automation");
			String expected_value="expert view automation";
			String Actual_Value= weLastname.getAttribute("value");
			if(Actual_Value.equalsIgnoreCase(expected_value)==true) {
				System.out.println("Input box should be show value-----passed");
			}else {
				System.out.println("Input box does not show vailue----failed");
			}
			WebElement we_company= weLastname.findElement(By.xpath("//input[@name='company']"));
			if(we_company.isDisplayed()) {
				System.out.println("Displayed should be visible ----passed");
			}else {
				System.out.println("Displayed does not visible ----failed");
			}
			if(we_company.isEnabled()) {
				System.out.println("Input box should be enable----passed"); 
			}else {
				System.out.println("Input box does not enable----failed"); 
			}
			String expectedCompanyName="";
			String  ActualValue=  we_company.getAttribute("value");
			if(ActualValue.equalsIgnoreCase(expectedCompanyName)) {
				System.out.println("Input box should be before blank----passed"); 
			}else {
				System.out.println("Input box before present----failed");
			}
			we_company.sendKeys("Rajesh Carpect");
			String expectedCompany="rajesh carpect";
			String ActualCompanyName= we_company.getAttribute("value");
			if(ActualCompanyName.equalsIgnoreCase(expectedCompany)) {
				System.out.println("Company input box  should be value show----passed");
			}else {
				System.out.println("Company input box does not value show----failed");
			}
			we_company.clear();
			String expectedvalueClear="";
			String Actualvalue= we_company.getAttribute("value");
			if(Actualvalue.equalsIgnoreCase(expectedvalueClear)==true) {
				System.out.println("Input box should be clear---passed");
			}else {
				System.out.println("Input box is not clear---failed");
			}
			we_company.sendKeys("Rupesh Carpet");
			String ExpectedValue="rupesh carpet";
			String ActualValueNm=we_company.getAttribute("value");
			if(ActualValueNm.equalsIgnoreCase(ExpectedValue)==true) {
				System.out.println("Input Box should be parsent company----passed");
			}else {
				System.out.println("Input Box does not parsent company----failed");
			}
			WebElement we_Title=driver.findElement(By.xpath("//input[@name='designation']"));
			if(we_Title.isDisplayed()) {
				System.out.println("Last Name should be visible----passed");
			}else {
				System.out.println("Last Name is not visible----failed");
			}
			if(we_Title.isEnabled()) {
				System.out.println("Last Name should be enablesd----passed");
			}else {
				System.out.println("Last Name is not enabled----failed");
			}
			String expected_Title="";
			String Actual_Title=weLastname.getAttribute("value");
			if(Actual_Title.equalsIgnoreCase(expected_Title)) {
				System.out.println("Last Name Text box should be before blank----passed");
			}else {
				System.out.println("Last Name Text Box is not blank----failed");
			}
			we_Title.sendKeys("Cerpet");
			String expected_title="Carpet";
			String actual_title=we_Title.getAttribute("value");
			if(actual_title.equalsIgnoreCase(expected_title)) {
				System.out.println("Last Name should be show---- passed!");
			}else {
				System.out.println("First Name Text box does not show----  Failed!");
			}
			we_Title.clear();
			we_Title.sendKeys("Kalin");

			WebElement AnnualRevenue=driver.findElement(By.xpath("//input[@name='annualrevenue']"));
			if(AnnualRevenue.isDisplayed()) {
				System.out.println("Annual Revenue should be visible----passed");
			}else {
				System.out.println("Annual Revenue is not visible----failed");
			}
			if(AnnualRevenue.isEnabled()) {
				System.out.println("Annual Revenue should be enablesd----passed");
			}else {
				System.out.println("Annual Revenue is not enabled----failed");
			}
			String expacted_AnnualRevenue1="";
			String Actual_Annual_Revenue=AnnualRevenue.getAttribute("value");
			if(Actual_Annual_Revenue.equalsIgnoreCase(expacted_AnnualRevenue1)) {
				System.out.println("Annual Revenue Text box should be before blank----passed");
			}else {
				System.out.println("Annual Revenue Text Box is not blank----failed");
			}
			AnnualRevenue.sendKeys("3");
			String expected_AnnualRevenue="3";
			String actual_AnnualRevenue=AnnualRevenue.getAttribute("value");
			if(actual_AnnualRevenue.equalsIgnoreCase(expected_AnnualRevenue)) {
				System.out.println("Annual Revenue should be show---- passed!");
			}else {
				System.out.println("Annual Revenue Text box does not show----  Failed!");
			}
			AnnualRevenue.clear();
			AnnualRevenue.sendKeys("2");

			WebElement weEmployes=driver.findElement(By.xpath("//input[@name='noofemployees']"));
			if( weEmployes.isDisplayed()) {
				System.out.println(" Employes should be visible----passed");
			}else {
				System.out.println(" Employes is not visible----failed");
			}
			if( weEmployes.isEnabled()) {
				System.out.println(" Employes should be enablesd----passed");
			}else {
				System.out.println(" Employes is not enabled----failed");
			}
			String expacted_Employes="";
			String Actual_Employes= weEmployes.getAttribute("value");
			if(Actual_Employes.equalsIgnoreCase(expacted_Employes)) {
				System.out.println("Employes Text box should be before blank----passed");
			}else {
				System.out.println("Employes Text Box is not blank----failed");
			}
			weEmployes.sendKeys("101");
			String expected_employes="101";
			String actual_employes= weEmployes.getAttribute("value");
			if(actual_employes.equalsIgnoreCase(expected_employes)) {
				System.out.println(" Employes should be show---- passed!");
			}else {
				System.out.println(" Employes Text box does not show----  Failed!");
			}
			weEmployes.clear();
			weEmployes.sendKeys("105");

			WebElement weEmail=driver.findElement(By.xpath("//input[@name='secondaryemail']"));
			if( weEmail.isDisplayed()) {
				System.out.println(" weEmail should be visible----passed");
			}else {
				System.out.println(" weEmail is not visible----failed");
			}
			if( weEmail.isEnabled()) {
				System.out.println(" weEmail should be enablesd----passed");
			}else {
				System.out.println(" weEmail is not enabled----failed");
			}
			String expacted_Email="";
			String Actual_Email= weEmail.getAttribute("value");
			if(Actual_Email.equalsIgnoreCase(expacted_Email)) {
				System.out.println("Email Text box should be before blank----passed");
			}else {
				System.out.println("Email Text Box is not blank----failed");
			}
			weEmail.sendKeys("Rupesh@gmail.com");
			String expected_Email="rupesh@gmail.com";
			String actual_Email= weEmployes.getAttribute("value");
			if(actual_Email.equalsIgnoreCase(expected_Email)) {
				System.out.println(" Email should be show---- passed!");
			}else {
				System.out.println("Email  Text box does not show----  Failed!");
			}
			weEmail.clear();
			weEmail.sendKeys("Rakesh@gmail.com");

			WebElement wePhone=driver.findElement(By.xpath("//input[@name='phone']"));
			if( wePhone.isDisplayed()) {
				System.out.println(" Phone should be visible----passed");
			}else {
				System.out.println(" Phone is not visible----failed");
			}
			if( wePhone.isEnabled()) {
				System.out.println(" Phone should be enablesd----passed");
			}else {
				System.out.println(" Phone is not enabled----failed");
			}
			String expacted_Phone="";
			String Actual_Phone= wePhone.getAttribute("value");
			if(Actual_Phone.equalsIgnoreCase(expacted_Phone)) {
				System.out.println("Phone Text box should be before blank----passed");
			}else {
				System.out.println("Phone Text Box is not blank----failed");
			}
			wePhone.sendKeys("7856982");
			String expected_Phone="7856982";
			String actual_Phone= wePhone.getAttribute("value");
			if(actual_Phone.equalsIgnoreCase(expected_Phone)) {
				System.out.println(" Phone should be show---- passed!");
			}else {
				System.out.println("Phone  Text box does not show----  Failed!");
			}
			wePhone.clear();
			wePhone.sendKeys("6758953");	
			
		    WebElement weSave=	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]"));
		    if(weSave.isDisplayed()) {
		    	System.out.println("Save button should be show ----passed");
		    }else {
		    	System.out.println("Save button does not show----failed");
		    }
		    if(weSave.isEnabled()) {
		    	System.out.println("Save button should be enabled  ----passed");
		    }else {
		    	System.out.println("Save button does not enabled-----failed");
		    }
		    weSave.click();
		}

	}
}
















