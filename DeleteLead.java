/**
 * 
 */
package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Sangumithra Ashokan
 *
 */
public class DeleteLead {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main
		 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driverObj = new ChromeDriver();
		driverObj.manage().window().maximize();
		driverObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

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
		driverObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driverObj.findElement(By.linkText("Leads")).click();
		driverObj.findElement(By.linkText("Find Leads")).click();
		driverObj.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		
		 driverObj.findElement(By.name("phoneCountryCode")).clear();
		 driverObj.findElement(By.name("phoneCountryCode")).sendKeys("65");
		driverObj.findElement(By.name("phoneNumber")).sendKeys("84793271");
		driverObj.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		
		String firstID = driverObj.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		System.out.println("******firstID***" + firstID);
		Thread.sleep(2000);
		driverObj.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		//Thread.sleep(10);
		driverObj.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driverObj.findElement(By.linkText("Leads")).click();
		driverObj.findElement(By.linkText("Find Leads")).click();
		driverObj.findElement(By.name("id")).sendKeys(firstID);
		driverObj.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String compareText = driverObj.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		if(compareText.contains("No records")) {
			System.out.println("Deletion is successful");
		}
		else
		{
			System.out.println("Not successful");
		}
		
	

	}

}
