package framesbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandlingbyusingnameorid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/iframes.html");
		
		WebElement testEle = driver.findElement(By.name("myname"));
		testEle.sendKeys("MYTEST");
		// frame1
		
		driver.switchTo().frame("iframe1name");
			WebElement firstnameEle = driver.findElement(By.name("firstname"));
			firstnameEle.clear();
			firstnameEle.sendKeys("satya");
			WebElement lastnameEle = driver.findElement(By.name("lastname"));
			lastnameEle.sendKeys("narayana");
		driver.switchTo().defaultContent();
		
		// frame2
		driver.switchTo().frame("iframe2name");
			WebElement usernameEle = driver.findElement(By.name("username"));
			usernameEle.sendKeys("satya");
			WebElement passwordEle = driver.findElement(By.name("password"));
			passwordEle.sendKeys("narayana");
		driver.switchTo().defaultContent();
		
		//frame3
		
		driver.switchTo().frame("iframe3name");
			WebElement clickmebtnEle = driver.findElement(By.xpath("//button[@type='button']"));
			clickmebtnEle.click();
			Thread.sleep(2000);
			clickmebtnEle.click();
			Thread.sleep(2000);
			clickmebtnEle.click();
			Thread.sleep(2000);
			clickmebtnEle.click();
			Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		
		
		
		
		System.out.println("ends");
		
	
		

	}

}
