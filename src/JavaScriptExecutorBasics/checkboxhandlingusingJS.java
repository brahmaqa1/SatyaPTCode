package JavaScriptExecutorBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxhandlingusingJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		// Creation driver object from chrome browser
		WebDriver driver = new ChromeDriver();
		//open url in browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		//identify male radio button and click on it using JAVA SCRIPT
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('bikeid').click();");
		// get sttaus of checkbox selected or not 
		Object status = js.executeScript("return document.getElementById('bikeid').checked;");
		System.out.println("status  ="+status);
		Thread.sleep(2000);
		// unclick
		js.executeScript("document.getElementById('bikeid').click();");
		Thread.sleep(2000);
		//  click by  using checked = true
		js.executeScript("document.getElementById('carid').checked=true;");
		Object bikeidchkdstatus = js.executeScript("return document.getElementById('carid').checked");
		String bikeidchkdststustxt = bikeidchkdstatus.toString();
		System.out.println("bikeidchkdststustxt  ="+bikeidchkdststustxt);
		Thread.sleep(2000);
		// click by  using c checked = false
		js.executeScript("document.getElementById('carid').checked=false;");
		Object bikeidunchkdstatus = js.executeScript("return document.getElementById('bikeid').checked");
		String bikeidunchkdstatustxt = bikeidunchkdstatus.toString();
		System.out.println("bikeidunchkdstatustxt  ="+bikeidunchkdstatustxt);		
	}

}
