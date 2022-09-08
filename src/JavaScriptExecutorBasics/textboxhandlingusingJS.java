package JavaScriptExecutorBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textboxhandlingusingJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open url in browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		//clear value from first name text box using JS
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"idfirst\").value=\"\";");
		Thread.sleep(2000);
		
		//Enter value in first name text box using JS
		js.executeScript("document.getElementById('idfirst').value=\"satya\";");
		js.executeScript("document.getElementById('idfirst').value='satya2';");
		Thread.sleep(2000);
		
		
		// get val from textbox 
		Object valFromtextbox= js.executeScript("return document.getElementById('idfirst').value;");
		System.out.println("valFromtextbox="+valFromtextbox);// valFromtextbox=satya2
		
		
		//get class name prop  from firstname text box by using JS
//		Object classAttributevalue = js.executeScript("document.getElementById(\"idfirst\").getAttribute(\"class\");");
//		System.out.println("classAttributevalue  ="+classAttributevalue); //classAttributevalue  =null, we must write return statement 
		Object classAttributevalue = js.executeScript("return document.getElementById(\"idfirst\").getAttribute(\"class\");");
		System.out.println("classAttributevalue  ="+classAttributevalue); // classAttributevalue  =firstclass
	
		// if attribute is not exist for element, it returns 'null'
		Object hrefAttbtval = js.executeScript("return document.getElementById(\"idfirst\").getAttribute(\"href\");");
		System.out.println("hrefAttbtval  ="+hrefAttbtval); //hrefAttbtval  =null, href attribute value is not present in firstname tag.
		
		
		

	}

}
