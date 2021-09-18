package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 
		 * 6. Click on Create Contact
		 *  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
         */
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driverObj = new ChromeDriver();
		
		driverObj.get("http://leaftaps.com/opentaps/control/login");
		
		driverObj.manage().window().maximize();
		
		driverObj.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driverObj.findElement(By.id("password")).sendKeys("crmsfa");
		
		driverObj.findElement(By.className("decorativeSubmit")).click();
		
		driverObj.findElement(By.linkText("CRM/SFA")).click();
		
		driverObj.findElement(By.linkText("Contacts")).click();
		
		driverObj.findElement(By.linkText("Create Contact")).click();
		
		driverObj.findElement(By.id("firstNameField")).sendKeys("Sangumithra");
		
		driverObj.findElement(By.id("lastNameField")).sendKeys("Ashokan");
		
		driverObj.findElement(By.id("createContactForm_departmentName")).sendKeys("CSC");
		
		driverObj.findElement(By.name("description")).sendKeys("Sample create contact for Demo");
		
		driverObj.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mithraaashokan@gmail.com");
		
		WebElement ddropDownState = driverObj.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj = new Select(ddropDownState);
		obj.selectByVisibleText("New York");
		
		driverObj.findElement(By.className("smallSubmit")).click();
		
		driverObj.findElement(By.linkText("Edit")).click();
		
		driverObj.findElement(By.id("updateContactForm_description")).clear();
		
		driverObj.findElement(By.id("updateContactForm_importantNote")).sendKeys("important to practice Assignment");
		
		driverObj.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		String title = driverObj.getTitle();
		System.out.print("title"+ title);
		

	}

}
