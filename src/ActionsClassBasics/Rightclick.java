package ActionsClassBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		// Actions:  Class is Selenium API
		Actions act =  new Actions(driver);
		
		//  right click on  ToolTipSumanthLinkEle
		WebElement  ToolTipSumanthLinkEle =  driver.findElement(By.linkText("ToolTip Sumanth"));
	
		act.contextClick(ToolTipSumanthLinkEle)	.perform();	
		Thread.sleep(1000);
		
		
		// HW  or 2n ways  move mouse over to element  and right click 
		WebElement ToolTipLinkEle = driver.findElement(By.linkText("ToolTip Link"));
		act.moveToElement(ToolTipLinkEle).contextClick().perform();
		
		System.out.println("ends ");
		

	}

}
