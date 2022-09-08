package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronistaionBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		//****************************
//		1. implcit wait  :   global time out - we define only once and applicable for each findlement()
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("Ramu");
		
		
		driver.findElement(By.name("lastname")).sendKeys("My last ");
		
		driver.findElement(By.id("testid3456")).sendKeys("My text");
		
		//   intentionally we gave invlaid  id locator 
//		driver.findElement(By.id("testid")).sendKeys("My last ");
		// NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#testid"}
		//  error as html page does not have id= 'testid '
		
		System.out.println("starts ");
		//   check implicitly wait is aplicable for  findElements() alos 
		driver.findElements(By.name("invalid"));
		
		System.out.println("ends ");
		

	}

}
