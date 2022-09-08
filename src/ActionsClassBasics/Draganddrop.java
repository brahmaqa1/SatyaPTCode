package ActionsClassBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

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
		
		// get desription text  
		
		
		
		// Hw  move mouse to Internet Explorer  and get desription text  
		

		// HW  move mouse to   Netscape Navigator and get desription text
		
				
		System.out.println("ends ");		

	}

}
