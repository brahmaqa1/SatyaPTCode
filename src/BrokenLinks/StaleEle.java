package BrokenLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		// Creation driver object from chrome browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open url in browser
		
		// get all links names
		
		List<WebElement>  allLinks=	driver.findElements(By.tagName("a"));

		for(int i=0;i<=allLinks.size()-1 ;i++)
		{
			System.out.println("click link ="+allLinks.get(i).getText());
			allLinks.get(i).click();
			
			driver.navigate().back();
			System.out.println("go back to homepage");
			//StaleElementReferenceException: stale element reference: element is not attached to the page document
			
			allLinks=	driver.findElements(By.tagName("a"));
			
			
		}

		System.out.println("Ends ");

	}

}

