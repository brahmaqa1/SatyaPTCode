package ActionsClassBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PressCtrlAandDelete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		Actions act = new Actions(driver);
		//*********************************************
		// press tab and delete  and send data 	
//		act.sendKeys(Keys.TAB).perform();
//		act.sendKeys(Keys.DELETE).perform();		
//		act.sendKeys("Raju").perform();
//		
		
		//********************
//		click first name textbox, press ctrl + A , delete
//		driver.findElement(By.name("firstname")).click();
//		act.sendKeys(Keys.CONTROL).sendKeys  ("A").sendKeys(Keys.DELETE).perform();//  wont work . dont use like this
		
		//  send 
//		driver.findElement(By.name("firstname")).sendKeys(Keys.chord("));??/  Recheck later
		driver.findElement(By.name("firstname")).click();
		act.keyDown(Keys.CONTROL).sendKeys("A").sendKeys(Keys.DELETE).perform();
		act.keyUp(Keys.CONTROL).perform();
		act.sendKeys("value is deleted").perform();
		
			
		
		// press tab and Rao
		
				
		System.out.println("ends here");
	}

}
