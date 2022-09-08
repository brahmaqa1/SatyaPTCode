package ActionsClassBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShiftTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		Actions act = new Actions(driver);
		//*********************************************
		act.sendKeys(Keys.TAB).perform();
		
		// enetr "RAMU" in first name text box
		// press shift + ramu
		act.keyDown(Keys.SHIFT).sendKeys("ramu").perform();
		act.keyUp(Keys.SHIFT).perform();
		
		// pree tab to move the focus on Last anme textbox 
		act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.SHIFT).sendKeys("rao").perform();
		act.keyUp(Keys.SHIFT).perform();
		// or 
//		act.sendKeys(Keys.NULL).perform();// not working check it later
		
		act.sendKeys(Keys.TAB).sendKeys("my test").perform();
		act.sendKeys(Keys.TAB).sendKeys("password").perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT).perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
		
				
		System.out.println("ends here");
	}

}
