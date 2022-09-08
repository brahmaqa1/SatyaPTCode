package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class allbottonsbasics {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		//****************************
		List<WebElement> allbottonele =   driver.findElements(By.xpath("//button"));
		int bottonelecnt = allbottonele.size();
		System.out.println("bottonelecnt  ="+bottonelecnt);


		int i;
		for (i=0;i<=bottonelecnt-1;i++)
		{
			WebElement selbtnele =  allbottonele.get(i);
			String txtfrmselbtnele = selbtnele.getText();
			System.out.println("txtfrmselbtnele   ="+txtfrmselbtnele);
			selbtnele.click();
			Thread.sleep(3000);
			allbottonele =   driver.findElements(By.xpath("//button"));
			// if we dont get findElements() again (like -->allbottonele =   driver.findElements(By.xpath("//button")); )., 
			//we get .StaleElementReferenceException: stale element reference: element is not attached to the page document

			
		}

	}

}
