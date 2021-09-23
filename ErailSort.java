package week3.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {
	
//	Launch the browser
	
//	Launch the URL - https://erail.in/
	
//	Uncheck the check box - sort on date
	
//	clear and type in the source station 
	
//	clear and type in the destination station
	
//	Find all the train names using xpath and store it in a list
	
//	Use Java Collections sort to sort it and then print it

	public static void main(String[] args) throws InterruptedException {
		
		List<String> ActualWebElementsList = new ArrayList<String>();
		
		List<WebElement> listOfElements = new ArrayList<WebElement>();
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driverObj = new ChromeDriver();
		
		
		driverObj.manage().window().maximize();
		driverObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverObj.get("https://erail.in/");
		
		driverObj.findElement(By.id("chkSelectDateOnly")).click();
		driverObj.findElement(By.id("txtStationFrom")).clear();
		driverObj.findElement(By.id("txtStationFrom")).sendKeys("Madurai Jn",Keys.ENTER);
		Thread.sleep(2000);
		driverObj.findElement(By.id("txtStationTo")).clear();
		driverObj.findElement(By.id("txtStationTo")).sendKeys("New Delhi" ,Keys.ENTER);
		//driverObj.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
	    List<WebElement> findElements = driverObj.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr/td[2]"));
	    
	    
	    //sortedWebElements =  Collections.sort(findElements);
	    for (WebElement webElement : findElements) {
		
	    	ActualWebElementsList.add(webElement.getText());
		
	}
	    
	    Collections.sort(ActualWebElementsList);
	    
	    System.out.print("Sorted WebElement"+ActualWebElementsList );
	
	

	}

}
