package BrokenLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		// Creation driver object from chrome browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//open url in browser
		
		// get all links names
		
//		List<WebElement>  allLinks=	driver.findElements(By.tagName("a"));
//
//		for(int i=0;i<=allLinks.size()-1 ;i++)
//		{
//			String Linktext= allLinks.get(i).getText();
////			System.out.println("click link ="+Linktext);
//			allLinks.get(i).click();
//			
//			try {
//				if(driver.findElement(By.xpath("//*[text()='Your file couldn’t be accessed']")).isDisplayed())
//				{
////					System.out.println("Link="+ eachLink.getText() + "-  is broken link");
//					System.out.println("Link="+Linktext + "-  is broken link");
//				}
//				
//			} catch (Exception e) {
//				// TODO: handle exception
////				System.out.println("in catch ");
////				System.out.println("Link="+ eachLink.getText() + "-  is not broken link");
//				
////				System.out.println("Link="+ Linktext + "-  is not broken link");
//			}
//			
////			System.out.println("go back to homepage");
//			driver.navigate().back();
////			driver.navigate().refresh();// getttin staleele..- does not fix error 
//			allLinks=	driver.findElements(By.tagName("a"));//  fixing stale element 
//			
//			//StaleElementReferenceException: stale element reference: element is not attached to the page document
//					
//		}

		// 2
		List<WebElement>  allLinks=	driver.findElements(By.tagName("a"));

		for(int i=0;i<=allLinks.size()-1 ;i++)
		{
			String Linktext= allLinks.get(i).getText();
//			System.out.println("click link ="+Linktext);
			allLinks.get(i).click();
			
			int cnt= driver.findElements(By.xpath("//*[text()='Your file couldn’t be accessed']")).size();
			
			if(cnt==1)
			{
				System.out.println("Link="+Linktext + "-  is broken link");
			}
			else
			{
				System.out.println("Link="+ Linktext + "-  is not broken link");
			}
			
//			System.out.println("go back to homepage");
			driver.navigate().back();
//			
			allLinks=	driver.findElements(By.tagName("a"));//  fixing stale element 
			
			//StaleElementReferenceException: stale element reference: element is not attached to the page document
					
		}

		System.out.println("Ends ");
		
		

	}

}
