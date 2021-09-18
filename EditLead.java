package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/
		
        WebDriverManager.chromedriver().setup();
        String viewLeadTitle = "View Lead | opentaps CRM";
		
		ChromeDriver driverObj = new ChromeDriver();
		driverObj.manage().window().maximize();
		driverObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driverObj.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driverObj.getTitle();
		System.out.println("Title for the page is    " + title);

		WebElement userName = driverObj.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement passWord = driverObj.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");

		WebElement loginButton = driverObj.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfaLink = driverObj.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		driverObj.findElement(By.linkText("Leads")).click();
		driverObj.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		driverObj.findElement(By.xpath("(//input[@type='text'])[30]")).sendKeys("Sangumithra");
		driverObj.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		driverObj.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		
		String title2 = driverObj.getTitle();
		System.out.println("Title of the second Page is "+ title2);
		if(title2.equalsIgnoreCase(viewLeadTitle)) {
			
			System.out.println("The title is correct");
		}
		else
		{
			System.out.println("The title is not correct");
		}

		driverObj.findElement(By.linkText("Edit")).click();
		driverObj.findElement(By.id("updateLeadForm_companyName")).clear();
		driverObj.findElement(By.id("updateLeadForm_companyName")).sendKeys("IonLimited");
		
		driverObj.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		String updatedCompanyName = driverObj.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("updatedCompanyName" + updatedCompanyName.substring(0, 10));
		if(updatedCompanyName.substring(0,10).equalsIgnoreCase("IonLimited")) {
			System.out.println("Update is successful" + updatedCompanyName.substring(0, 10));
			
		}
		else
		{
			System.out.println("Update is not successful");
		}
		
	}

}
