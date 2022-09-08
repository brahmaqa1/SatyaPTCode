package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonBasics {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		//****************************
		
		String buttonele1 =  driver.findElement(By.cssSelector("button[id='loginid']")).getText();
		System.out.println("buttonele1  =  "+buttonele1);   //buttonele1  =  open loginform
		
		WebElement button1 =  driver.findElement(By.cssSelector("button[id='loginid']"));
		button1.click();
		
		Thread.sleep(2000);
		
		
		
		// is displayed
		boolean isbutton1Displayed = button1.isDisplayed();
		System.out.println("isbutton1Displayed  = "+isbutton1Displayed); //isbuttonDisplayed  = true
		
		
		Thread.sleep(2000);
		
		
		String buttonele2 =  driver.findElement(By.cssSelector("button[id='allid']")).getText();
		System.out.println("buttonele2  =  "+buttonele2);  //buttonele2  =  WebTableAll
		
		WebElement button2 =  driver.findElement(By.cssSelector("button[id='allid']"));
		button2.click();
		
		// is displayed
				boolean isbutton2Displayed = button2.isDisplayed();
				System.out.println("isbutton2Displayed  = "+isbutton2Displayed);  //isbutton2Displayed  = true
		
				
				
		

	}

}
