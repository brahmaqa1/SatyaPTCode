package ActionsClassBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickByActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		//*************************
		//  move mouse on 'Tool tip sumanth link' ele and click 
		
		Actions act = new Actions(driver);
		WebElement  ToolTipSumanthLinkEle =  driver.findElement(By.linkText("ToolTip Sumanth"));
//		act.moveToElement(ToolTipSumanthLinkEle).click().perform( );
//		or   2nd ways
		act.click(ToolTipSumanthLinkEle).perform();
		
		//  HW double click on some link
		//act.doubleClick(ToolTipSumanthLinkEle).perform(); // it will invokes ToolTip Sumanth link page
		
//		Webleemnt - Interface we dont have doubleclick()
		
		
		//*******************
		
		
				
		System.out.println("ends ");
		

	}

}
