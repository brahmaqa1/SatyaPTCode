package BrokenLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class brokenLinksBySatya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		//allLinks.get(1).click();
		for(WebElement link :allLinks)
		{
			allLinks = driver.findElements(By.tagName("a"));
			String linkText= link.getText();
			link.click();
		try {
			if(driver.findElement(By.xpath("//div//p[contains(text(),'It may have been moved, edited, or deleted.')]")).isDisplayed())
			{
				System.out.println(linkText+" - it is a broken link ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(linkText+" - it is not a broken link ");
		}
			
		    driver.navigate().back();
			allLinks = driver.findElements(By.tagName("a"));	
			
		}
		
		//**************************************
//		
//		for(int i=0;i<=count-1;i++)
//		{
//			WebElement link = allLinks.get(i);
//			String linktext= link.getText();
//			link.click();
//			try {
//				if(driver.findElement(By.xpath("//div//p[contains(text(),'It may have been moved, edited, or deleted.')]")).isDisplayed())
//					{
//						System.out.println(linktext+"-it is a broken link =");
//					}
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println(linktext +" -it is not a broken link");
//			}
//			 driver.navigate().back();
//				allLinks = driver.findElements(By.tagName("a"));
//		}
		System.out.println("ends");

	}

}
