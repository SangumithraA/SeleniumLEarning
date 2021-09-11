package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driverObj = new ChromeDriver();
		driverObj.manage().window().maximize();
		
		driverObj.get("http://leaftaps.com/opentaps/control/main");
		

		String title = driverObj.getTitle();
		System.out.print("Title for the page is    " + title);
		
		WebElement userName = driverObj.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement passWord = driverObj.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
		
		WebElement loginButton = driverObj.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfaLink = driverObj.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		
		WebElement LeadsPage = driverObj.findElement(By.linkText("Leads"));
		LeadsPage.click();
		
		WebElement createLead = driverObj.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		
		 driverObj.findElement(By.id("createLeadForm_companyName")).sendKeys("TeasLeafPvtLtd");
		 driverObj.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangumithra");
		 
		 driverObj.findElement(By.id("createLeadForm_lastName")).sendKeys("Ashokan");
		 

		 driverObj.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sheriba");
		 
		 driverObj.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Thankaraj");
		 
		 driverObj.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		 
		 driverObj.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/11/1992");
		 
		 
		 driverObj.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Coach");
		 
		 driverObj.findElement(By.id("createLeadForm_departmentName")).sendKeys("Technical");
		 
		 
		 driverObj.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("12000");
		 
		 
		 driverObj.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("14");
		 
		 driverObj.findElement(By.id("createLeadForm_sicCode")).sendKeys("00123");
		 
		 driverObj.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("pen");
		 
		 driverObj.findElement(By.id("createLeadForm_description")).sendKeys("It is a sample Demo for the First Day in Selenium Class");

		 driverObj.findElement(By.id("createLeadForm_importantNote")).sendKeys("Please Finish the Assignment");

	driverObj.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
	driverObj.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("65");
	
	
	
	driverObj.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+65");
	
	
	driverObj.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("84793271");
	
	
	driverObj.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("84793271");
	driverObj.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0");
	
	driverObj.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mithraaashokan@gmail.com");
	driverObj.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0");
	driverObj.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sheriba");
	
	
	
	driverObj.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("06-238");
	
	
	driverObj.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Bukit Batok Street 21");
	
	driverObj.findElement(By.id("createLeadForm_generalCity")).sendKeys("Singapore");
	
	driverObj.findElement(By.id("createLeadForm_generalCity")).sendKeys("Singapore");
	
	driverObj.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("650211");
	
	driverObj.findElement(By.className("smallSubmit")).click();
	
	}

}
