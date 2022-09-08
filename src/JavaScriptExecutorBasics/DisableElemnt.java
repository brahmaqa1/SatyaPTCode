package JavaScriptExecutorBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		// Creation driver object from chrome browser
		WebDriver driver = new ChromeDriver();
		//open url in browser
//		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/disabled.html");
//
//		//		driver.findElement(By.name("firstname")).sendKeys("Rau");
//		//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
//
//
//		driver.findElement(By.name("enable")).click();
//
//		driver.findElement(By.name("firstname")).sendKeys("Rau");


		//*****************
		// open url in browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/hidden.html");

		//*********************************

//		driver.findElement(By.id("show-textbox")).click();
		
		// document.getElementById("displayed-text").value="Ram";
//						driver.findElement(By.id("displayed-text")).sendKeys("Raju");
		// ElementNotInteractableException: element not interactable, if ele is not visisble 

		WebElement textbox= driver.findElement(By.id("displayed-text"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Raju';", textbox);

		driver.findElement(By.id("show-textbox")).click();

		String val= textbox.getAttribute("value");
		System.out.println("val="+val);//val=Raju

		System.out.println("end ");

	}

}
