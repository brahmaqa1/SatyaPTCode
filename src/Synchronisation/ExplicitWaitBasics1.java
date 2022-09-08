package Synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitBasics1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		//****************************
		//		1. implcit wait  :   global time out - we define only once and applicable for each findlement()
		//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// old 		
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // new 

		driver.findElement(By.id("alertid1")).click();

		
		WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//  wait for cond=  alert popup is present or not
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("res=" + wait.until(ExpectedConditions.alertIsPresent()));
		
		//ExpectedConditions.titleIs("title");
		//ExpectedConditions.titleContains("title");

	
		//  visibilityOf(ele). visibilityOfElementLocated( by.id("idfirst"))
		//  invisib
		//		ExpectedConditions.invisibilityOf(ele);
		//		ExpectedConditions.invisibilityOfElementLocated(by)
		
		//		ExpectedConditions.textToBe(by , "my google");
		//		ExpectedConditions.textToBePresentInElement(ele, "text")

		// wait for click
		//		ExpectedConditions.elementToBeClickable(by)
		//		ExpectedConditions.elementToBeClickable(ele)

	
		// wait for alert
//		ExpectedConditions.alertIsPresent();
		

		
		System.out.println("ends ");


	}

}
