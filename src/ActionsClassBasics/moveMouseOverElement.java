package ActionsClassBasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class moveMouseOverElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/MenuDesciption.html");
		// Actions:  Class is Selenium API
		Actions act =  new Actions(driver);
		
		WebElement W3schoolsEle=  driver.findElement(By.id("id1"));
		//  move mouse over on desired ele - W3schoolsEle 		
		act.moveToElement(W3schoolsEle).perform();
		//  takes some time --- use explicit wait
		
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBe(By.id("tip"), "W3Schools is the best Web Developers resource on the Web"));
//		wait.until(ExpectedConditions.textToBe(By.id("tip"), "W3Schools is the best Web Developers resource on the Web23"));
		//TimeoutException: Expected condition failed: waiting for element found by By.id: tip to have text "W3Schools is the best Web Developers resource on the Web23". Current text: "W3Schools is the best Web Developers resource on the Web" (tried for 5 second(s) with 500 milliseconds interval)
		
		
		// get desription text  
		String W3schoolsEletext = driver.findElement(By.id("tip")).getText();
		System.out.println("W3schoolsEletext ="+W3schoolsEletext);
		
		
		
		// Hw  move mouse to 'Internet Explorer' Element  and get desription text  
		WebElement internetexplorerEle =  driver.findElement(By.id("id2"));
		act.moveToElement(internetexplorerEle).perform();
		String internetexplorerEletxt =  driver.findElement(By.id("tip")).getText();
		System.out.println("internetexplorerEletxt ="+internetexplorerEletxt);

		// HW  move mouse to   "Netscape Navigator" ele  and get desription text
		
		WebElement NetscapeNavigatorEle = driver.findElement(By.id("id3"));
		act.moveToElement(NetscapeNavigatorEle).perform();
		String NetscapeNavigatorEleTxt = driver.findElement(By.id("tip")).getText();
		System.out.println("NetscapeNavigatorEleTxt   ="+NetscapeNavigatorEleTxt);
				
		System.out.println("ends ");
		

	}

}
