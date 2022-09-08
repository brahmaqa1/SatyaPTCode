package JavaScriptExecutorBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonshandlingusingJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		// Creation driver object from chrome browser
		WebDriver driver = new ChromeDriver();
		//open url in browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		//identify male radio button and click on it using JAVA SCRIPT
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"maleid\").click();");
		
		//verify male radio button is clicked or not
		Object maleradiobtnEle = js.executeScript("return document.getElementById(\"maleid\").checked");
		System.out.println("maleradiobtnEle is enabled ="+maleradiobtnEle); //maleradiobtnEle is enabled =true
		//maleradiobtnEle is enabled =true
		
		//uncheck the male radio button
//		js.executeScript("return document.getElementById(\"maleid\").checked='false'"); 
		// unchecking the radio button is not possible,for this we have to click on female button
		
		//click on female radio button by using JS
		js.executeScript("document.getElementById(\"femaleid\").click();");
		Thread.sleep(1000);
		
		//check is female radio button is checked or not
		Object  maleradiobtn = js.executeScript("return document.getElementById(\"maleid\").checked;");
		System.out.println(" Is maleradiobtn enabled  ="+maleradiobtn);//Is maleradiobtn enabled  =false
		
		//check is male radio button is checked or not
		Object  femaleradiobtn = js.executeScript("return document.getElementById(\"femaleid\").checked;");
		System.out.println("Is femaleradiobtn enabled ="+femaleradiobtn); //Is femaleradiobtn enabled =true
		
		js.executeScript("document.getElementById(\"femaleid\").checked=false");
		js.executeScript("document.getElementById(\"maleid\").checked=true");
		

	}

}
