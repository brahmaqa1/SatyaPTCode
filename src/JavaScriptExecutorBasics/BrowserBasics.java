package JavaScriptExecutorBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		// 
		JavascriptExecutor js = (JavascriptExecutor)driver;

		///  bascis :  alert("Hi ram"); 
//		js.executeScript("alert(\"Hi ram\");");
		
		Object otitle= js.executeScript("return document.title;");
		System.out.println("title="+ otitle);
		
		// HW get url 
		Object url = js.executeScript("return document.URL;");
		System.out.println("url is ="+url);
		//get firstname element by using java script and enter value as satya
		//document.getElementById("idfirst").value="satya";
		js.executeScript("document.getElementById(\"idfirst\").value=\"satya\";");
		Thread.sleep(2000);
		js.executeScript("document.getElementById(\"idfirst\").value=\"\";");
		
		//get last name Element by using java script and enter value as kummari  ---??????????????
		
		
		
	
		System.out.println("ends");
		
		



	}

}
