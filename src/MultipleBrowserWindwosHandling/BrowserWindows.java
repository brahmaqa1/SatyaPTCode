package MultipleBrowserWindwosHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
	
		// click  open login form button   and opens new window
		driver.findElement(By.id("loginid")).click();
		
		//  get opened browsers count
		Set<String>  allWindows=  driver.getWindowHandles();
		
		int BrowsersCnt= allWindows.size();
		System.out.println("BrowsersCnt= " +BrowsersCnt);// BrowsersCnt= 2
		
		// get all browser windows addresses
		Iterator<String>  it= allWindows.iterator();
		String browser1Address= it.next();
		System.out.println("browser1Address=" + browser1Address);
		
		String browser2Address= it.next();
		System.out.println("browser2Address=" + browser2Address);
//		browser1Address=CDwindow-12F0260CBD5E56CAC21F3590471C8C5E
//	    browser2Address=CDwindow-E3DBFD62AC7B1C14BB75788EB97C9B10
		
		// switch to browser 2
		driver.switchTo().window(browser2Address);
			driver.findElement(By.id("userid")).sendKeys("Raju");	
			driver.findElement(By.id("pwdid")).sendKeys("mercury");		
//		driver.switchTo().defaultContent();//  ctrl goes to main page--  browser 1 -
			// Note : not needed - driver.switchTo().defaultContent();
//			driver.close();// close 2nd browser window
		
		
//		driver.findElement(By.name("lastname")).sendKeys("Last anme");// error
		//NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='lastname']"}
		
		driver.switchTo().window(browser1Address);
		driver.findElement(By.name("lastname")).sendKeys("Last anme");
		String lastnametexboxval= driver.findElement(By.name("lastname")).getAttribute("value");
		System.out.println("get vla form last nme= " + lastnametexboxval);
		//get vla form last nme= Last anme
//		driver.close();
		
		driver.quit();
		
			
		System.out.println("ends");
		

	}

}
