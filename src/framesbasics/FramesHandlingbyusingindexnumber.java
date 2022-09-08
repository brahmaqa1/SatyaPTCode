package framesbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandlingbyusingindexnumber {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/iframes.html");
		
		//
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rama");
//		NoSuchElementException: no such element: Unable to locate element: 
		//{"method":"xpath","selector":"//input[@name='firstname']"}
		// check elemnt is in frame
		// swicth control to frame
		//1 .
		WebElement testEle =  driver.findElement(By.name("myname"));
		testEle.sendKeys("MY TEST");
		
		//How to get number of frames available ?
		List<WebElement> framesEle = driver.findElements(By.xpath("//div[@class='box']"));
		int framesElecnt = framesEle.size();
		System.out.println("framesElecnt ="+framesElecnt);
	
		driver.switchTo().frame(0);
		WebElement firstnameEle = driver.findElement(By.name("firstname"));
		firstnameEle.clear();
		firstnameEle.sendKeys("satya");
		WebElement lastnameEle = driver.findElement(By.name("lastname"));
		lastnameEle.clear();
		lastnameEle.sendKeys("narayana");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		WebElement usernameEle = driver.findElement(By.xpath("//input[@id='userid']"));
		usernameEle.sendKeys("satya");
		WebElement pwdEle = driver.findElement(By.id("pwdid"));
		pwdEle.sendKeys("narayana");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
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
