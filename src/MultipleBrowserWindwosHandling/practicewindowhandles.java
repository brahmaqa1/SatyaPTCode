package MultipleBrowserWindwosHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicewindowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
	
		// click  open login form button   and opens new window
		WebElement loginformbtn = driver.findElement(By.xpath("//button[@id='loginid']"));
		loginformbtn.click();
		
		
			// Click "WebtableAll" button
		WebElement webtableallbtn = driver.findElement(By.xpath("//button[@id='allid']"));
		webtableallbtn.click();
		

		
		//click 'Simple AllObect ' button
		WebElement simpleallobjbtn = driver.findElement(By.xpath("//button[@id='simpleid']"));
		simpleallobjbtn.click();			
		
		//  get opened browsers count
		Set<String> allwindows = driver.getWindowHandles();
		int windowscnt = allwindows.size();
		System.out.println("all windows count is = "+windowscnt);
		
		
		// HW get all titles of opened browser windows
		Iterator<String> it = allwindows.iterator();
		while(it.hasNext())
		{
			String value = it.next();
			System.out.println("value is ="+value);
			String title = driver.switchTo().window(value).getTitle();
			System.out.println("title of the page is ="+title);
			System.out.println("------------");
		}
		
		driver.close();
	}

}
