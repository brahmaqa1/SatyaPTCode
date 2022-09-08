package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkboxes {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		//****************************
		//Click I have a bike checkbox
		
		WebElement checkboxele =  driver.findElement(By.id("bikeid"));
		checkboxele.click();
		
		// selected or not
		
		boolean checkboxeleSelected= checkboxele.isSelected();
		System.out.println("checkboxeleSelected="+checkboxeleSelected); //checkboxeleSelected=true
		
		// dispalyed 
		boolean checkboxeledisplayed = checkboxele.isDisplayed();
		System.out.println("checkboxeledisplayed ="+ checkboxeledisplayed); //checkboxeledisplayed =true
		
		// enabled 
		boolean checkboxeleenabled = checkboxele.isEnabled();
		System.out.println("checkboxeleenabled ="+ checkboxeleenabled); //checkboxeleenabled =true

		//HW   unselect checkbox 
		
		// HW : check selected 
		
	}

}
