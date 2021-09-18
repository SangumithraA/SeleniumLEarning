package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();
	    
			
			ChromeDriver driverObj = new ChromeDriver();
			driverObj.manage().window().maximize();
			driverObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driverObj.get("https://acme-test.uipath.com/login");
			driverObj.findElement(By.id("email")).sendKeys("mithraaashokan@gmail.com");
			driverObj.findElement(By.id("password")).sendKeys("Ilovemyself@123");
			driverObj.findElement(By.xpath("//button[@type='submit']")).click();
			
			String title = driverObj.getTitle();
			
			System.out.println("Title of the Web Page is"+ title);
			driverObj.findElement(By.linkText("Log Out")).click();

	}

}
