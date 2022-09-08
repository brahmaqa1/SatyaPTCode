package ActionsClassBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdownhandlingusingactionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
	//*********************************************	
		// *********1st way******
		Actions act = new Actions(driver);
		
//		driver.findElement(By.name("cars")).click();
//		Thread.sleep(1000);
//		
//		act.sendKeys("m").sendKeys(Keys.ENTER).perform();
		
		//*********************************
		//******2nd way*********
		WebElement carsdropdownEle = driver.findElement(By.name("cars"));
		act.moveToElement(carsdropdownEle).click().sendKeys("m").sendKeys(Keys.ENTER).perform();
		//**************************
		Thread.sleep(1000);
		//choose yamaha from bikes dropdown ?
		WebElement bikesdropdownEle = driver.findElement(By.id("bikesid"));
		act.moveToElement(bikesdropdownEle).click().sendKeys("y").sendKeys(Keys.ENTER).perform();
		
		// select maruthi and audi from multi dropdown element?
		WebElement MaruthivaldropdownEle =  driver.findElement(By.xpath("//select//option[@value='Maruthival']"));
		//act.moveToElement(MaruthivaldropdownEle).click().keyDown(Keys.SHIFT).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
		WebElement audiEle = driver.findElement(By.xpath("//select[@name='MultiCars']//option[@value='audival']"));
		
		act.moveToElement(MaruthivaldropdownEle).click().perform();
		act.keyDown(Keys.CONTROL).moveToElement(audiEle).click().keyUp(Keys.CONTROL).perform();
		
		
		System.out.println("ends here");
	}

}
