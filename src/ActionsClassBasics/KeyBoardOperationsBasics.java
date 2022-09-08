package ActionsClassBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardOperationsBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		Actions act = new Actions(driver);
		//*********************************************
		//press tab 
		//   focus on first name ele by pressing tab
//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(1000);
//		
//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(1000);
//		
//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(1000);
//		
//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(1000);
//		
//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(1000);
		
		//**********************
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
//		act.sendKeys("Rama");
		act.sendKeys("Rama").perform();;
		
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
//		act.sendKeys("rao");
		act.sendKeys("rao").perform();;
		
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
//		act.sendKeys("test fild");
		act.sendKeys("test fild").perform();
		
//		act.sendKeys(Keys.TAB).perform();
//		Thread.sleep(1000);
////		act.sendKeys("password");//???? not working
//		act.sendKeys("password").perform();//  not working as we did not use perform() at end 
		// perform() is compullsory at end 
		
		WebElement pwdEle=  driver.findElement(By.id("idpwd"));
		act.moveToElement(pwdEle).click().sendKeys("Mypassword").perform();
		
				
		System.out.println("ends here");
	}

}
