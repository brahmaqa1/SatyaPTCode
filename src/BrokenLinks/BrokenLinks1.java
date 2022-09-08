package BrokenLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		// Creation driver object from chrome browser
		WebDriver driver = new ChromeDriver();
		//open url in browser
		
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement>  allLinks=  driver.findElements(By.xpath("//a"));
//	 for(WebElement  eachLink : allLinks)
		for(int i=0;i<=allLinks.size()-1;i++)
		 
	 {
//		eachLink.click(); 
			allLinks.get(i).click();
		//*[text()='Your file couldn’t be accessed']
		try {
			if(driver.findElement(By.xpath("//*[text()='Your file couldn’t be accessed']")).isDisplayed())
			{
//				System.out.println("Link="+ eachLink.getText() + "-  is broken link");
				System.out.println("Link="+ allLinks.get(i).getText() + "-  is broken link");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println("Link="+ eachLink.getText() + "-  is not broken link");
			System.out.println("Link="+ allLinks.get(i).getText() + "-  is not broken link");
		}
		
		driver.navigate().back();
		
//		Thread.sleep(5000);
		// "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
		 
		allLinks=  driver.findElements(By.xpath("//a"));
		
		
	 }
		
		

	}

}
