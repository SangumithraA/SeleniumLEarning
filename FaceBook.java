package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driverObj = new ChromeDriver();
		
		
		driverObj.get("https://en-gb.facebook.com/");
		

		
		driverObj.manage().window().maximize();
		
		driverObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driverObj.findElement(By.linkText("Create New Account")).click();
		
		driverObj.findElement(By.name("firstname")).sendKeys("Mithra");
		
		driverObj.findElement(By.name("lastname")).sendKeys("Navin");
		
		driverObj.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("84793271");
		
		driverObj.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456admin");
		
		WebElement drop1 = driverObj.findElement(By.id("day"));
		
		Select obj = new Select(drop1);
		
		obj.selectByValue("4");
		
		WebElement drop2 = driverObj.findElement(By.id("month"));
		
		Select obj2 = new Select(drop2);
		obj2.selectByIndex(11);
		
		WebElement drop3 = driverObj.findElement(By.id("year"));
		
		Select obj3 = new Select(drop3);
		
		obj3.selectByVisibleText("1992");
		
		driverObj.findElement(By.xpath("//input[@type='radio']")).click();

	}

}
