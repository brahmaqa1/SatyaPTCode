package JavaScriptExecutorBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptWith2Args {
	public static WebDriver driver;
	
	int a;
	float f;
	
	
//	getVal_FromTextbox_Using_JavaScript("//input[@name='firstname']", "Raju");
 public static void EnterVal_FromTextbox_Using_JavaScript(String myxpath, String valToBeEntered)
 {	 
	//clear value from first name text box using JS
			JavascriptExecutor js = (JavascriptExecutor)driver;			
			System.out.println("driver="+ driver);
			WebElement  firstNameTextboxEle =  driver.findElement(By.xpath(myxpath));
			js.executeScript("arguments[0].value='" +valToBeEntered+ "';", firstNameTextboxEle);	
			
 }
 
 public static String getVal_FromTextbox_Using_JavaScript(String myxpath)
 {	 
	//clear value from first name text box using JS
			JavascriptExecutor js = (JavascriptExecutor)driver;	
			WebElement  firstNameTextboxEle =  driver.findElement(By.xpath(myxpath));
			Object valFromTextbox =js.executeScript("return arguments[0].value;", firstNameTextboxEle);
			System.out.println("valFromTextbox="+ valFromTextbox);
			return valFromTextbox.toString();
 }
 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		 driver = new ChromeDriver();
		//open url in browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
//		//clear value from first name text box using JS
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		WebElement  firstNameTextboxEle =  driver.findElement(By.name("firstname"));
//		js.executeScript("arguments[0].value='Ramu';", firstNameTextboxEle);
//		
//		Object valFromTextbox =js.executeScript("return arguments[0].value;", firstNameTextboxEle);
//		System.out.println("valFromTextbox="+ valFromTextbox);
//		
		EnterVal_FromTextbox_Using_JavaScript("//input[@name='firstname']", "Raju");
		String val= getVal_FromTextbox_Using_JavaScript("//input[@name='firstname']");
		System.out.println("val="+ val);	
	
		
		EnterVal_FromTextbox_Using_JavaScript("//input[@name='lastname']", "rao");
		val= getVal_FromTextbox_Using_JavaScript("//input[@name='lastname']");
		System.out.println("val="+ val);

		
		EnterVal_FromTextbox_Using_JavaScript("//input[@id='testid3456']", "Raju");
		val= getVal_FromTextbox_Using_JavaScript("//input[@id='testid3456']");
		System.out.println("val="+ val);
	}

}
