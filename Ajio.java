package week3.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
		
		ChromeDriver driverObj = new ChromeDriver();
		
		
		driverObj.manage().window().maximize();
		driverObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverObj.get("https://www.ajio.com/");
		
		driverObj.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags");
		driverObj.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		Thread.sleep(2000);
		driverObj.findElement(By.xpath("//label[@class= 'facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(2000);
		driverObj.findElement(By.xpath("//label[@class= 'facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		String text = driverObj.findElement(By.xpath("//div[@class= 'length']")).getText();
		
		System.out.println("text"+ text);
		
		List<WebElement> findElements = driverObj.findElements(By.xpath("//div[@class= 'brand']"));
		
		for (WebElement webElement : findElements) {
			
			System.out.println(webElement.getText());
			
		}
		
		List<WebElement> findElements2 = driverObj.findElements(By.xpath("//div[@class= 'name']"));
		
		for (WebElement webElement : findElements2) {
			System.out.println(webElement.getText());
		}
		
	}

}
