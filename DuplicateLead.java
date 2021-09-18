package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main
		 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/
		
		WebDriverManager.chromedriver().setup();
		
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
		
		driverObj.findElement(By.xpath("//span[text()='Email']")).click();
		driverObj.findElement(By.name("emailAddress")).sendKeys("mithraaashokan@gmail.com");
		driverObj.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driverObj.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		String actualFirstName = driverObj.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("actualFirstName"+ actualFirstName );
		driverObj.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		
		String title2 = driverObj.getTitle();
		System.out.println("The title of next page is"+title2 );
		
		driverObj.findElement(By.name("submitButton")).click();
		String duplicatedFirstName = driverObj.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.print("duplicatedFirstName"+duplicatedFirstName );
		
		if(actualFirstName.equalsIgnoreCase(duplicatedFirstName)) {
			
			System.out.println("Both the FirstName are equal");
		}
		else
		{
			System.out.println("Both the FirstName are not equal");
		}

		
		
		driverObj.close();
	}

}
