package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driverObj = new ChromeDriver();

		driverObj.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		driverObj.manage().window().maximize();

		driverObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driverObj.findElement(By.name("UserFirstName")).sendKeys("Sangumithra");

		driverObj.findElement(By.name("UserLastName")).sendKeys("Ashokan");

		driverObj.findElement(By.name("UserEmail")).sendKeys("mithraaashokan@gmail.com");

		driverObj.findElement(By.name("CompanyName")).sendKeys("TeastLeaf");

		driverObj.findElement(By.name("UserPhone")).sendKeys("84793271");
		// DropDown 1
		WebElement dropDown1 = driverObj.findElement(By.name("UserTitle"));

		Select obj1 = new Select(dropDown1);

		obj1.selectByValue("IT_Manager_AP");

		// DropDown 2
		WebElement dropDown2 = driverObj.findElement(By.name("CompanyEmployees"));

		Select obj2 = new Select(dropDown2);

		obj2.selectByValue("250");

		// DropDown 3
		WebElement dropDown3 = driverObj.findElement(By.name("CompanyCountry"));

		Select obj3 = new Select(dropDown3);

		obj3.selectByValue("IN");
		// DropDown 4
		WebElement dropDown4 = driverObj.findElement(By.name("CompanyState"));

		Select obj4 = new Select(dropDown4);

		obj4.selectByValue("Assam");

		Thread.sleep(300);

		driverObj.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();

		// driverObj.close();

	}

}
